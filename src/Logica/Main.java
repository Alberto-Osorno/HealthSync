package Logica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String modulo;

        do{
            System.out.println("  HEALTHSYNC - SISTEMA HOSPITALARIO DE EMERGENCIAS  ");
            System.out.println("====================================================");
            System.out.println("[1] TRIAGE");
            System.out.println("[2] FARMACIA");
            System.out.println("[3] EXPEDIENTES");
            System.out.println("[4] QUIRÓFANOS");
            System.out.println("[5] REPORTE DE ESTADO GLOBAL");
            System.out.println("[6] SALIR");

            modulo = scan.nextLine();

            switch (modulo){
                case "1":
                    Menus.triage();
                    break;

                case "2":
                    Menus.farmacia();
                    break;

                case "3":
                    Menus.expedientes();
                    break;

                case "4":
                    Menus.quirofanos();
                    break;

                case "5":
                    break;

                case "6":
                    System.out.println("SALIENDO...");
                    break;

                default:
                    System.out.println("OPCIÓN INVALIDA, INTENTE DE NUEVO");
            }

        } while(!modulo.equals("6"));
    }

}
