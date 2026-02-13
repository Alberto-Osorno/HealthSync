package Logica;

import Estructuras.Listas.ListaSimple;
import Estructuras.Listas.Nodo;

import java.util.Scanner;

import static Logica.Triage.pacienteEnConsulta;

public class Expedientes {
    protected static int contadorDeDiagnosticosRegistrados = 0;

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
