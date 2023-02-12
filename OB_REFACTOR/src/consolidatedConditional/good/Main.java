package consolidatedConditional.good;

public class Main {

    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    double calculateExtraSalary(){
        double result = 0;
        if(!isEligibleExtraSalary()){
            return result;
        }
        // Calculate el salario extra:
        // ...
        return result;
    }

    public boolean isEligibleExtraSalary(){
        // agrupar condiciones utilizando AND(&&) Y OR(||)
        boolean estudios = seniority<1 || education<1;
        boolean antiguedad = incidents > 10 || !certification;
        return estudios || antiguedad;
    }
}