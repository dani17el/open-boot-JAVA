package ERRORES;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos numeros: ");

        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();

        int resultado = numeroA / numeroB;
        System.out.println("Resultado es: " + resultado);

        int temperatura = 5;
        if (temperatura < 15 ) {
            System.out.println("Hace frio");
        }

    }

}