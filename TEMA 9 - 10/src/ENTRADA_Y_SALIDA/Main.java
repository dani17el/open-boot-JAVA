package ENTRADA_Y_SALIDA;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            boolean ok = false;
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Mete dos numeros: ");
                try {
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    ok = true;
                } catch (InputMismatchException e) {
                    System.out.println("Numeros invalidos");
                }
            } while (!ok);

            // PrintStream
            PrintStream info = new PrintStream("copia.txt");
            info.println("hola");


            // InputStream devuelve secuencias de bytes (arrays)
            InputStream fichero = new FileInputStream("/etc/passwd");
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);

            try {
                int dato = ficheroBuffer.read();
                while (dato != -1) {
                    System.out.print((char) dato);
                    dato = ficheroBuffer.read();
                }

            } catch (IOException e) {
                System.out.println("No puedo leer el fichero: " + e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Oye, que el programa da error: " + e.getMessage());
        }
    }

}
