package Logica;

import Estructuras.Colas.Cola;
import Estructuras.Listas.ListaDoble;
import Estructuras.Listas.NodoDoble;
import Estructuras.Pilas.Pila;

import java.util.Scanner;

public class Menus {
    public static void triage(Cola colaPacientes){
        Scanner scan = new Scanner(System.in);
        String opcion;
        do{
            System.out.println();
            System.out.println("--- GESTIÓN DE TRIAJE ---");
            System.out.println("Estado: " + colaPacientes.size() + " Pacientes esperando. \n");
            System.out.println("[1] Registrar llegada de paciente");
            System.out.println("[2] Llamar a consulta/valoración");
            System.out.println("[3] Ver quién es el siguiente en turno");
            System.out.println("[4] Listar todo los pacientes en espera");
            System.out.println("[5] Volver al Menú Principal");
            System.out.print("\n> Selección: ");
            opcion = scan.nextLine();

            switch (opcion) {
                case "1": Triage.registrarPaciente(colaPacientes); break;
                case "2": Triage.llamarAConsulta(colaPacientes); break;
                case "3": Triage.verQuienSigue(colaPacientes); break;
                case "4": Triage.pacientesEnEspera(colaPacientes); break;
                case "5": break;
                default: System.out.println("> [Sistema]: Opción invalida, intente de nuevo.");
            }
        }while (!opcion.equals("5"));
    }

    public static void farmacia(Pila pilaAnalgesicos, Pila pilaAntibioticos, Pila pilaSueros){
        Scanner scan = new Scanner(System.in);
        String opcion;
        do{
            System.out.println();
            System.out.println("--- INVENTARIO DE FARMACIA ---");
            System.out.print("[Pila Analgésicos: " + pilaAnalgesicos.size() + " ] | ");
            System.out.print("[Pila Antibióticos: " + pilaAntibioticos.size() + " ] | ");
            System.out.print("[Pila Sueros: " + pilaSueros.size() + " ]\n\n");
            System.out.println("[1] Abastecer medicamento");
            System.out.println("[2] Despachar medicamento de la cima");
            System.out.println("[3] EXTRAER ESPECÍFICO");
            System.out.println("[4] Ver stock actual");
            System.out.println("[5] Volver al Menú Principal");
            System.out.print("\n> Selección: ");
            opcion = scan.nextLine();

            String pilaSeleccionada;
            switch (opcion) {
                case "1":
                    do {
                        System.out.println();
                        System.out.println(" >> [Sistema]: ¿Que pila quiere abastecer?");
                        System.out.println(" >> [1] Analgésicos");
                        System.out.println(" >> [2] Antibióticos");
                        System.out.println(" >> [3] Sueros");
                        System.out.println(" >> [4] Cancelar");
                        System.out.print("\n >> Selección: ");
                        pilaSeleccionada = scan.nextLine();

                        switch (pilaSeleccionada){
                            case "1": Farmacia.abastecerPila(pilaAnalgesicos); break;
                            case "2": Farmacia.abastecerPila(pilaAntibioticos); break;
                            case "3": Farmacia.abastecerPila(pilaSueros); break;
                            case "4": break;
                            default: System.out.println(" >> [Sistema]: Opción invalida, intente de nuevo.");
                        }
                    }while (!(pilaSeleccionada.equals("1") || pilaSeleccionada.equals("2") || pilaSeleccionada.equals("3")));

                    break;

                case "2":
                    do {
                        System.out.println();
                        System.out.println(" >> [Sistema]: ¿De que pila quiere despachar?");
                        System.out.println(" >> [1] Analgésicos");
                        System.out.println(" >> [2] Antibióticos");
                        System.out.println(" >> [3] Sueros");
                        System.out.println(" >> [4] Cancelar");
                        System.out.print("\n >> Selección: ");
                        pilaSeleccionada = scan.nextLine();

                        switch (pilaSeleccionada){
                            case "1": Farmacia.despacharMedicamento(pilaAnalgesicos); break;
                            case "2": Farmacia.despacharMedicamento(pilaAntibioticos); break;
                            case "3": Farmacia.despacharMedicamento(pilaSueros); break;
                            case "4": break;
                            default: System.out.println(" >> [Sistema]: Opción invalida, intente de nuevo.");
                        }
                    }while (!(pilaSeleccionada.equals("1") || pilaSeleccionada.equals("2") || pilaSeleccionada.equals("3")));

                    break;

                case "3":
                    do {
                        System.out.println();
                        System.out.println(" >> [Sistema]: ¿De que pila quiere extraer?");
                        System.out.println(" >> [1] Analgésicos");
                        System.out.println(" >> [2] Antibióticos");
                        System.out.println(" >> [3] Sueros");
                        System.out.println(" >> [4] Cancelar");
                        System.out.print("\n >> Selección: ");
                        pilaSeleccionada = scan.nextLine();

                        switch (pilaSeleccionada){
                            case "1": Farmacia.extraerEspecifico(pilaAnalgesicos); break;
                            case "2": Farmacia.extraerEspecifico(pilaAntibioticos); break;
                            case "3": Farmacia.extraerEspecifico(pilaSueros); break;
                            case "4": break;
                            default: System.out.println(" >> [Sistema]: Opción invalida, intente de nuevo.");
                        }
                    }while (!(pilaSeleccionada.equals("1") || pilaSeleccionada.equals("2") || pilaSeleccionada.equals("3")));

                    break;

                case "4": Farmacia.verStock(pilaAnalgesicos, pilaAntibioticos, pilaSueros); break;
                case "5": break;
                default: System.out.println("Opción invalida, intente de nuevo");
            }
        }while (!opcion.equals("5"));
    }

