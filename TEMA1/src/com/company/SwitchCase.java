package com.company;

public class SwitchCase {

    public static void main(String[] args) {

        String weather = "cloudy";

        switch (weather) {

            case "sunny":
                System.out.println("El tiempo es soleado");
                break;

            case "cloudy":
                System.out.println("El tiempo es nublado");
                break;
            default:
                System.out.println("No se a podido identificar el clima");
                break;
        }
    }
}
