package lesson5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class ProductService {
    List<Product> products = new ArrayList<>();
    public void ProductService(String filePath) throws IOException {
        String json = MyJsonReader.readFileAsString(filePath);

        MyJsonReader.JsonReader parser = new MyJsonReader().new JsonReader(json);

        List<Object> parsedList = parser.parseArray();

        for (Object obj : parsedList) {
            if (obj instanceof Map) {
                Map<String, Object> map = (Map<String, Object>) obj;
                String Name = String.valueOf(((Number) map.get("Name")).longValue());
                String Category = (String) map.get("Category");
                int Price = (int) ((Number) map.get("Price")).doubleValue();
                products.add(new Product(Name, Category, Price));
            }
        }
    }

    public  void getProducts(List<Product> products) {
        System.out.println(products);
    }

}



