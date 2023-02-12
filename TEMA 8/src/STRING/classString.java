package STRING;

public class classString {

    public static void main(String[] args) {

        String cadena = "mensaje DE tEXto";

        //boolean resultado = cadena.startsWith("Men");
        //if (resultado) {
            //System.out.println("Empieza por que estoy buscando");
        //} else {
          //  System.out.println("No empieza por lo que quiero");
        //}
        boolean resultado = cadena.endsWith("o");
        if (resultado) {
        System.out.println("Si acaba");
        } else {
            System.out.println("No acaba");
        }
    }

}
