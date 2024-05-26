package edu.ulima.divercity;

public class Ciudadano {
    private int cui;
    private int edad;
    private String nombres;
    private String apellidos;

    public Ciudadano(int cui, int edad, String nombres, String apellidos) {
        this.cui = cui;
        this.edad = edad;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public int getCui() {
        return cui;
    }

    public void setCui(int cui) {
        this.cui = cui;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDetalleC() {
        return "CUI: " + cui + ", Edad: " + edad + ", Nombres: " + nombres + ", Apellidos: " + apellidos;
    }

    @Override
    public String toString() {
        return getDetalleC();
    }
}
