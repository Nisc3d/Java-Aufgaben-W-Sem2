package Aufgabe3;

public class main {
    public static void main(String[] args) {
        Baum b1 = new Baum();
        b1.insertRekursiv(6);
        b1.insertRekursiv(3);
        b1.insertRekursiv(9);
        b1.insertRekursiv(1);
        b1.insertRekursiv(5);
        b1.insertRekursiv(7);
        b1.insertRekursiv(10);

        b1.iterate();


    }
}
