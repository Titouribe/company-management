package operaciones;

import models.Empleado;
import models.Empresa;

import java.util.List;

public interface IOperacionEmpresa {

    Empresa crearEmpresa();

    Empleado agregarEmpleado(Empleado empleado);

    List<Empleado> obtenerEmpleados();

    Integer contarEmpleados();
}
