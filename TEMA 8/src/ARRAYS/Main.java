package ARRAYS;

public class Main {

    public static void main(String[] args) {

        int arrayUno[] = new int[5];
        System.out.println(arrayUno);
        arrayUno[0] = 1;
        arrayUno[1] = 2;
        arrayUno[2] = 3;
        arrayUno[3] = 4;
        arrayUno[4] = 5;

        for (int i: arrayUno) {
            System.out.println(i);
        }

    }
}
