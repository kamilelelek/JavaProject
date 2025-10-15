package lesson6;

import java.io.File;
import java.nio.file.Files;
import java.util.*;

public class Lesson6 {

    /*
       Znajdz wyszstkie pliki .java w katalogu workspace - wypisz ktory zajmuje najwiecej bajtow,
        posortuj pliki od najwczesniej stworzonego do najpozniej stworzonego
     */
    public static void main(String[] args) {
        File directory = new File("C:\\Users\\ja\\REPO\\JavaProject");
        List<File> javaFiles = new ArrayList<>();
        getBiggestFile(directory, javaFiles);
        sortFilesByDate(javaFiles, directory);
    }

    public static void getBiggestFile(File directory, List<File> javaFiles) {
        File[] files = directory.listFiles((dir, name) -> name.endsWith(".java"));
        findJavaFiles(directory, javaFiles);
        if (javaFiles.isEmpty()) {
            System.out.println("Nie znaleziono żadnych plików .java w folderze " + directory.getAbsolutePath());
            return;
        }

       /* for (File file : javaFiles) {
            System.out.println("Plik: " + file.getAbsolutePath() + " , ma długość: " + file.length() + " bajtów");
        }*/
        //Optional<File> fileZero= Optional.of(javaFiles.stream().max(Comparator.comparingLong(File::length)).orElseThrow());
        File biggest = javaFiles.stream()
                .max(Comparator.comparingLong(File::length))
                .orElseThrow();
        System.out.println("Największy plik: " + biggest.getName() + " (" + biggest.length() + " bajtów)");
    }

    private static void findJavaFiles(File directory, List<File> javaFiles) {
        File[] files = directory.listFiles();
        if (files == null) return;

        for (File file : files) {
            if (file.isDirectory()) {
                findJavaFiles(file, javaFiles); // rekurencja – przeszukaj podfolder
            } else if (file.getName().endsWith(".java")) {
                javaFiles.add(file);
            }
        }
    }

    private static void sortFilesByDate(List<File> javaFiles, File directory) {
        findJavaFiles(directory, javaFiles);
        javaFiles.sort(Comparator.comparing(File::lastModified));
        javaFiles.toArray();
        String lastModified = String.valueOf(javaFiles.getFirst());
        System.out.println(lastModified);
    }
}
