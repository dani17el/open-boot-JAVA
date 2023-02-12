package ARRAYLIST;

import java.util.ArrayList;

public class ARRAYLIST1 {

    public static void main(String[] args) {

        // CapacidadVector = CapacidadVector * 2
        //
        // CapacidadArrayList = CapacidadArrayList + (CapacidadArrayList * 0.5)
        ArrayList<String> lista = new ArrayList<>();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");
        // esto es una manera de recorrer una lista que he convertido en una array
        //
        for (Object arrayObjeto : lista.toArray()) {
            System.out.println(arrayObjeto.toString());
        }
    }
}
