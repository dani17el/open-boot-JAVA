package EJERCICIO789;

public class PUNTO1 {
    /**
     * Crea un array unidimensional de string y recorrelo, mostrando unicamente sus valores
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Array Unidimensional: ");

        String nombres[] = {"Dani", "Pepe", "Fatima"};

        for (String array : nombres){
            System.out.println(array);
        }
    }
}
