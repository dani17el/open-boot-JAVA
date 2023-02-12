package EJERCICIO789;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class PUNTO8 {
    /**
     * Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros:
     * "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero
     * dado en el parámetro "fileIn" al fichero dado en "fileOut".
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("El fichero de origen es: ");
        String fileIn = scanner.nextLine();
        System.out.println("El fichero de destino es: ");
        String fileOut = scanner.nextLine();
        copiar(fileIn,fileOut);
    }
    private static void copiar(String fileIn, String fileOut) {
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
