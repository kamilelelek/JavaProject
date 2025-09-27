package lesson5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyJsonReader {

    public static void main(String[] args) throws IOException {
        String json = readFileAsString("src/lesson5/MOCK_DATA.json");
        System.out.println(json);
    }

    public static String readFileAsString(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line);
            }
        }
        return content.toString();
    }
    public class JsonReader {
        private final String json;
        private int index = 0;

        public JsonReader(String json) {
            this.json = json.trim();
        }

        private char nextChar() {
            return json.charAt(index++);
        }

        private char peekChar() {
            return json.charAt(index);
        }

        private void skipWhitespace() {
            while (index < json.length() && Character.isWhitespace(peekChar())) {
                index++;
            }
        }

        public Object parseValue() {
            skipWhitespace();
            char c = peekChar();
            if (c == '{') {
                return parseObject();
            } else if (c == '[') {
                return parseArray();
            } else if (c == '"') {
                return parseString();
            } else if (Character.isDigit(c) || c == '-') {
                return parseNumber();
            } else if (json.startsWith("true", index)) {
                index += 4;
                return true;
            } else if (json.startsWith("false", index)) {
                index += 5;
                return false;
            } else if (json.startsWith("null", index)) {
                index += 4;
                return null;
            }
            throw new RuntimeException("Unexpected char: " + c);
        }

        private String parseString() {
            StringBuilder sb = new StringBuilder();
            nextChar(); // skip "
            while (peekChar() != '"') {
                sb.append(nextChar());
            }
            nextChar(); // skip closing "
            return sb.toString();
        }

        private Number parseNumber() {
            StringBuilder sb = new StringBuilder();
            while (index < json.length() &&
                    (Character.isDigit(peekChar()) || peekChar() == '.' || peekChar() == '-')) {
                sb.append(nextChar());
            }
            String num = sb.toString();
            if (num.contains(".")) {
                return Double.parseDouble(num);
            }
            return Long.parseLong(num);
        }

        public java.util.Map<String, Object> parseObject() {
            java.util.Map<String, Object> map = new java.util.HashMap<>();
            nextChar(); // skip {
            skipWhitespace();
            while (peekChar() != '}') {
                String key = parseString();
                skipWhitespace();
                nextChar(); // skip :
                Object value = parseValue();
                map.put(key, value);
                skipWhitespace();
                if (peekChar() == ',') {
                    nextChar();
                    skipWhitespace();
                }
            }
            nextChar(); // skip }
            return map;
        }

        public java.util.List<Object> parseArray() {
            java.util.List<Object> list = new java.util.ArrayList<>();
            nextChar(); // skip [
            skipWhitespace();
            while (peekChar() != ']') {
                Object value = parseValue();
                list.add(value);
                skipWhitespace();
                if (peekChar() == ',') {
                    nextChar();
                    skipWhitespace();
                }
            }
            nextChar(); // skip ]
            return list;
        }
    }

}
