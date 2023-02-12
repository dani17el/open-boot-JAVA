package ARRAYS;

public class ARRAYS1 {

    public static void main(String[] args) {

        String nombres[] = {
                "Pepe",
                "Juan",
                "Francisco"
        };

        System.out.println("Longitud del array: " + nombres.length);
        for (String i : nombres){
            System.out.println(i);
        }
    }
}
