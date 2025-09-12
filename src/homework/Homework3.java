package homework;

import java.util.ArrayList;
import java.util.LinkedList;

public class Homework3 {
    // Czym się różni int, double, float ?
    // Czym jest typ prosty w Java vs Obiekt
    // Czym się różni ArrayList vs LinkedList vs List (Interface)- sprawdź z którego szybciej można pobrać dane, z którego można szybciej usunąć jakiś element
    // Co to oznacza że Arraylist i LinkedList implementują interface List

    static void main2() {
        ArrayList<String> stringList = new ArrayList<>();
        LinkedList<String> stringList2 = new LinkedList<>();
        stringList.add("Mateusz");
        stringList.add("Kamil");

        char[] arr = stringList.get(0).toCharArray();
        // arr[0]

        for (String a : stringList) {
            System.out.println(a);
        }
    }

    /*
    Napisz metode ktora jako argument pobiera String slowo, oraz Liste slow jako drugi argumentt
    metoda niech zwraca wszystkie anagramy danego slowa z listy slow.
    */

    // DODATOWO : Wprowadź słowo i listę słów z konsoli
    static void main(String[] args) {
        String slowo = "Kamil";
        ArrayList<String> listaSlow = new ArrayList<>();
        // List<String> listaSlow = new ArrayList<>();
        // List<String> listaSlow2 = new LinkedList<>();
        // ArrayList<String> listaSlow3 = new LinkedList<>();
        // LinkedList<String> listaSlow4 = new ArrayList<>();
        // LinkedList<String> listaSlow5 = new List<>();
        // LinkedList<String> listaSlow6 = new List<>();
        listaSlow.add("limak");
        listaSlow.add("kon");
        listaSlow.add("mlot");
        listaSlow.add("mercedes");
        listaSlow.add("amikl");
        String odwroconeSlowo = reverseWord(slowo);
        ArrayList<String> ReceivWord = new ArrayList<>();
        for (int i = 0; i < listaSlow.size(); i++) {
            if (listaSlow.get(i).equalsIgnoreCase(odwroconeSlowo)) {
                ReceivWord.add(listaSlow.get(i));
            }
        }
        System.out.println(ReceivWord);

    }

    public static String reverseWord(String slowo) {
        char[] arrr = slowo.toCharArray();
        char[] newWord = new char[slowo.length()];
        // j - iterowanie po newWord
        // jak zrobić nromalizację danych werjściowych

        for (int i = 0; i < slowo.length(); i++) {
            newWord[i] = arrr[slowo.length() - 1 - i];
        }

        return new String(newWord);
        // Arrays.sort();
    }

}
