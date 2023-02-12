package ERRORES;

import java.util.Scanner;

public class ERROR1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos numeros: ");

        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();

        //int resultado = numeroA / numeroB;
        //System.out.println("Resultado es: " + resultado);
        try {
            int resultado = numeroA / numeroB;
            System.out.println("Resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("bOOm!, exception es: " + e.getClass());
        } catch (Exception e) {
            System.out.println("Estoy en una exception que no es aritmetica");
        } finally {
            System.out.println("Finally");
        }

    }
}
