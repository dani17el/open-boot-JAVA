package com.company;

public class Funciones {

    public static void main(String[] args) {

        HolaMundo();
        HolaMundo("Nombre");
        HolaMundo(17);
        //HolaMundo();
        //HolaMundo();

        //HolaMundo("Alan");
        //HolaMundo("Dani");

        String hola = devolverHola();
        System.out.println(hola);
    }
    private static void HolaMundo() {
        System.out.println("Hola mundo");
        System.out.println("Hola mundo");
    }

    private static void HolaMundo(String name) {

        System.out.println("Hola " + name);
    }
    private static void HolaMundo(Integer number) {

        System.out.println("El numero es: " + number);
    }
    private static void HolaMundo(String name, String surname) {

        System.out.println("Hola " + name);
    }

    private static String devolverHola() {

        return "Hola";
    }
}

