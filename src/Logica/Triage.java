package Logica;

import Estructuras.Colas.Cola;

import java.util.Scanner;

public class Triage {
    protected static Paciente pacienteEnConsulta = null;

    public static void registrarPaciente(Cola colaPacientes){
        Scanner scan = new Scanner(System.in);
        String nombre;
        int ID;
        int gravedad;

        System.out.println(" >> [Sistema]: Registrar paciente. ");
        System.out.print(" >> Nombre: ");
        nombre = scan.nextLine();
        System.out.print(" >> Gravedad (1-5): ");
        gravedad = scan.nextInt();
        Paciente paciente = new Paciente(nombre, colaPacientes.size()+1, gravedad);

        colaPacientes.enqueue(paciente);
        System.out.println(" >> [Sistema]: Paciente " + nombre + " añadido a la cola.");
    }

    public static void llamarAConsulta(Cola colaPacientes){
        if (!colaPacientes.isEmpty()){
            System.out.println(" >> [Sistema]: Llamando a consulta a " + colaPacientes.front() + ".");
            pacienteEnConsulta = (Paciente) colaPacientes.dequeue();
        } else {
            System.out.println(" >> [Sistema]: No hay pacientes esperando.");
        }
    }

    public static void verQuienSigue(Cola colaPacientes){
        if (!colaPacientes.isEmpty()){
            System.out.println(" >> [Sistema]: El siguiente paciente que va a pasar es: " + colaPacientes.front());
        } else {
            System.out.println(" >> [Sistema]: No hay pacientes esperando.");
        }
    }

    public static void pacientesEnEspera(Cola colaPacientes){
        Cola colaAuxiliar = new Cola();

        if (!colaPacientes.isEmpty()){
            System.out.println(" >> [Sistema]: Pacientes en espera: ");

            int numeroDePacientes = colaPacientes.size();
            for (int i = 0; i < numeroDePacientes; i++){
                System.out.println(" >> [Sistema]: " + colaPacientes.front());
                colaAuxiliar.enqueue(colaPacientes.dequeue());
            }

            colaPacientes.setCont(0);

            for (int i = 0; i < numeroDePacientes; i++){
                colaPacientes.enqueue(colaAuxiliar.dequeue());
            }
        } else {
            System.out.println(" >> [Sistema]: No hay pacientes esperando.");
        }
    }

    //Getter y Setter
    public Paciente getPacienteEnConsulta() { return pacienteEnConsulta; }
    public void setPacienteEnConsulta(Paciente pacienteEnConsulta) { Triage.pacienteEnConsulta = pacienteEnConsulta; }
}
