package com.example.estructurascontrol.repeticion;

public class ConcatenarTextos {

    public static void main(String[] args) {

        String[] nombres = {"Pepito ", "Monica ", "Dani"};

        // for (String nombre : nombres){
        String nombre = "";
        for (int i = 0; i < nombres.length; i++){
            nombre += nombres[i];
        }
        System.out.println(nombre);
    }
}
