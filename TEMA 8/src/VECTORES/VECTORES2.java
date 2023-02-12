package VECTORES;

import java.util.Vector;

public class VECTORES2 {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector(128);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        for (int i : vector) {
            System.out.println("Valor actual en vector: " + i);
        }

        for (int i = 0; i < vector.size(); i++) {
            if (i % 2 == 0){
                vector.remove(i);
                continue;
            }
            System.out.println("Valor es: " + vector.get(i) + " en posicion: " + i);
        }
    }
}
