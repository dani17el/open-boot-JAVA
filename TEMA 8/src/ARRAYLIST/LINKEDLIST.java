package ARRAYLIST;

import java.util.ArrayList;
import java.util.LinkedList;

public class LINKEDLIST {

    public static void main(String[] args) {

        // CapacidadVector = CapacidadVector * 2
        //
        // CapacidadArrayList = CapacidadArrayList + (CapacidadArrayList * 0.5)
        ArrayList<String> lista = new ArrayList<>();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");

        // el arrayList es mucho mas rapido para buscar y almacenar datos
        // y el linkedList es mas rapida cuando queremos modificar datos

        LinkedList<String> listaEnlazada = new LinkedList<String>(lista);
        System.out.println(listaEnlazada);

    }
}
