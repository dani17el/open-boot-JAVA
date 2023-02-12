package EJERCICIO789;

import java.util.Scanner;

/**
 * Crea una función DividePorCero.
 * Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException
 * que será capturada por su llamante (desde "main", por ejemplo).
 * Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
 * Finalmente, mostraremos en cualquier caso: "Demo de código".
 */
public class PUNTO7 {
    private static int Dividir(int a, int b) throws ArithmeticException {
        return a / b;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe los numeros que quiere dividir: ");
        System.out.println("Primer numero: ");
        int a = scanner.nextInt();
        System.out.println("Segudno numero: ");
        int b = scanner.nextInt();
        try {
            System.out.println("Resultado: " + Dividir(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Esto no se puede hacer");
        } finally {
            System.out.println("Demo de codigo");
        }
    }
}
