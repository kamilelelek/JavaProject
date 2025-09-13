package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams {
    static void main(String[] args) {
        String slowo = "Kamil";
        List<String> lista = List.of("limak", "kon", "mlot", "mercedes", "Mikal", "kLaMi");
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz slowo: ");
        String slowo=scanner.next();
        System.out.println("wpisz liste slow: ");
        String line = scanner.nextLine();              // wczytuje całą linię
        String[] arr = line.split(" ");                // dzieli po spacji
        List<String> lista = Arrays.asList(arr);*/

        System.out.println(searchAnagrams(lista, slowo));


    }

    public static String reverse(String slowo) {
        char[] arrr = slowo.toCharArray();
        char[] newWord = new char[slowo.length()];
        // j - iterowanie po newWord
        // jak zrobić nromalizację danych werjściowych

        for (int i = 0; i < slowo.length(); i++) {
            newWord[i] = arrr[slowo.length() - 1 - i];
        }

        return new String(newWord);
        // Arrays.sort();
        // bierzemy slowo-> rozbijamy na charry-> bierzemy slowa z listy i normalizujemy dane wejsciowe
        // w kazdej itteracji rozbijamy na charry i porownujemy
        //if slowo == lista dodajemy do nowej listy :)
    }

    public static ArrayList<String> searchAnagrams(List<String> lista, String slowo) {
        slowo = slowo.toLowerCase();
        char[] arr1 = slowo.toCharArray();
        ArrayList<String> Words = new ArrayList<>();
        Arrays.sort(arr1);
        ArrayList<String> Words2 = new ArrayList<>();
        for (String s : lista) {
            String wordList = s.toLowerCase();
            char[] arr = wordList.toCharArray();
            Arrays.sort(arr);
            if (Arrays.equals(arr1, arr)) {
                Words2.add(s);
            }
        }
        return Words2;
    }
}
