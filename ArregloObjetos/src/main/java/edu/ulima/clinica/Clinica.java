package edu.ulima.clinica;

public class Clinica {
    private Paciente[] pacientes;
    private int numPacientes;

    public Clinica() {
        this.pacientes = new Paciente[50];
        this.numPacientes = 0;
    }

    public void ingresarPaciente(Paciente paciente) {
        if (numPacientes >= 50) {
            System.out.println("No hay espacio disponible para más pacientes.");
            return;
        }
        pacientes[numPacientes] = paciente;
        numPacientes++;
    }

    public Paciente[] obtenerPacientes() {
        Paciente[] lista = new Paciente[numPacientes];
        System.arraycopy(pacientes, 0, lista, 0, numPacientes);
        return lista;
    }

    public Paciente[] obtenerPacientesObesos() {
        int count = 0;
        for (int i = 0; i < numPacientes; i++) {
            if ("obeso".equals(pacientes[i].getObservacion())) {
                count++;
            }
        }
        Paciente[] obesos = new Paciente[count];
        int index = 0;
        for (int i = 0; i < numPacientes; i++) {
            if ("obeso".equals(pacientes[i].getObservacion())) {
                obesos[index] = pacientes[i];
                index++;
            }
        }
        return obesos;
    }

    public String getDetallePacientes() {
        StringBuilder detalle = new StringBuilder();
        for (int i = 0; i < numPacientes; i++) {
            detalle.append(pacientes[i].toString()).append("\n");
        }
        return detalle.toString();
    }

    public String getDetallePacientesObesos() {
        StringBuilder detalle = new StringBuilder();
        for (Paciente paciente : obtenerPacientesObesos()) {
            detalle.append(paciente.toString()).append("\n");
        }
        return detalle.toString();
    }
}
