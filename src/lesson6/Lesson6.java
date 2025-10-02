package lesson6;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class Lesson6 {

    /*
       Znajdz wyszstkie pliki .java w katalogu workspace - wypisz ktory zajmuje najwiecej bajtow,
        posortuj pliki od najwczesniej stworzonego do najpozniej stworzonego
     */
    public static void main(String[] args) {
        File directory = new File( "C:\\Users\\ja\\REPO\\JavaProject");

        getBiggestFile(directory);

        //getBiggestFile();
        //System.out.println(files);
    }

    public static void getBiggestFile(File directory) {
        File[] files = directory.listFiles();
        long fileZero=0;
        for (File file : files){
            System.out.println("Plik: " + file.getName() + " , has length: " + file.length());
            if (file.length()>fileZero){
                fileZero=file.length();
            }
            //Arrays.stream(files).max(Comparator.comparingInt()).orElseThrow();
            //System.out.println("Plik: " + file.getName() + " , has usable space: " + file.getUsableSpace());
            //System.out.println(files[i]);
            //System.out.println(files[i].length());
        }
        System.out.println("The biggest file is equals: " +fileZero);

    }
 //   File
   // File[] files
}
