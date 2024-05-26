package edu.ulima.granja;

public class Pollo {
    private String nombre;
    private float peso;
    private int tiempoDias;

    public Pollo(String nombre, float peso, int tiempoDias) {
        this.nombre = nombre;
        this.peso = peso;
        this.tiempoDias = tiempoDias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getTiempoDias() {
        return tiempoDias;
    }

    public void setTiempoDias(int tiempoDias) {
        this.tiempoDias = tiempoDias;
    }

    @Override
    public String toString() {
        return "Pollo{" +
               "nombre='" + nombre + '\'' +
               ", peso=" + peso +
               ", tiempoDias=" + tiempoDias +
               '}';
    }
}
