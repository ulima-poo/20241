/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pelota;

/**
 *
 * @author billy
 */
public class Pelota {
    private double radio;
    private String color;

    // Constructor con parámetros
    public Pelota(String color, double radio) {
        this.radio = radio;
        this.color = color;
    }

    // Métodos accesadores (getters)
    public double getRadio() {
        return radio;
    }

    public String getColor() {
        return color;
    }

    // Métodos modificadores (setters)
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Método para calcular el volumen de la pelota
    public double calcularVolumen() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }

    // Método para determinar si la pelota es de niño o niña
    public String saberGenero() {
        if(color.equalsIgnoreCase("rosado")){
            return "Es niña";
        }else{
            return "Es niño";
        }
    }

    // Método que retorne toda la información de la pelota
    @Override
    public String toString() {
        return "Radio: " + radio + "\n" +
               "Color: " + color + "\n" +
               "Volumen: " + calcularVolumen() + "\n" +
               "Tipo: " + saberGenero();
    }
}
