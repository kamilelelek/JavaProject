public class Zadanie1 {
    /*
    Wypisz liczbe z przedzialu <1, 1000> ktora ma najwiecej dzielnikow
     */
    public static void main(String[] args) {

        int liczbaZMaxDzielnikami = 0;
        int maxLiczbaDzielnikow = 0;

        for (int i = 1; i <= 1000; i++) {
            int liczbaDzielnikow = liczDzielniki(i);
            System.out.println(i + " " + liczbaDzielnikow);
            aktualizujDzielniki(i,liczbaDzielnikow,maxLiczbaDzielnikow,liczbaZMaxDzielnikami);

        }

        System.out.println("Liczba z największą liczbą dzielników w przedziale <1,1000>: " + liczbaZMaxDzielnikami);
        System.out.println("Liczba dzielników: " + maxLiczbaDzielnikow);
    }

    private static int liczDzielniki(int i) {
        int liczbaDzielnikow = 0;

        for (int j = 1; j <= i; j++) {
            if (i % j == 0) {
                liczbaDzielnikow++;
            }
        }
        return liczbaDzielnikow;
    }

    private static void aktualizujDzielniki(int i, int liczbaDzielnikow, int maxLiczbaDzielnikow,int liczbaZMaxDzielnikami) {

       if (liczbaDzielnikow > maxLiczbaDzielnikow) {
           maxLiczbaDzielnikow = liczbaDzielnikow;
           liczbaZMaxDzielnikami = i;
       }
    }
}


