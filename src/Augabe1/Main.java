package Augabe1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eingabe Zahl:");
        int zahl = sc.nextInt();
        if (zahl >= 0) {
            Algorithmen a = new Algorithmen();
            System.out.println("Ergebnis Iterativ Fibonacci: " + a.iterativfib(zahl));
            System.out.println("Ergebnis Rekursiv Fibonacci: " + a.rekursivfib(zahl));
            System.out.println("Ergebnis Iterativ Fakultät: " + a.iterativfak(zahl));
            System.out.println("Ergebnis Rekursiv Fakultät: " + a.rekursivfak(zahl));
        }
        else {
            System.out.println("Bitte natürliche Zahl >= 0 eingeben.");
        }
    }
}

