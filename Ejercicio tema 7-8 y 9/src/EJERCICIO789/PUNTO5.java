package EJERCICIO789;
import java.util.ArrayList;
import java.util.LinkedList;
/**
 * Crea un arrayList de tipo String, con 4 elementos,
 * Copialo en una linkedList
 * Recorre ambos mostrando unicamente el valor de cada elemento.
 */
public class PUNTO5 {
    public static void main(String[] args) {
        ArrayList<String> listaNombres = new ArrayList<>();
        listaNombres.add("Luis");
        listaNombres.add("Milagros");
        listaNombres.add("Elisa");
        listaNombres.add("Mauricio");

        LinkedList<String> listaEnlazada = new LinkedList<>(listaNombres);
        System.out.println("Elementos del Array: ");
        for (String elementos : listaNombres) {
            System.out.println(elementos + " ");
        }
        System.out.println("\nElementos de la LinkedList: ");
        for (String elementos : listaEnlazada) {
            System.out.println(elementos + " ");
        }
    }
}
