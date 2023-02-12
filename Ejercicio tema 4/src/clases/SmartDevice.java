package clases;

public class SmartDevice {

    protected String marca;
    protected String modelo;
    protected String color;
    protected int capacidad;

    public SmartDevice(){
    }

    public SmartDevice(String marca, String modelo, String color, int capacidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.capacidad = capacidad;
    }

}
