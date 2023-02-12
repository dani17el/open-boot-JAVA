package consolidateDuplicate.good;

public class Main {

    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    double calculateExtraSalary(){
        double result = 0;
        if(!isEligibleExtraSalary()){ // verdadero
            return 500;
        }else { // falso
            result = 0;
        }
        sendMessage(); // sacamos el metodo para que se ejecute de todas formas y no se repita
        return result;
    }
    private void sendMessage(){
        // send email
        // connect smtp
        System.out.println("Sending Message");
    }

    public boolean isEligibleExtraSalary(){
        // agrupar condiciones utilizando AND(&&) Y OR(||)
        boolean firstLevel = seniority<1 || education<1;
        boolean secondLevel = incidents > 10 || !certification;
        return firstLevel || secondLevel;
    }
}