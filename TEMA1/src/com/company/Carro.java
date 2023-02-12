package com.company;

public class Carro {

    String name = "nombre de carro";

    public Carro() {}
    public Carro(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "name='" + name + '\'' +
                '}';
    }
}
