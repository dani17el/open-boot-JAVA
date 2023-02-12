package com.example.tipos;

public class Operadores {
    public static void main(String[] args) {

        // aritmeticos:
        int numero1 = 10;
        int numero2 = 20;
        int resultadoSuma = numero1 + numero2;

        System.out.println(resultadoSuma);
        System.out.println(resultadoSuma + 5.99);

        int resultadoResta = numero1 - numero2;

        // comparacion
        /*
        < mayor que
        > menor que
        >= menor igual que
        <= mayor igual que
        == igual que
        === IMPORTANTE: EN JAVA NO EXISTE!!!

         */

        boolean resultado1 = numero1 > numero2;          // false
        System.out.println(resultado1);

        boolean resultado2 = numero1 < numero2;          // true
        System.out.println(resultado2);

        // operadores logicos
        /*
        and &&
        or ||
         */

        boolean resultado3 = numero1 > 5 && numero1 < 30;

        int edad = 17;
        boolean carnetJoven = edad >= 15 && edad <=26;

        // operadores:
        // incrementos ++
        // decremento  --


    }
}