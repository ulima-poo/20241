package com.mycompany.cuadrado;

/**
 *
 * @author billy
 */
public class Circulo {
    // Atributos
    private double radio;

    // Constructor con parámetros
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Métodos accesadores (getters)
    public double getRadio() {
        return radio;
    }

    // Métodos modificadores (setters)
    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área del círculo
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método que retorne toda la información del círculo
    @Override
    public String toString() {
        return "Radio: " + radio + "\n" +
               "Área: " + calcularArea();
    }
}
