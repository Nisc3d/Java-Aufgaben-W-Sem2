package Aufgabe2;

public class sort {

    public void printArray (int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print (array[i] + " ");
        System.out.println ();
    }

    public void insertionSort(int[] array){
        int m, j;
        for (int i = 1; i < array.length; i += 1 ){
            m = array[i];
            j = i;

            while (j > 0){
                if ( array[j-1] >= m){
                    array[j] = array[j-1];
                    j -= 1;
                }
                else{
                    break;
                }
            }
            array[j] = m;
        }
    }

    public void selectionSort(int[] array){
        int p = array.length, g = 0;
        while (p > 0){
            g = groesterWert(array);
            

        }
    }

    public int groesterWert(int[] array){
        int i = 1, wert = array[0];
        while (i < array.length){
            if (array[i] > wert){
                wert = array[i];
            }
            i += 1;
        }
        return wert;
    }
}
