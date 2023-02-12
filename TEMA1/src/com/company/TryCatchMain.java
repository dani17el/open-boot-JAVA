package com.company;

public class TryCatchMain {


    public static void main(String[] args) {
        try {                           // es para capturar errores y gestionarlo nosotros
            int result = 5 / 0;
        } catch (ArithmeticException e) {   // se pone la exepcion del error
            e.printStackTrace();            // <-- se tiene que poner sino no detecta el error
        } finally {                                         // el finally se ejecuta asi este bien o mal
            System.out.println("Cierre de recursos");
        }

        System.out.println("fin");
    }
}
