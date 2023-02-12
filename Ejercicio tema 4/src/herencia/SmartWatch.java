package herencia;

import clases.SmartDevice;

public class SmartWatch extends SmartDevice {

    public double pulgadas;
    public String conectividad;

    public SmartWatch(){
    }

    public SmartWatch(String marca, String modelo, String color, int capacidad, double pulgadas, String conectividad) {
        super(marca, modelo, color, capacidad);
        this.pulgadas = pulgadas;
        this.conectividad = conectividad;
    }


    @Override
    public String toString() {
        return "marca = " + marca +
                ", modelo = " + modelo +
                ", color = " + color +
                ", capacidad = " + capacidad +
                ", pulgadas = " + pulgadas +
                ", conectividad = " + conectividad;
    }
}
