package com.example.estructurascontrol.condicionales;

public class IfElseIfconcepto {

    public static void main(String[] args) {

        String dia = "Viernes";
        // ejemplos comparar
        boolean resultadoCompararNum = 5 == 5;
        boolean resultado = dia.equals("Martes");


        //if else if
        if (dia.equals("Lunes")) {
            System.out.println("Animo con la semana champions");

        } else if (dia.equals("Martes")) {
            System.out.println("Martes con M de Monos");

        } else if (dia.equals("Miercoles")) {
            System.out.println("Miercoles con M de Mierda");

        } else if (dia.equals("Jueves")) {
            System.out.println("Jueves de patas");

        } else if (dia.equals("Viernes")) {
            System.out.println("Viernes de cervezas");

        } else if (dia.equals("Sabado")) {
            System.out.println("Sabado de fiesta");

        } else if (dia.equals("Domingo")) {
            System.out.println("Depresion");
        } else {
            System.out.println("El dia introducido no es un dia valido");
        }


    }
}
