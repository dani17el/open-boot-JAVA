package herencia;

import clases.SmartDevice;

public class SmartPhone extends SmartDevice {

    public int ram;

    public SmartPhone(){
    }

    public SmartPhone(String marca, String modelo, String color, int capacidad, int ram) {
        super(marca, modelo, color, capacidad);
        this.ram = ram;
    }
    @Override
    public String toString() {
        return "marca = " + marca +
                ", modelo = " + modelo +
                ", color = " + color +
                ", capacidad = " + capacidad +
                ", ram = " + ram;
    }
}
