package STRING;

public class classString1 {

    public static void main(String[] args) {

        String cadena = "Mensaje DE tEXto";

        // char letra = cadena.charAt(4);
        // System.out.println("Caracter es: " + letra);

        for (int i = 0; i < cadena.length(); i++) {
            System.out.println("Caracter actual: "+ cadena.charAt(i));
        }
    }
}
