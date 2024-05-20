package com.mycompany.matricula;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lucinda
 */
public class AlumnoFIS {
    private String codigo;
    private String nombre;
    private int creditosMatriculados;
    private double precioCredito;

    
    public AlumnoFIS(String codigo, String nombre, int creditosMatriculados, double precioCredito) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditosMatriculados = creditosMatriculados;
        this.precioCredito = precioCredito;
    }
    
    public double calcularMontoTotalCiclo(){
        return this.creditosMatriculados*this.precioCredito;
    }
            
  
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCreditosMatriculados(int creditosMatriculados) {
        this.creditosMatriculados = creditosMatriculados;
    }

    public void setPrecioCredito(double precioCredito) {
        this.precioCredito = precioCredito;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCreditosMatriculados() {
        return creditosMatriculados;
    }

    public double getPrecioCredito() {
        return precioCredito;
    }
    
    public String getDatosAlumno(){
        String datos ="";
        
        datos += "Codigo: " + this.codigo+  "\n"
                + "Nombres: " + this.nombre + "\n"
                + "Cred. Matriculados: " + this.creditosMatriculados + "\n"
                + "Escala: " + this.precioCredito + "\n"
                + "Pension mensual: " + this.calcularMontoTotalCiclo()/4 + "\n";
        
        return datos;    
    }
    
    
    
}
