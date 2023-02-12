package EJERCICIO789;
public class PUNTO2 {
    /**
     * Crea un array bidimensional de enteros y recorrelos
     * mostrando su posicion y el valor de cada elemento en ambas dimensiones
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Array Bidimensional: ");

        int arrayBidi[][] = new int[2][4];
        arrayBidi[0][0] = 5;
        arrayBidi[0][1] = 10;
        arrayBidi[0][2] = 15;
        arrayBidi[0][3] = 20;

        arrayBidi[1][0] = 50;
        arrayBidi[1][1] = 55;
        arrayBidi[1][2] = 60;
        arrayBidi[1][3] = 65;

        for (int i = 0; i < arrayBidi.length; i++) {
            System.out.println("Valor de i: " + i);

            for (int j = 0; j < arrayBidi[1].length; j++) {
            System.out.println("Estoy en i= " + i + ", j= " + j);
            System.out.println(arrayBidi[i][j]);
            }
        }
    }
}
