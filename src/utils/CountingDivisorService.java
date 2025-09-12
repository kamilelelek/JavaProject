package utils;

public class CountingDivisorService {
    // czy mogą być 2 metody w klasie o tej samej SYGNATURZE
    // private static void countingDivisor(int NumberofDivisior)

    // wypisz wszystkie liczby ktorych ilosc dzielnikow jest liczbą pieerwszą.

    // wyrażenia lambda w Java numberOfDivisor == 2 ? true : false;

    public static int countingDivisor(int number) {
        int numberofDivisor = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                numberofDivisor++;
            }
        }
        return numberofDivisor;
    }

    private static void countingDivisor2(int numberofDivisior) {

    }

    public static boolean isPrime(int number) {

        int numberOfDivisor = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                numberOfDivisor++;
            }
        }

        return numberOfDivisor == 2;
    }

    public static boolean isPrime2(int number) {
        boolean isPrimeNumber;

        int numberOfDivisor = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                numberOfDivisor++;
            }
        }

        if (numberOfDivisor == 2) {
            isPrimeNumber = true;
        } else {
            isPrimeNumber = false;
        }

        return isPrimeNumber;
    }
}