package Aufgabe2;

public class search {
    public final static int NO_KEY = -1;

    public int binarySearch(int[] array, int suchzahl) {
        int untereGrenze = 0, obereGrenze = array.length - 1, mitte = 0;
        while (untereGrenze <= obereGrenze) {
            mitte = (untereGrenze + obereGrenze) / 2;
            if (array[mitte] == suchzahl) {
                return mitte;
            }
            else if (suchzahl < array[mitte]) {
                obereGrenze = mitte - 1;
            }
            else {
                untereGrenze = mitte + 1;
            }
        }
        return NO_KEY;
    }

    public int binarySearchRek(int[] array, int suchzahl, int untereGrenze, int obereGrenze) {
        if (untereGrenze <= obereGrenze) {
            int mitte = (untereGrenze + obereGrenze) / 2;
            if (array[mitte] == suchzahl) {
                return mitte;
            }
            else if (suchzahl < array[mitte]) {
                binarySearchRek(array, suchzahl, untereGrenze, mitte - 1);
            }
            else {
                binarySearchRek(array, suchzahl, mitte + 1, obereGrenze);
            }
        }
        return NO_KEY;
    }
}
