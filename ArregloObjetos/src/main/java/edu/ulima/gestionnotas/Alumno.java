package edu.ulima.gestionnotas;

public class Alumno {
    private int cod;
    private String nombre;

    // Constructor sin parámetros
    public Alumno() {
        this.cod = 0;
        this.nombre = "";
    }

    // Constructor con parámetros
    public Alumno(int cod, String nombre) {
        this.cod = cod;
        this.nombre = nombre;
    }

    // Métodos getter y setter
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
