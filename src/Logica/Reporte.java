package Logica;

import Estructuras.Colas.Cola;
import Estructuras.Pilas.Pila;

import java.util.Scanner;

import static Logica.Expedientes.contadorDeDiagnosticosRegistrados;

public class Reporte {
    public static void imprimirDatos(Cola colaPacientes, Pila pilaAnalgesicos, Pila pilaAntibioticos, Pila pilaSueros){
        Scanner scan = new Scanner(System.in);
        String enter;

        System.out.println();
        System.out.println("========================================");
        System.out.println("     REPORTE DE ESTADO HOSPITALARIO     ");
        System.out.println("========================================");
        System.out.println();
        System.out.println("TRIAJE:");
        System.out.println(" *Pacientes en espera: " + colaPacientes.size() + ".");
        System.out.println(" *Tiempo estimado de espera: " + colaPacientes.size()*(3) + " minutos.");
        System.out.println();
        System.out.println("FARMACIA:");

        if(pilaAnalgesicos.size() < 3 || pilaAntibioticos.size() < 3 || pilaSueros.size() < 3){
            if (pilaAnalgesicos.size() < 3) System.out.println(" *Alerta: Pila de \"Analgesicos\" con menos de 3 unidades");
            if (pilaAntibioticos.size() < 3) System.out.println(" *Alerta: Pila de \"Antibioticos\" con menos de 3 unidades");
            if (pilaSueros.size() < 3) System.out.println(" *Alerta: Pila de \"Sueros\" con menos de 3 unidades");
        } else {
            System.out.println(" *Todas las pilas tienen suficientes unidades");
        }

        System.out.println();
        System.out.println("PACIENTES ACTIVOS:");
        System.out.println(" *Total de diagnósticos registrados hoy: " + contadorDeDiagnosticosRegistrados + ".");
        System.out.println(" *Paciente #" + "Aca va el ID del paciente" + " en etapa: " + "Aca va la etapa" + ".");
        System.out.println();
        System.out.println("Presione ENTER para continuar...");
        enter = scan.nextLine();
    }
}
