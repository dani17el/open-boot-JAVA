package MAPAS;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // MAPAS
        // es una especia de diccionario donde yo tengo una clave y un valor
        // ese valor puede ser otro mapa, un array, un string, etc
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("clave1", 10);
        mapa.put("clave2", 20);
        mapa.put("clave3", 30);
        mapa.put("clave4", 40);

        mapa.remove("clave2");                  // para eliminar un mapa
        System.out.println(mapa);
        //System.out.println(mapa.get("clave1"));
        //mapa.replace("clave3", 90);       // para reemplazar



    }
}
