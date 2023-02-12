package ERRORES;

import java.io.IOException;

public class ERROR2 {
    public static void main(String[] args) {
        try {
            divide(4, 0);
        } catch (Exception e) {
            System.out.println("Esto esta mal");
        }
    }
    public static int divide(int A, int B) throws ArithmeticException,  IOException {
        int resultado = 0;
        try {
            resultado = A / B;
        } catch (ArithmeticException e) {
            throw new IOException();
        }
        return resultado;
    }
}
