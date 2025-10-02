package Lessons;

import static utils.CountingDivisorService.countingDivisor;
import static utils.CountingDivisorService.isPrime;
import static utils.SummingService.sumDigit;

public class Lesson3a {
         /*
        dla wszystkich liczb< <2,1000> wypisz wszystkie liczby superPierwsze
        SP to taka ktora sama jest LP i jej suma cyfr tez jest LP
        np: 11 jest lp i 2 (1+1) tez jest LP
         */
    // wypisz wszystkie liczby ktorych ilosc dzielnikow jest liczbą pieerwszą.

    /**
     * Pętla for dla zakresu wyżej
     * sprawdzenie 2 warunków - countingDivisor, solvedigit
     */

    public static void main2(String[] args) {
        for (int i = 2; i < 1000; i++) {
            boolean prime = isPrime(i); //ctrl alt v

            if (prime && isPrime(sumDigit(i))) {
                System.out.println("Liczba: " + i + " jest superpierwsza: " + prime);
            }
        }

    }

    public static void main3(String[] args) {
        for (int i = 2; i < 1000; i++) {
            int numberofDivisior = countingDivisor(i);
            boolean prime = isPrime(numberofDivisior);
            if (prime) {
                System.out.println("Liczba: " + i + " posiada tyle dzielnikow: " + numberofDivisior);
            }
        }
    }


}
