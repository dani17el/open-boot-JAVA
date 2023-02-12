package com.example.funciones;

public class Funciones {

    public static void main(String[] args) {


        // opcion 1: funcion sin parametros y sin tipo de retorno

//        showMenu();
//        showMenu();


        // opcion 2: funcion sin parametros y con tipo de retorno
        String menu = getMenu();
        System.out.println(menu);
        System.out.println(getMenu());

        double price = getPrice();
        System.out.println(price);


        // opcion 3: funcion con parametros y sin tipo de retorno
        imprimirSaludoBuenosDias("OpenBootCamp");


        // opcion 4: funcion con parametros y con tipo de retorno
        String nombre = "Daniel";
        String apellido = "Ruiz";
        String saludo = obtenerSaludo(nombre,apellido);
        System.out.println(saludo);


        int resultadoSuma = suma(50, 200);
    }

    static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    static double getPrice() {

        return 100.99;
    }

    /**
     * void indica que no devuelve nada
     */
    static void showMenu(){
        System.out.println("Bienvenidos al E-commerce de zapatillas");
        System.out.println("1 - ver zapatillas");
        System.out.println("2 - comprar zapatillas");
        System.out.println("3 - salir");
    }

    static String getMenu(){
        System.out.println("Imprimiendo");
        return "Bienvenidos al E-commerce de zapatillas: \n 1 - ver zapatillas...";
    }

    static void imprimirSaludoBuenosDias(String name){
        System.out.println("Buenas tardes " + name);
    }

    static String obtenerSaludo(String nombre, String apellido) {
        return "Buenas tardes " + nombre + " " + apellido;
    }

}
