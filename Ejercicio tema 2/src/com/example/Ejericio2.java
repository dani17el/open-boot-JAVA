package com.example;

public class Ejericio2 {

    public static void main(String[] args) {

        double precio = getPrecioIva(225);
        System.out.println("El precio con Iva es: " + precio);

    }
    static double getPrecioIva(double precio){
        return precio + precio * 0.21;
    }
}
