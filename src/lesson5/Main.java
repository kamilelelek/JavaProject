package lesson5;

import java.io.IOException;
import java.util.List;

public class Main {
    //Produkt (nazwa, kategoria, cena)
    //https://www.mockaroo.com/ - wygeneruj 100 obiektow produkt - zapisz do JSON, zaczytaj z JSON do app
    //metoda ktora pobiera tablice/liste produktow i znajduje najdozszy produkt
    //ktora jako argument pobiera liste produktow] i jako wynik zwraca ilosc roznych produktow na liscie (produktow w przekazanej liscie moga sie powtarzac)


    public static void main(String[] args) throws IOException {

        ProductService productService = new ProductService();
        List<Product> productsFromJSON = productService.getProductsFromJSON();

        productsFromJSON.forEach(
                System.out::println
        );

        System.out.println("----------------------------------------------");

        List<Product> revertedProducts = productService.revertProducts(productsFromJSON);

        revertedProducts.forEach(
                System.out::println
        );

        System.out.println("----------------------------------------------");

        productService.revertProductsV2(productsFromJSON);

    }

//    public static void main(String[] args) throws IOException {
//
//        ProductService2 productService2 = new ProductService2();
//        List<Product> productsFromJSON = productService2.getProductsFromJSON();
//
//        productsFromJSON.forEach(
//                System.out::println
//        );
//
//    }

}
