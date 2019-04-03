package Aufgabe2;

public class Main {
    public static void main(String[] args) {
        sort s = new sort();
        int[] array = s.initArray(10);
        int[] sortedarray = new int[10];
        s.printArray(array);
        sortedarray = s.mergeSort(array);
        s.printArray(sortedarray);
    }
}
