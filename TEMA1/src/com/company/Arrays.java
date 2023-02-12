package com.company;

public class Arrays {

    public static void main(String[] args) {
        int[] notas = new int[10];
        notas[0] = 8;
        notas[1] = 7;
        notas[2] = 9;
        notas[3] = 10;
        notas[4] = 7;

        System.out.println(notas[0]); // 8

    }

    public static void main2(String[] args) {
        int[] notas = {9, 4, 8, 4, 5, 6, 7, 10, 9, 10};
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        for(int item : notas) {
            System.out.println(item);
        }
    }

    public static void main3(String[] args) {
        int[] notas = {9, 4, 8, 4, 5, 6, 7, 10, 9, 10};

        // OTRAS ARRAYS
        /*
            notas.binarySearch(notas, 9);  // (array, valor a buscar) devuelve la posicion del elemento
            notas.sort(notas); // sort nos permite ordenar una array (se puede ordenar el contenido)
            equals(array1, array2); // es una array que no permite comparar arrays
         */
    }
}
