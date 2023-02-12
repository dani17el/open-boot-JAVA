package com.example.estructurascontrol.repeticion;

public class ForConcepto {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            //System.out.println("El valor de i es: " + i);
            // System.out.println("Hola mundo");
        }
                            // 0        1           2
        String[] nombres = {"Pepe", "Juanito", "Ruperta"};
        for (int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }

        int suma = 0;
        int[] numeros = {5, 7, 8};
        for(int i = 0; i < numeros.length; i++){
            suma = suma + numeros[i];
        }
    }
}
