package Logica;

import Estructuras.Colas.Cola;

import java.util.Scanner;

public class Triage {
    public static void registrarPaciente(Cola pilaPacientes){
        Scanner scan = new Scanner(System.in);
        String nombre;
        int ID;
        int gravedad;

        System.out.println(" Registrar paciente");
        System.out.print(" >> Nombre: ");
        nombre = scan.nextLine();
        System.out.print(" >> Gravedad (1-5): ");
        gravedad = scan.nextInt();
        Paciente paciente = new Paciente(nombre, pilaPacientes.size()+1, gravedad);

        pilaPacientes.enqueue(paciente);
        System.out.println("Paciente " + nombre + " añadido a la cola.\n");
    }
}
