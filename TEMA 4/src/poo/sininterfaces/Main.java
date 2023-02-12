package poo.sininterfaces;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        EmpleadoCRUDv1 empleadoCRUDv1 = new EmpleadoCRUDv1();

        Empleado juanito = new Empleado("Juanito", 30, 4000, true);
        Empleado patricia = new Empleado("Patricia", 20, 2000, true);
        Empleado roberto = new Empleado("Roberto", 25, 3000, true);

        // guardar empleados
        empleadoCRUDv1.save(juanito);
        empleadoCRUDv1.save(patricia);
        empleadoCRUDv1.save(roberto);

        // recuperar empleados
        List<Empleado> empleados = empleadoCRUDv1.findAll();
        System.out.println(empleados);

    }
}
