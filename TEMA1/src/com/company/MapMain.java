package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {

        Map<String, String> personas = new HashMap<>();

        personas.put("70764773", "Nombre Apellido 1");
        personas.put("74831594", "Nombre Apellido 2");
        personas.put("12003317", "Nombre Apellido 3");

        System.out.println(personas);

        for (String key : personas.keySet()){   // esta te muestra solo la clave (dnis)
            System.out.println(key);
        }
        for (String value : personas.values()) {    // esta te muestra solo los valores (nombre apellido)
            System.out.println(value);
        }
        for (Map.Entry<String, String> pair : personas.entrySet()) {    // esta te muestra ambas (clave y valor)
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
