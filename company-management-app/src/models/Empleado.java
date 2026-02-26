package models;

import java.util.Date;

public  class Empleado {

    private String documento;
    private String nombre;
    private double sueldoPorHora;
    private Date fechaDeIngreso;
    private Empresa empresa;

    public Empleado() {

    }

    public Empleado(String documento, String nombre, double sueldoPorHora, Date fechaDeIngreso) {
        this.documento = documento;
        this.nombre = nombre;
        this.sueldoPorHora = sueldoPorHora;
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldoPorHora() {
        return sueldoPorHora;
    }

    public void setSueldoPorHora(double sueldoPorHora) {
        this.sueldoPorHora = sueldoPorHora;
    }

    public Date getFechaDeIngreso() {
        return fechaDeIngreso;
    }
}
