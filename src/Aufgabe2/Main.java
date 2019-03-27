package Aufgabe2;

public class Main {
    public static void main(String[] args) {
        sort s = new sort();
        int[] array = s.initArray(10);
        s.printArray(array);
        s.bubbleSort(array);
        s.printArray(array);
    }
}
