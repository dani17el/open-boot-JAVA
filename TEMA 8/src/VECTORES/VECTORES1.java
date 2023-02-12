package VECTORES;

import java.util.Vector;

public class VECTORES1 {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);

        Vector<Integer> vector2 = new Vector();
        vector.add(1);
        vector.add(2);

        boolean resultado = vector.equals(vector2);
        System.out.println("Son iguales? " + resultado);
    }
}
