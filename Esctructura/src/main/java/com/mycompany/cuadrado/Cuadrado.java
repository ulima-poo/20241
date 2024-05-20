/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuadrado;

/**
 *
 * @author billy
 */
public class Cuadrado {
    // Atributos
    private double lado;;

    // Constructor con parámetros
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    // Métodos accesadores (getters)
    public double getLado() {
        return lado;
    }

    // Métodos modificadores (setters)
    public void setLado(double lado) {
        this.lado = lado;
    }

    // Método para calcular el área del cuadrado
    public double calcularArea() {
        return lado * lado;
    }

    // Método que retorne toda la información del cuadrado
    @Override
    public String toString() {
        return "Lado: " + lado + "\n" +
               "Área: " + calcularArea();
    }
}

