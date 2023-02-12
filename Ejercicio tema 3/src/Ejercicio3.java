public class Ejercicio3 {
    public static void main(String[] args) {

        String[] nombres = {"Dani", "Fatima", "Valentina"};

        String nombre = "";
        for (int i = 0; i < nombres.length; i++){
            nombre += nombres[i];
        }
        System.out.println(nombre);
    }
}