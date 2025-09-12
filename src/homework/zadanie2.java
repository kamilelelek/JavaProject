package homework;

public class zadanie2 {
       /*
    dla wszystkich liczb 4ro cyfrowych wypisz te których suma cyfr dziesiątek i jedności jest równa sumie cyfr setek i tysięcy
    */
       public static void main(String[] args) {
               for (int i = 1000; i < 10000; i++) {
                   int a = i % 10;
                   int b = (i / 10) % 10;
                   int c = (i / 100) % 10;
                   int d = (i / 1000) % 10;
                   if (a + b == c + d) {
                   System.out.println(i+ " = "+ a + " + " + b + " = " + c + " + " + d);
               }

           }
       }
}
