package com.company;

public class WhileLoop {

    public static void main(String[] args) {

        int count = 0;
        while(count < 10){
            count++;  // condicion
            if(count == 6)
                break;  // rompe el flujo de ejecucion
                //continue;  // salta el valor 6 y continua a la siguiente iteracion
            System.out.println("Hola mundo " + count);

        }
        System.out.println("fin");
    }
}
