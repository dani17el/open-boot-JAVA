package com.example.interfaces;

import com.example.Coche;

public class InterfacesMain {

    public static void main(String[] args) {

        CocheService service = new CocheServiceSportImpl();

        Coche coche = service.crearCocheDemo();


    }
}
