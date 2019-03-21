package Augabe1;

public class Algorithmen {

    public int iterativfib(int zahl) {
        if (zahl == 0) {
            return 0;
        }

        int i = 2;
        int[] ergebnis = new int[zahl + 1];
        ergebnis[0] = 0;
        ergebnis[1] = 1;
        while (i <= zahl) {
            ergebnis[i] = ergebnis[i - 1] + ergebnis[i - 2];
            i += 1;
        }
        zahl = ergebnis[i - 1];
        return zahl;
    }

    public int iterativfak(int zahl) {
        if (zahl == 0) {
            return 0;
        }

        int i = 1;
        int[] ergebnis = new int[zahl + 1];

        ergebnis[0] = 1;
        while (i <= zahl) {
            ergebnis[i] = ergebnis[i - 1] * i;
            i += 1;
        }
        return ergebnis[i - 1];
    }

    public int rekursivfib(int zahl) {
        if ((zahl == 0) || (zahl == 1)) {
            return zahl;
        }
        return rekursivfib(zahl - 1) + rekursivfib(zahl - 2);
    }

    public int rekursivfak(int zahl) {
        if ((zahl == 1) || (zahl == 0)) {
            return zahl;
        }
        return rekursivfak(zahl -1 ) * zahl;

    }
}
