package ARRAYS;

public class ARRAYS3 {

    public static void main(String[] args) {

        /**
         * LA PRIMERA [] REPRESENTA LA POSICION DE LAS FILAS
         * LA SEGUNDA [] REPRESENTA LA POSICION DE LAS COLUMNAS
         */
        int arrayBidi[][] = new int[2][4];
        arrayBidi[0][0] = 1;
        arrayBidi[0][1] = 2;
        arrayBidi[0][2] = 3;
        arrayBidi[0][3] = 4;

        arrayBidi[1][0] = 10;
        arrayBidi[1][1] = 20;
        arrayBidi[1][2] = 30;
        arrayBidi[1][3] = 40;

        for (int i = 0; i < arrayBidi.length; i++) {
            System.out.println("Valor de i: " + i);

            for (int j = 0; j < arrayBidi[1].length; j++) {
                System.out.println("Estoy en i= " + i + ", j = " + j);
                System.out.println(arrayBidi[i][j]);
            }
        }

        String nombres[] = {"Pepe", "Juan"};
        nombres[0] = "Victor";  // estoy mutando mis dos primeras arrays por pepe
        nombres[1] = "Paco";    // mutando por juan

        for (String nombre : nombres){
            System.out.println(nombre);
        }

    }
}
