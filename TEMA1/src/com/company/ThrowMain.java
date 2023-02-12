package com.company;

import java.util.Scanner;

public class ThrowMain {

    public static void main(String[] args) {

        try {
            leerNombres();
        } catch (NameFormatException e) {
            e.printStackTrace();
        }

    }
    /**
     * Metodo que lee nombres de consola y verifica que tengan longitud igual o mayor que 8
     * caracteres
     * @throws NameFormatException
     */

    private static void leerNombres() throws NameFormatException {          // throws es en la asignatura del metodo
                                                                    // se usa para expresar que lanza una excepcion
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        while (teclado.hasNext()) {
            System.out.println("Introduce un nombre");
            String nombre = teclado.nextLine();
            if (nombre.length() < 8) {
                teclado.close();
                throw new NameFormatException("El nombre debe contener minimo 8 caracteres");
            }       // throw es para crear la excepcion y lanzarla
        }
        teclado.close();
    }



}
