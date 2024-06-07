package edu.ulima.clinica;

public class Paciente {
    private String nombre;
    private double peso;  // en kilogramos
    private double talla; // en metros
    private double imc;
    private String observacion;

    public Paciente(String nombre, double peso, double talla) {
        this.nombre = nombre;
        this.peso = peso;
        this.talla = talla;
        this.imc = calcularIMC();
        this.observacion = determinarObservacion();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.imc = calcularIMC();
        this.observacion = determinarObservacion();
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
        this.imc = calcularIMC();
        this.observacion = determinarObservacion();
    }

    public double getImc() {
        return imc;
    }

    public String getObservacion() {
        return observacion;
    }

    private double calcularIMC() {
        return peso / (talla * talla);
    }

    private String determinarObservacion() {
        if (imc < 18.5) {
            return "infrapeso";
        } else if (imc <= 25.0) {
            return "normal";
        } else if (imc <= 30.0) {
            return "sobrepeso";
        } else {
            return "obeso";
        }
    }

    public String getDetalle() {
        return "Nombre: " + nombre + ", Peso: " + peso + "kg, Talla: " + 
                talla + "m, IMC: " + String.format("%.2f",imc) + ", Observación: " + observacion;
    }

    @Override
    public String toString() {
        return getDetalle();
    }
}
