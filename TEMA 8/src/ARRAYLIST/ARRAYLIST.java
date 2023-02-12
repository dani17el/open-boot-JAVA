package ARRAYLIST;

import java.util.ArrayList;

public class ARRAYLIST {

    public static void main(String[] args) {

        // CapacidadVector = CapacidadVector * 2
        //
        // CapacidadArrayList = CapacidadArrayList + (CapacidadArrayList * 0.5)
        ArrayList<String> lista = new ArrayList<>();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");

        String array[] = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            array[i] = lista.get(i);
        }
        for (String elemento : array) {
            System.out.println("Elemento es: " + elemento);
        }
    }
}
