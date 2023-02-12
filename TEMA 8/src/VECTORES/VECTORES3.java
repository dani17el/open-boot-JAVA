package VECTORES;

import java.util.Vector;

public class VECTORES3 {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector(128);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        System.out.println(vector.get(3));
        vector.remove(3);
    }
}
