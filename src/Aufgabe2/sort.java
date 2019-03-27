package Aufgabe2;

public class sort {

    public int[] initArray(int num) {
        int[] result = new int[num];
        for (int i = 0; i < num; i++) {
            result[i] = (int) (Math.random() * 100.0);
        }
        return result;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void insertionSort(int[] array) {
        int m, j;
        for (int i = 1; i < array.length; i += 1) {
            m = array[i];
            j = i;

            while (j > 0) {
                if (array[j - 1] >= m) {
                    array[j] = array[j - 1];
                    j -= 1;
                }
                else {
                    break;
                }
            }
            array[j] = m;
        }
    }

    public void selectionSort(int[] array) {
        int p = array.length - 1, g = 0, hilfsvar = 0;
        while (p > 0) {
            g = groesterWertIndex(array, 0, p);
            switchPosIntArr(array, p, g);
            p -= 1;
        }
    }

    public int groesterWertIndex(int[] array, int lowlimit, int highlimit) {
        int i = lowlimit + 1, wert = array[lowlimit], wertindex = lowlimit;
        while (i <= highlimit) {
            if (array[i] > wert) {
                wert = array[i];
                wertindex = i;
            }
            i += 1;
        }
        return wertindex;
    }

    public static void switchPosIntArr(int[] array, int pos1, int pos2) {
        int hilfsvar = 0;
        hilfsvar = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = hilfsvar;
    }

    public static void switchPosStringArr(String[] array, int pos1, int pos2) {
        String hilfsvar = "";
        hilfsvar = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = hilfsvar;
    }

    public void bubbleSort(int[] array) {
        boolean vertauscht = false;
        do {
            vertauscht = false;
            for (int i = 0; i < (array.length - 1)-i; i += 1) {
                if (array[i] > array[i + 1]) {
                    switchPosIntArr(array, i, i + 1);
                    vertauscht = true;
                }
            }

//            for (int i = array.length - 1; i > 0; i -= 1) {
//                if (array[i] < array[i - 1]) {
//                    switchPosIntArr(array, i, i - 1);
//                    vertauscht = true;
//                }
//            }
        } while (vertauscht == true);

    }


}
