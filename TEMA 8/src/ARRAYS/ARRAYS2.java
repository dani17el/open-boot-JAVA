package ARRAYS;


    // ESTE METODO EN ALGUNOS CIRCULOS LA LLAMAN FOR EACH
public class ARRAYS2 {

        public static void main(String[] args) {
            String nombres[] = {
                    "Pepe",
                    "Juan",
                    "Francisco"
            };
            // ESTA ES LA FORMA CORTA:
            for (String nombre : nombres) {
                // cuerpo
                System.out.println("Nombre actual: " + nombre);
            }

            // ESTA ES LA FORMA LARGA:
            for (int i = 0; i < nombres.length; i++) {
                System.out.println("Nombre actual: " + nombres[i]);
            }

            for (int i = 0; i < nombres.length; i++) {
                System.out.println("Nombre actual: " + nombres[i] + " en posicion: " + i);
            }
        }
}
