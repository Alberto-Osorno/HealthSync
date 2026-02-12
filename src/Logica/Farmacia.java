package Logica;

import Estructuras.Pilas.Pila;

import java.util.Scanner;

public class Farmacia {
    public static void abastecerPila(Pila pila){
        Scanner scan = new Scanner(System.in);
        String medicamento;

        System.out.println(" >> [Sistema]: Ingresar medicamento");
        System.out.print(" >> Nombre: ");
        medicamento = scan.nextLine();
        pila.push(medicamento);
    }

    public static void despacharMedicamento(Pila pila){
        if (!pila.isEmpty()){
            System.out.println(" >> [Sistema]: Despachando: " + pila.pop());
        } else {
            System.out.println(" >> [Sistema]: La pila esta vacía.");
        }
    }

    public static void extraerEspecifico(Pila pila){
        Scanner scan = new Scanner(System.in);
        Pila pilaAuxiliar = new Pila();
        boolean medicamentoEncontrado = false;
        String medicamento;

        if (!pila.isEmpty()){
            System.out.println(" >> [Sistema]: Ingresar medicamento deseado");
            System.out.print(" >> Nombre: ");
            medicamento = scan.nextLine();

            while (!pila.isEmpty()){
                if (pila.top().equals(medicamento)){
                    medicamentoEncontrado = true;
                    break;
                } else {
                    pilaAuxiliar.push(pila.pop());
                }
            }

            if (medicamentoEncontrado){
                System.out.println(" >> [Sistema]: Despachando: " + pila.pop());
            } else {
                System.out.println(" >> [Sistema]: Medicamento no encontrado.");
            }

            while (!pilaAuxiliar.isEmpty()){
                pila.push(pilaAuxiliar.pop());
            }

        } else {
            System.out.println(" >> [Sistema]: La pila esta vacía.");
        }

    }
}
