package com.company;

public class StringMain {
    public static void main(String[] args) {

        // La clase String
        /*
            length()
            startsWith("")
            endsWith("")
            indexOf("")
            substring(1,5)
            trim()
            equals()
            compareTo
         */

        String mensaje = "  Hola mundo  ";
        System.out.println(mensaje.length());
        String mensajeMay = mensaje.toUpperCase();
        System.out.println(mensajeMay);
        System.out.println(mensajeMay.trim());
        mensajeMay = mensajeMay.trim();

        String otro = "hola mundo";
        if (mensajeMay.equalsIgnoreCase(otro)) {
            System.out.println("Verdadero!!");
        }


    }
}
