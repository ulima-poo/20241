package com.mycompany.libro;

import java.util.Random;

public class Libro {
    // Atributos
    private String codigoLibro;
    private String titulo;
    private String autor;
    private double precioUnitario;
    private int unidadesVendidas;

    // Constructor con parámetros
    public Libro(String codigoLibro, String titulo, String autor) {
        this.codigoLibro = codigoLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.precioUnitario = 0.0;
        this.unidadesVendidas = 0;
    }

    // Métodos accesadores (getters)
    public String getCodigoLibro() {
        return codigoLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }

    // Métodos modificadores (setters)
    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void setUnidadesVendidas(int unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }

    // Método que genere aleatoriamente las unidades vendidas
    public void generarUnidadesVendidas() {
        final int MAX = 60;
        Random random = new Random();
        this.unidadesVendidas = random.nextInt(MAX - 1) + 1; // Valor entero mayor que cero y menor a 60
    }

    // Método que calcule y retorne el monto total de la venta por todos los libros
    public double calcularMontoTotalVenta() {
        return precioUnitario * unidadesVendidas;
    }

    // Método que retorne toda la información relacionada a la venta realizada
    public String obtenerInformacionVenta() {
        return "Código del Libro: " + codigoLibro + "\n" +
               "Título: " + titulo + "\n" +
               "Autor: " + autor + "\n" +
               "Unidades Vendidas: " + unidadesVendidas + "\n" +
               "Monto Total de Venta: " + calcularMontoTotalVenta();
    }
}

