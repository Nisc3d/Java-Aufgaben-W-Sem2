package Aufgabe3;

public class Baum {
    private Knoten wurzel = null;

    public void insertRekursiv(int x){
        wurzel = add(x, wurzel);
    }

    private Knoten add(int x, Knoten k){
        if (k== null){
            return new Knoten(x);
        }else if(x < k.data){
            k.links = add(x, k.links);
        }else {
            k.rechts = add(x, k.rechts);
        }
    return k;
    }

    private void preorder(Knoten k){
        if (k != null){
            System.out.print(k.data + " ");
            preorder(k.links);
            preorder(k.rechts);
        }
    }

    private void inorder(Knoten k){
        if (k != null){
            inorder(k.links);
            System.out.print(k.data + " ");
            inorder(k.rechts);
        }
    }

    private void postorder(Knoten k){
        if (k != null){
            postorder(k.links);
            postorder(k.rechts);
            System.out.print(k.data + " ");

        }
    }

    public void iterate(){
        preorder(wurzel);
        System.out.println("");
        inorder(wurzel);
        System.out.println("");
        postorder(wurzel);
        System.out.println("");

    }

}
