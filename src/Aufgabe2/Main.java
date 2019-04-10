package Aufgabe2;

import java.util.Scanner;

public class Main {
    public final static int NO_KEY = -1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zahl eingebn:");
        int suchzahl = sc.nextInt();
        int ergebnis;

        sort sort = new sort();
        int[] array = sort.initArray(1000);
        sort.printArray(array);
        sort.selectionSort(array);
        sort.printArray(array);

        search search = new search();
        ergebnis = search.binarySearch(array, suchzahl);
        if (ergebnis == NO_KEY){
            System.out.println("Nicht gefunden");
        }
        else{
            System.out.println("Die gesuchte Zahl steht an Stelle " + ergebnis);
        }


    }
}
