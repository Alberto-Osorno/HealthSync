package Logica;

import Estructuras.Listas.ListaSimple;
import Estructuras.Listas.Nodo;

import java.util.Scanner;

import static Logica.Triage.pacienteEnConsulta;

/**
 * Propósito: administrar el historial médico y diagnósticos
 * de los pacientes dentro del sistema hospitalario.
 */
public class Expedientes {
    protected static int contadorDeDiagnosticosRegistrados = 0;

    /**
     * Propósito: agregar un nuevo diagnóstico al expediente del paciente.
     * Entrada: lista que representa el expediente del paciente.
     * Salida: diagnóstico agregado al expediente.
     */
    public static void agregarDiagnostico(ListaSimple expediente){
        Scanner scan = new Scanner(System.in);
        String descripcion;
        float precio;

        System.out.println(" >> [Sistema]: Agregar diagnostico.");
        System.out.print(" >> Diagnostico: ");
        descripcion = scan.nextLine();
        System.out.print(" >> Cargo: $");
        precio = scan.nextFloat();

        Diagnostico diagnostico = new Diagnostico(descripcion, precio);

        expediente.insertarFinal(diagnostico);
        contadorDeDiagnosticosRegistrados++;
        System.out.println(" >> [Sistema]: Nodo de historial enlazado correctamente.");
    }

    /**
     * Propósito: buscar un diagnóstico dentro del expediente.
     * Entrada: lista del expediente del paciente.
     * Salida: información del diagnóstico encontrado o mensaje de no encontrado.
     */
    public static void buscarDiagnostico(ListaSimple expediente){
        Scanner scan = new Scanner(System.in);
        String diagnosticoBuscado;
        boolean diagnosticoEncontrado = false;

        System.out.println(" >> [Sistema]: Buscar diagnostico.");
        System.out.print(" >> Diagnostico a buscar: ");
        diagnosticoBuscado = scan.nextLine();

        Nodo actual = expediente.getInicio();
        while (actual != null){
            Diagnostico auxiliar = (Diagnostico) actual.getDato();

            if (diagnosticoBuscado.equals(auxiliar.getDescripcion())) {
                diagnosticoEncontrado = true;
                break;
            }

            actual = actual.getSiguiente();
        }

        if(diagnosticoEncontrado){
            Diagnostico auxiliar = (Diagnostico) actual.getDato();
            System.out.println(" >> [Sistema]: El diagnostico fue encontrado.");
            System.out.println(" >> [Sistema]: El cargo del diagnostic fue de $" + auxiliar.getPrecio());
        } else {
            System.out.println(" >> [Sistema]: El diagnostico no fue encontrado.");
        }
    }

    /**
     * Propósito: calcular el total de cargos registrados en el expediente.
     * Entrada: lista del expediente del paciente.
     * Salida: monto total mostrado en pantalla.
     */
    public static void calcularTotal(ListaSimple expediente){
        float cargoTotal = 0;
        Nodo actual = expediente.getInicio();

        while (actual != null){
            Diagnostico auxiliar = (Diagnostico)actual.getDato();
            cargoTotal += auxiliar.getPrecio();
            actual = actual.getSiguiente();
        }

        System.out.println(" >> [Sistema] Cargo total: $" + cargoTotal);
    }

    /**
     * Propósito: mostrar el historial completo de diagnósticos del paciente.
     * Entrada: lista del expediente del paciente.
     * Salida: historial mostrado en pantalla.
     */
    public static void mostrarHistorial(ListaSimple expediente){
        if (!expediente.vacio()){
            Nodo actual = expediente.getInicio();

            System.out.println(" >> [Sistema]: Expediente de " + pacienteEnConsulta.getNombre());
            while (actual != null){
                Diagnostico auxiliar = (Diagnostico) actual.getDato();
                System.out.println(" >> " + auxiliar.getDescripcion() + " - $" + auxiliar.getPrecio());
                actual = actual.getSiguiente();
            }
        } else {
            System.out.println(" >> [Sistema]: El expediente está vacío.");
        }
    }

}
