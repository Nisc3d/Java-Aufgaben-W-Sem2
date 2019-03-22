package Aufgabe2;

public class Main {
    public static void main(String[] args) {
        sort s = new sort();
        int[] array = {9, 4, 3, 1, 6, 5, 7, 8, 2, 10};
        s.printArray(array);
//        s.insertionSort(array);
//        s.printArray(array);
        System.out.println(s.groesterWert(array));




    }

}
