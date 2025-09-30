Notatki z lekcji
# 29.09.2025

## Do przeczytania po lekcji
- Marge / Rebase - Git
- Jak działa Git - jakie są etapy życia zmian w Git
- Do wyjaśnienia

```
public List<Product> getProductsFromJSON(List<Product> products) throws IOException {
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
                products.add(new Product(Price, Name, Category));
            }
        }
        return products;
    }
```
czym się różni od 
```
public List<Product> getProductsFromJSON() throws IOException {
        // wczytanie JSON z resources
        String json = MyJsonReader.readFileAsStringFromResources("MOCK_DATA.json");
        List<Product> products = new ArrayList<>();
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
```
i dlaczego pierwsza wersja nie dodanie do listy produktów

- Czym są wyjątki (checked i unchecked) w Java
- Czym się różni podejście z użyciem ProductService i ProductService2