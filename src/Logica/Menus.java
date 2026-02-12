package Logica;

import Estructuras.Colas.Cola;
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
                case "1":
                    Triage.registrarPaciente(colaPacientes);
                    break;

                case "2":
                    Triage.llamarAConsulta(colaPacientes);
                    break;

                case "3":
                    Triage.verQuienSigue(colaPacientes);
                    break;

                case "4":
                    Triage.pacientesEnEspera(colaPacientes);
                    break;

                case "5":
                    break;

                default:
                    System.out.println("Opción invalida, intente de nuevo\n");
            }
        }while (!opcion.equals("5"));
    }

    public static void farmacia(Pila pilaAnalgesicos, Pila pilaAntibioticos, Pila pilaSueros){
        Scanner scan = new Scanner(System.in);
        String opcion;
        do{
            System.out.println();
            System.out.println("--- INVENTARIO DE FARMACIA ---");
            System.out.println("Aca hay que imprimir el size de las tres pilas" + "\n");
            System.out.println("[1] Abastecer medicamento");
            System.out.println("[2] Despachar medicamento de la cima");
            System.out.println("[3] EXTRAER ESPECÍFICO");
            System.out.println("[4] Ver stock actual");
            System.out.println("[5] Volver al Menú Principal");
            System.out.print("\n> Selección: ");
            opcion = scan.nextLine();

            switch (opcion) {
                case "1":
                    //Aca va el metodo que se haga cargo de eso
                    break;

                case "2":
                    //Aca va el metodo que se haga cargo de eso
                    break;

                case "3":
                    //Aca va el metodo que se haga cargo de eso
                    break;

                case "4":
                    //Aca va el metodo que se haga cargo de eso
                    break;

                case "5":
                    break;

                default:
                    System.out.println("Opción invalida, intente de nuevo");
            }
        }while (!opcion.equals("5"));
    }

    public static void expedientes(Paciente pacienteEnConsulta){
        Scanner scan = new Scanner(System.in);
        String opcion;
        do{
            System.out.println("--- EXPEDIENTE MÉDICO: [ " +  "Aca va el nombre del paciente" + " ] ---");
            System.out.println("ID: #" + "Aca va el numero de paciente que es" + " - Ingreso: " + "Aca va la fecha\n");
            System.out.println("[1] Agregar nuevo diagnóstico/síntoma");
            System.out.println("[2] Buscar diagnostico en el historial");
            System.out.println("[3] Calcular total de cargos médicos");
            System.out.println("[4] Mostrar historial completo");
            System.out.println("[5] Finalizar consulta y regresar");

            opcion = scan.nextLine();
            switch (opcion) {
                case "1":
                    //Aca va el metodo que se haga cargo de eso
                    break;

                case "2":
                    //Aca va el metodo que se haga cargo de eso
                    break;

                case "3":
                    //Aca va el metodo que se haga cargo de eso
                    break;

                case "4":
                    //Aca va el metodo que se haga cargo de eso
                    break;

                case "5":
                    break;

                default:
                    System.out.println("Opción invalida, intente de nuevo");
            }
        }while (!opcion.equals("5"));
    }

    public static void quirofanos(){
        Scanner scan = new Scanner(System.in);
        String opcion;
        do{
            System.out.println("--- FLUJO DE QUIRÓFANOS ---");
            System.out.println("Ruta: [PREPARACIÓN] <-> [CIRUGÍA] <-> [RECUPERACIÓN] <-> [ALTA]\n");
            System.out.println("[1] Avanzar paciente a siguiente etapa");
            System.out.println("[2] Retroceder paciente por complicación");
            System.out.println("[3] Insertar etapa de emergencia");
            System.out.println("[4] Ver ubicación actual del paciente");
            System.out.println("[5] Volver al Menú Principal");

            opcion = scan.nextLine();
            switch (opcion) {
                case "1":
                    //Aca va el metodo que se haga cargo de eso
                    break;

                case "2":
                    //Aca va el metodo que se haga cargo de eso
                    break;

                case "3":
                    //Aca va el metodo que se haga cargo de eso
                    break;

                case "4":
                    //Aca va el metodo que se haga cargo de eso
                    break;

                case "5":
                    break;

                default:
                    System.out.println("Opción invalida, intente de nuevo");
            }
        }while (!opcion.equals("5"));
    }
}