    public static void expedientes(Paciente pacienteEnConsulta){
        if (pacienteEnConsulta != null){
            Scanner scan = new Scanner(System.in);
            String ID = String.format("%04d", pacienteEnConsulta.getID());
            String opcion;
            do{
                System.out.println();
                System.out.println("--- EXPEDIENTE MÉDICO: [ " +  pacienteEnConsulta.getNombre().toUpperCase() + " ] ---");
                System.out.println("ID: #" + ID + " - Ingreso: " + pacienteEnConsulta.fechaDeRegistro +"\n");
                System.out.println("[1] Agregar nuevo diagnóstico/síntoma");
                System.out.println("[2] Buscar diagnostico en el historial");
                System.out.println("[3] Calcular total de cargos médicos");
                System.out.println("[4] Mostrar historial completo");
                System.out.println("[5] Finalizar consulta y regresar");
                System.out.print("\n> Selección: ");
                opcion = scan.nextLine();

                switch (opcion) {
                    case "1": Expedientes.agregarDiagnostico(pacienteEnConsulta.getExpediente());break;
                    case "2": Expedientes.buscarDiagnostico(pacienteEnConsulta.getExpediente());break;
                    case "3": Expedientes.calcularTotal(pacienteEnConsulta.getExpediente());break;
                    case "4": Expedientes.mostrarHistorial(pacienteEnConsulta.getExpediente());break;
                    case "5": break;
                    default: System.out.println("> [Sistema]: Opción invalida, intente de nuevo.");
                }
            }while (!opcion.equals("5"));
        } else {
            System.out.println("> [Sistema]: No hay ningún paciente en consulta.");
        }
    }

    public static void quirofanos(ListaDoble etapasQuirofano){
        Scanner scan = new Scanner(System.in);
        String opcion;
        do{
            System.out.println();
            System.out.println("--- FLUJO DE QUIRÓFANOS ---");
            System.out.print("Ruta: ");

            NodoDoble actual = (NodoDoble) etapasQuirofano.getInicio();
            while(actual != null){
                if (actual != etapasQuirofano.getUltimo()){
                    System.out.print("[" + actual.getDato() + "]<->");
                } else {
                    System.out.print("[" + actual.getDato() + "]");
                }

                actual = actual.getSiguiente();
            }

            System.out.println();
            System.out.println("[1] Avanzar paciente a siguiente etapa");
            System.out.println("[2] Retroceder paciente por complicación");
            System.out.println("[3] Insertar etapa de emergencia");
            System.out.println("[4] Ver ubicación actual del paciente");
            System.out.println("[5] Volver al Menú Principal");
            System.out.print(" >> Selección: ");
            opcion = scan.nextLine();

            switch (opcion) {
                case "1": Quirofanos.avanzarPaciente(etapasQuirofano); break;
                case "2": Quirofanos.retrocederPaciente(etapasQuirofano); break;
                case "3": Quirofanos.insertarEtapa(etapasQuirofano); break;
                case "4": Quirofanos.verUbicacion(); break;
                case "5": break;
                default: System.out.println("Opción invalida, intente de nuevo");
            }
        }while (!opcion.equals("5"));
    }
}
