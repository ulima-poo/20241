package edu.ulima.salarios;

import java.util.Scanner;

public class GestionEmpleado {
    private Empleado[] empleados;
    private int totalEmpleados;

    public GestionEmpleado() {
        empleados = new Empleado[10];
        totalEmpleados = 0;
    }

    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        if (totalEmpleados < empleados.length) {
            System.out.println("Ingrese código del empleado:");
            String codigo = scanner.nextLine();
            System.out.println("Ingrese nombre del empleado:");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese horas trabajadas:");
            int horasTrabajadas = scanner.nextInt();
            System.out.println("Ingrese sueldo por hora:");
            double sueldoPorHora = scanner.nextDouble();
            scanner.nextLine();  // Consumir el salto de línea

            empleados[totalEmpleados] = new Empleado(codigo, nombre, horasTrabajadas, sueldoPorHora);
            totalEmpleados++;
        } else {
            System.out.println("No hay espacio disponible para más empleados.");
        }
    }

    public void buscarEmpleado() {
        if (totalEmpleados == 0) {
            System.out.println("No hay empleados registrados.");
            return;
        }

        double maxSalario = empleados[0].calcularSalario();
        for (int i = 1; i < totalEmpleados; i++) {
            double salarioActual = empleados[i].calcularSalario();
            if (salarioActual > maxSalario) {
                maxSalario = salarioActual;
            }
        }

        System.out.println("Empleados con mayor salario:");
        for (int i = 0; i < totalEmpleados; i++) {
            if (empleados[i].calcularSalario() == maxSalario) {
                System.out.println("Código: " + empleados[i].getCodigo() +
                                   ", \nNombre: " + empleados[i].getNombre() +
                                   ", \nHoras Trabajadas: " + empleados[i].getHorasTrabajadas() +
                                   ", \nSueldo por Hora: " + empleados[i].getSueldoPorHora() +
                                   ", \nSalario: " + empleados[i].calcularSalario());
            }
        }
    }
}
