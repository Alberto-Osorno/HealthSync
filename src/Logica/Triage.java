package Logica;

import Estructuras.Colas.Cola;

import java.util.Scanner;

/**
 * Propósito: gestionar el registro y atención de pacientes
 * mediante una cola de espera en el sistema hospitalario.
 */
public class Triage {
    protected static Paciente pacienteEnConsulta = null;
    protected static int ids = 1;

    /**
     * Propósito: registrar un nuevo paciente y agregarlo a la cola de espera.
     * Entrada: cola donde se almacenan los pacientes.
     * Salida: paciente agregado a la cola.
     */
    public static void registrarPaciente(Cola colaPacientes){
        Scanner scan = new Scanner(System.in);
        String nombre;
        int gravedad;

        System.out.println(" >> [Sistema]: Registrar paciente. ");
        System.out.print(" >> Nombre: ");
        nombre = scan.nextLine();
        System.out.print(" >> Gravedad (1-5): ");
        gravedad = scan.nextInt();
        Paciente paciente = new Paciente(nombre, ids, gravedad);
        ids++;

        colaPacientes.enqueue(paciente);
        System.out.println(" >> [Sistema]: Paciente " + nombre + " añadido a la cola.");
    }

    /**
     * Propósito: llamar al siguiente paciente de la cola para consulta.
     * Entrada: cola de pacientes en espera.
     * Salida: paciente enviado a consulta.
     */
    public static void llamarAConsulta(Cola colaPacientes){
        if (!colaPacientes.isEmpty()){
            System.out.println(" >> [Sistema]: Llamando a consulta a " + colaPacientes.front() + ".");
            pacienteEnConsulta = (Paciente) colaPacientes.dequeue();
        } else {
            System.out.println(" >> [Sistema]: No hay pacientes esperando.");
        }
    }

    /**
     * Propósito: mostrar quién es el siguiente paciente en espera.
     * Entrada: cola de pacientes.
     * Salida: nombre del siguiente paciente mostrado en pantalla.
     */
    public static void verQuienSigue(Cola colaPacientes){
        if (!colaPacientes.isEmpty()){
            System.out.println(" >> [Sistema]: El siguiente paciente que va a pasar es: " + colaPacientes.front());
        } else {
            System.out.println(" >> [Sistema]: No hay pacientes esperando.");
        }
    }

    /**
     * Propósito: mostrar todos los pacientes en espera sin alterar el orden de la cola.
     * Entrada: cola de pacientes.
     * Salida: listado de pacientes en espera mostrado en pantalla.
     */
    public static void pacientesEnEspera(Cola colaPacientes){
        Cola colaAuxiliar = new Cola();

        if (!colaPacientes.isEmpty()){
            System.out.println(" >> [Sistema]: Pacientes en espera: ");

            int numeroDePacientes = colaPacientes.size();
            for (int i = 0; i < numeroDePacientes; i++){
                System.out.println(" >> [Sistema]: " + colaPacientes.front());
                colaAuxiliar.enqueue(colaPacientes.dequeue());
            }

            ids -= numeroDePacientes;

            for (int i = 0; i < numeroDePacientes; i++){
                colaPacientes.enqueue(colaAuxiliar.dequeue());
            }
        } else {
            System.out.println(" >> [Sistema]: No hay pacientes esperando.");
        }
    }

    //Getter y Setter

    /**
     * Propósito: obtener el paciente que se encuentra en consulta.
     * Entrada: ninguna.
     * Salida: paciente en consulta.
     */
    public Paciente getPacienteEnConsulta() { return pacienteEnConsulta; }

    /**
     * Propósito: establecer el paciente actualmente en consulta.
     * Entrada: paciente en consulta.
     * Salida: ninguna.
     */
    public void setPacienteEnConsulta(Paciente pacienteEnConsulta) { Triage.pacienteEnConsulta = pacienteEnConsulta; }
}
