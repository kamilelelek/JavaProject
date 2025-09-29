package lesson5;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    //Produkt (nazwa, kategoria, cena)
    //https://www.mockaroo.com/ - wygeneruj 100 obiektow produkt - zapisz do JSON, zaczytaj z JSON do app
    //metoda ktora pobiera tablice/liste produktow i znajduje najdozszy produkt
    //ktora jako argument pobiera liste produktow] i jako wynik zwraca ilosc roznych produktow na liscie (produktow w przekazanej liscie moga sie powtarzac)
    public static void notmain(String[] args) throws IOException {
        // Tworzymy ProductService, który sam wczyta JSON z resources
        ProductService productService = new ProductService();
        productService.getProducts();
    }
}
