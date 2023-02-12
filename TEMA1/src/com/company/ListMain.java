package com.company;

import com.example.Coche;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static <Auto> void main(String[] args) {


        List<String> nombres = new ArrayList<>();

        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        nombres.add("Nombre 4");

        System.out.println(nombres);

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro("Ford"));
        carros.add(new Carro("Chevrolet"));
        carros.add(new Carro("BMW"));

        System.out.println(carros);

        for(Carro carro : carros) {
            System.out.println(carro);
        }

    }
}
