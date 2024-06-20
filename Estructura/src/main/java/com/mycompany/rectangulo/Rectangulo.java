package com.mycompany.rectangulo;

public class Rectangulo {
    // Atributos
    private double longitud;
    private double anchura;

    // Constructor con valores predeterminados
    public Rectangulo() {
        this.longitud = 1.0;
        this.anchura = 1.0;
    }

    // Constructor con parámetros
    public Rectangulo(double longitud, double anchura) {
        setLongitud(longitud);
        setAnchura(anchura);
    }

    // Métodos accesadores (getters)
    public double getLongitud() {
        return longitud;
    }

    public double getAnchura() {
        return anchura;
    }

    // Métodos modificadores (setters) con validación
    public void setLongitud(double longitud) {
        if (longitud > 0.0 && longitud < 20.0) {
            this.longitud = longitud;
        } else {
            this.longitud = 1;
        }
    }

    public void setAnchura(double anchura) {
        if (anchura > 0.0 && anchura < 20.0) {
            this.anchura = anchura;
        } else {
            this.anchura = 1;
        }
    }

    // Método para calcular el perímetro del rectángulo
    public double calcularPerimetro() {
        return 2 * (longitud + anchura);
    }

    // Método para calcular el área del rectángulo
    public double calcularArea() {
        return longitud * anchura;
    }

    // Método para calcular la diagonal del rectángulo
    public double calcularDiagonal() {
        return Math.sqrt(Math.pow(longitud, 2) + Math.pow(anchura, 2));
    }

    @Override
    public String toString() {
        return "Longitud: " + longitud + "\n" +
               "Anchura: " + anchura + "\n" +
               "Perímetro: " + calcularPerimetro() + "\n" +
               "Área: " + calcularArea() + "\n" +
               "Diagonal: " + calcularDiagonal();
    }
}
