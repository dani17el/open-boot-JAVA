package ARRAYLIST;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // CapacidadVector = CapacidadVector * 2
        //
        // CapacidadArrayList = CapacidadArrayList + (CapacidadArrayList * 0.5)
        ArrayList<String> lista = new ArrayList<>();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");

        lista.remove("ElementoB");  // asi se elimina un elemento de la arrayList/ o se puede poner su posicion tambien para eliminarlo
        System.out.println("contenido: " + lista);



        // forma corta:
        for (String nombre : lista) {
            System.out.println(nombre);
        }
        // forma larga:
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
