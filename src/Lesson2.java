import utils.CountingDivisorService;

import java.util.ArrayList;
import java.util.List;

import static utils.SummingService.sumDigit;

/*
- Pocwiczyc debugowanie
- Po angielsku pieszemy zadania
- DRY - don't repeat yourself
- SOLID Java


 */

// definicja zminnych

// odpalasz jakas metode

// drukujesz wynik



public class Lesson2 {
    /*
     dla wszystkich liczb <2, 1000>
     wypisz liczba -> suma jej cyfr
      np:..
      ....
      941 = 14
      ....
     */

    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            int sum;
            sum = sumDigit(i);
            System.out.println(i + " = " + sum);
        }
    }

    public static void main2(String[] args) {
        List<Integer> lista = new ArrayList<>();
        int NumberofDivisior = 0;
        CountingDivisorService.countingDivisor(NumberofDivisior);
        System.out.println(lista);
    }

    // test

}

