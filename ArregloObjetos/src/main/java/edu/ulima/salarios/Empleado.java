package edu.ulima.salarios;

public class Empleado {
    private String codigo;
    private String nombre;
    private int horasTrabajadas;
    private double sueldoPorHora;

    public Empleado(String codigo, String nombre, int horasTrabajadas, double sueldoPorHora) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.sueldoPorHora = sueldoPorHora;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSueldoPorHora() {
        return sueldoPorHora;
    }

    public void setSueldoPorHora(double sueldoPorHora) {
        this.sueldoPorHora = sueldoPorHora;
    }

    public double calcularSalario() {
        double salario = 0.0;
        if (horasTrabajadas <= 40) {
            salario = horasTrabajadas * sueldoPorHora;
        } else if (horasTrabajadas <= 45) {
            salario = 40 * sueldoPorHora + (horasTrabajadas - 40) * sueldoPorHora * 2;
        } else {
            salario = 40 * sueldoPorHora + 5 * sueldoPorHora * 2 + (horasTrabajadas - 45) * sueldoPorHora * 3;
        }
        return salario;
    }
}
