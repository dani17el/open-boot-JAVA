package clases;

import herencia.SmartPhone;
import herencia.SmartWatch;

public class Main {
    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone("Iphone", "11 promax", "verde",
                128, 6);

        SmartWatch smartWatch = new SmartWatch("Samsung", "Galaxy 5", "negro",
                32, 1.4, "bluetooth");


        System.out.println("El Smartphone es: " + "\n" + smartPhone + "\nEl SmartWatch es: " + "\n" + smartWatch);

    }
}