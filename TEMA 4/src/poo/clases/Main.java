package poo.clases;

import poo.herencia.Camion;
import poo.herencia.Coche;
import poo.herencia.Motocicleta;

public class Main {
    public static void main(String[] args) {

        // 1. clases y objetos
        // Clase identificador = new Clase();
        Vehiculo toyotaPrius = new Vehiculo();
        Motor motorGTI = new Motor("GTI", 190, 459.8, 6);

        Vehiculo fordFocus = new Vehiculo("Ford", "Focus", 2.1,
                2010, false, 0, motorGTI);
        System.out.println(fordFocus.fabricante);
        System.out.println(fordFocus.year);
        System.out.println(fordFocus.speed);  // 0
        fordFocus.acelerar(50);
        System.out.println(fordFocus.speed);  // 50


        // 2. herencia

        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante = "Kawasaki";
        System.out.println(kawasakiNinja.fabricante);

        System.out.println("Fin de programa");

        // 3. polimorfismo
        Vehiculo vehiculo;

        vehiculo = new Motocicleta();
        vehiculo.acelerar(50);

        vehiculo = new Coche();
        vehiculo.acelerar(70);

        vehiculo = new Camion();
        vehiculo.acelerar(90);

        // 4. clases abstractas: no se pueden instanciar(crear objetos), solo instancian las clases hijas




    }
}