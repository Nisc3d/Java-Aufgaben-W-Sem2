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
            for (int i = 0; i < (array.length - 1) - i; i += 1) {
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

    public int[] mergeSort(int[] array) {
        if (array.length == 0) {
            return array;
        }
        else {
            //split in 2 arrays
            int i = 0;
            int[] ar1 = new int[array.length / 2 + 1];
            int[] ar2 = new int[array.length / 2 + 1];
            while (i <= (array.length / 2)) {
                ar1[i] = array[i];
                i += 1;
            }
            i = array.length;
            while (i > (array.length / 2)) {
                ar2[i] = array[i];
                i -= 1;
            }
            //arrays mischen
            return merge(ar1, ar2);

        }
    }

    public int[] merge(int[] ar1, int[] ar2) {
        int i = 0;
        boolean ar1bigger = false;
        int[] hilfsar;
        if (ar1.length > ar2.length) {
            hilfsar = new int[ar1.length];
            ar1bigger = true;
        }
        else {
            hilfsar = new int[ar2.length];
            ar1bigger = false;
        }


        if (ar1bigger == true) {
            while (i <= ar2.length - 1) {
                if (ar1[i] <= ar2[i]) {
                    hilfsar[i] = ar1[i];
                }
                else {
                    hilfsar[i] = ar2[i];
                }
                i += 1;
            }
            i = ar2.length;
            while (i <= ar1.length - 1) {
                hilfsar[i] = ar1[i];
                i += 1;
            }

        }
        else {
            while (i <= ar1.length - 1) {
                if (ar1[i] <= ar2[i]) {
                    hilfsar[i] = ar1[i];
                }
                else {
                    hilfsar[i] = ar2[i];
                }
                i += 1;
            }
            i = ar2.length;
            while (i <= ar2.length-1){
                hilfsar[i] = ar2[i];
                i += 1;
            }
        }

        return hilfsar;
    }

}
