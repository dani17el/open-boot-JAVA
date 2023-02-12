package com.example.estructurascontrol.condicionales;

public class SwitchConcepto {

    public static void main(String[] args) {

        String dia = "Viernes";

        switch (dia){
            case "Lunes":
                System.out.println("Hoy es lunes de curro");
                break;
            case "Martes":
                System.out.println("Hoy es martes de mas curro");
                break;
            case "Miercoles":
                System.out.println("Hoy es miercoles de curro");
                break;
            case "Jueves":
                System.out.println("Hoy es jueves de patas");
                break;
            case "Viernes":
                System.out.println("Hoy es Viernes de chelas");
                break;
            case "Sabado":
                System.out.println("Hoy es sabado de fiesta");
                break;
            case "Domingo":
                System.out.println("Depresion");
                break;
            default:
                System.out.println("No es un dia valido");
        }



    }
}
