package EJERCICIO789;
import java.util.Scanner;
public class CadenaReves {
    /**
     * Escribe el codigo que devuelva una cadena al reves:
     * la cadena "hola mundo"
     */
    public static void main(String[] args) {
        System.out.println("Cadena al Reves\n----------------");

        Scanner scanner = new Scanner(System.in);
        String texto;
        System.out.println("Introduce un texto: ");
        texto = scanner.nextLine();

        StringBuilder reves = new StringBuilder(texto);
        texto = reves.reverse().toString();
        System.out.println(texto);

    }
}