package VECTORES;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector(1,15);
        vector.add(1);
        vector.add(2);
        vector.add(3);

        System.out.println("datos del vector: " + vector);
        //vector.remove(2); // nos referimos siempre a eliminar la posicion del vector
        //System.out.println("datos del vector: " + vector);
        System.out.println("Vector tamaño:" + vector.size() + " y capacidad: " + vector.capacity());

    }
}
