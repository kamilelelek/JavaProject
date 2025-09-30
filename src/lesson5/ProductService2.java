package lesson5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductService2 {

    private List<Product> products = new ArrayList<>();

    public List<Product> getProductsFromJSON() throws IOException {
        // wczytanie JSON z resources
        String json = MyJsonReader.readFileAsStringFromResources("MOCK_DATA.json");
        MyJsonReader.JsonReader parser = new MyJsonReader().new JsonReader(json);
        List<Object> parsedList = parser.parseArray();

        for (Object obj : parsedList) {

            if (obj instanceof Map) {
                Product product = null;
                Map<String, Object> map = (Map<String, Object>) obj;
                String Name = String.valueOf(map.get("Name"));
                String Category = (String) map.get("Category");
                int Price = ((Number) map.get("Price")).intValue();

                product = new Product(Price, Name, Category);
                products.add(product);
            }
        }
        return products;
    }

    public void revertProducts(List<Product> products) {
        // collect(Collectors.toList()) w połączeniu z Comparator.reverseOrder()
        products.reversed();
        System.out.println("Zamieniamy kolejność produktów");
    }
}
