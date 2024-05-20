/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuadrado;

/**
 *
 * @author billy
 */
public class Puerta {
    // Atributos
    private double ancho;
    private double alto;

    // Constructor con parámetros
    public Puerta(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Métodos accesadores (getters)
    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    // Métodos modificadores (setters) con validación
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    // Método para calcular el área de la puerta
    public double calcularArea() {
        return ancho * alto;
    }

    // Método toString para retornar toda la información de la puerta
    @Override
    public String toString() {
        return "Ancho: " + ancho + "\n" +
               "Alto: " + alto + "\n" +
               "Área: " + calcularArea();
    }
}
