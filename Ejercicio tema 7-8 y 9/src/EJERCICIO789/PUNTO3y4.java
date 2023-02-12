package EJERCICIO789;
import java.util.Vector;
public class PUNTO3y4 {
    /**
     * Crea un vector del tipo de dato que prefieras y añadele 5 elementos.
     * elimina el 2do y 3er elemento y muestra el resultado final.
     * @param args
     */
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        System.out.println("El vector completo es: " + vector);

        vector.remove(2);
        vector.remove(1);
        System.out.println("El vector final es: " + vector);

        /**
         * Indica cual es el problema de utilizar un Vector con la capacidad por defecto
         * si tuviesemos 1000 elementos para ser añadidos al mismo
         */
        System.out.println("Respuesta pregunta4 es: ");
        System.out.println("Desperdiciamos mucha memoria porque cada vez que se sobrepasa el limite establecido\n"
        + "Por defecto es 10; y lo que se pasa es que se termina duplicando la capacidad del vector.");

    }
}
