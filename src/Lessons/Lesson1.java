package Lessons;

import java.util.Scanner;

public class Lesson1 {
    /*
    Java -> 8+, 11, 12, 17, 21
    Tools -> Maven, Gradle
    Frameworks -> Spring (set frameworków -> Spring Boot, Spring Security ...)


    Java
    - obiektowa (nie funkcyjny)
    Samochod.jedz() – metoda obiektu
    jedz(samochod) - metoda funkcyjna

    - java jest kompilowana do bytecode (JVM)
    - java jest głównie do BE


    Typy zmiennych:
    - Liczby całkowite: byte, short, int, long
    - Liczby zmiennoprzecinkowe: float, double
    - Znak: char
    - Logiczny: boolean
    - Tekstu: String

    Operatory:
    - Dodawanie: a + b
    - Odejmowanie: a - b
    - Mnozenie: a * b
    - Dzielenie: a / b
    - Reszte z dzielenia: a % b

    Pętle:
    ...

    Instrukcje warunkowe:
    - if
        if (0>1) {
            System.out.println(liczba + " jest parzysta.");
        } else {
            System.out.println(liczba + " jest nieparzysta.");
        }

        9
     Github
     // git commit

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int a = scanner.nextInt();
         int b = scanner.nextInt();
         // int a =12;
         // int b =5;


        // a = 1, b = 10
        // int c = 1 - 10;
        // System.out.println(c);
        // int d = 1 + 10;
        // int e = 1 * 10;
        // int f = 1 / 10;

        // odejmijLiczby(a, b);
        // pomnozLiczby(a, b);
        // podzielLiczby(a, b);
        System.out.println(dodajLiczby(a, b));
        System.out.println(pomnozLiczby(a, b));
        System.out.println(podzielLiczby(a, b));
        System.out.println(odejmijLiczby(a, b));

        scanner.close();
    }

    private static int dodajLiczby(int a, int b) {
        return a + b;
    }
    private static int odejmijLiczby(int a, int b) {
        return a -b;
    }
    private static int pomnozLiczby(int a, int b) {
        return a*b;
    }
    private static int podzielLiczby(int a, int b) {
        return a/b;
    }




}
