package lesson5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class ProductService {
    static List<Product> products = new ArrayList<>();

    public ProductService() throws IOException {
        // wczytanie JSON z resources
        String json = MyJsonReader.readFileAsStringFromResources("MOCK_DATA.json");

        MyJsonReader.JsonReader parser = new MyJsonReader().new JsonReader(json);
        List<Object> parsedList = parser.parseArray();

        for (Object obj : parsedList) {
            if (obj instanceof Map) {
                Map<String, Object> map = (Map<String, Object>) obj;
                String Name = String.valueOf(map.get("Name"));
                String Category = (String) map.get("Category");
                int Price = ((Number) map.get("Price")).intValue();
                products.add(new Product(Name, Category, Price));
            }
        }
    }

    public void getProducts() {
        System.out.println(products);
    }
}
