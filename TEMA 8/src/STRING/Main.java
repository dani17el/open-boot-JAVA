package STRING;

public class Main {
    public static void main(String[] args) {

        String cadena = "Mensaje DE tEXto";

        int cadenaLen = cadena.length();
        System.out.println("La longitud de mi cadena es de: " + cadenaLen);

        String cadenaMinus = cadena.toLowerCase();
        System.out.println("La cadena ahora es: " + cadenaMinus);

        String cadenaMayus = cadena.toUpperCase();
        System.out.println("La cadena ahora es: " + cadenaMayus);


    }
}