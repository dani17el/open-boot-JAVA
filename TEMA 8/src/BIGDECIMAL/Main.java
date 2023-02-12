package BIGDECIMAL;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        //System.out.println(0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f);
        // se utiliza mas para valores financieros
        BigDecimal valorA = new BigDecimal(3.14);
        BigDecimal valorB = new BigDecimal(3.14);

        // Suma el BigDecimal "valorB" a "valorA"
        BigDecimal resultado = valorA.add(valorB);

        // Imprime la suma
        System.out.println(resultado.toString());

    }
}
