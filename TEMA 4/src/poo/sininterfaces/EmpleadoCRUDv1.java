package poo.sininterfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * C reate (crear)
 * R etrieve/read (recuperar)
 * U pdate (actualizar)
 * D elete (borrar)
 */
public class EmpleadoCRUDv1 {

    // estructura de datos
    private List<Empleado> empleados = new ArrayList<>();

    // OPERACIONES CRUD
    // CREATE - guardar un empleado
    public void save(Empleado empleado){
        empleados.add(empleado);
    }

    public List<Empleado> findAll(){

        return empleados;
    }





}
