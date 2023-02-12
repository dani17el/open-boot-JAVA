package VECTORES;

import java.util.Vector;

public class VECTORES4 {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector(16);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        System.out.println("Capacidad " + vector.capacity() + " Tamaño: " + vector.size());
        vector.trimToSize();
        System.out.println("Capacidad " + vector.capacity() + " Tamaño: " + vector.size());


    }
}
