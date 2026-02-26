package models;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nit;
    private String nombre;
    private String dirección;
    private String ciudad;
    private List<Empleado> empleados = new ArrayList<>();

    public Empresa() {
    }

    public Empresa(String nit, String nombre, String dirección, String ciudad, List<Empleado> empleados) {
        this.nit = nit;
        this.nombre = nombre;
        this.dirección = dirección;
        this.ciudad = ciudad;
        this.empleados = empleados;
    }

    public String getNit() {
        return nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void addEmplado(Empleado empleado) {
        this.empleados.add(empleado);
    }
}
