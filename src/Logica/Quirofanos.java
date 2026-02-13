package Logica;

import Estructuras.Listas.ListaDoble;
import Estructuras.Listas.NodoDoble;

public class Quirofanos {
    protected static NodoDoble etapaActual;

    public static void establecerFlujoInicial(ListaDoble etapasQuirofano){
        etapasQuirofano.insertarInicio("Preparación");
        etapasQuirofano.insertarFinal("Cirugía");
        etapasQuirofano.insertarFinal("Recuperación");
        etapasQuirofano.insertarFinal("Alta");

        etapaActual = (NodoDoble) etapasQuirofano.getInicio();
    }

    public static void avanzarPaciente(ListaDoble etapasQuirofano){
        if (etapaActual != etapasQuirofano.getUltimo()){
            NodoDoble actual = (NodoDoble) etapasQuirofano.getInicio();

            while (actual != null){
                if (actual == etapaActual){
                    etapaActual = actual.getSiguiente();
                    break;
                }
                actual = actual.getSiguiente();
            }

            System.out.println(" >> [Sistema]: El paciente ha sido avanzado de \"" + actual + "\" a \"" + etapaActual + "\".");
            System.out.println(" >> [Sistema]: Apuntadores actualizados, Prev (" + etapaActual.getAnterior() + "), Next (" + etapaActual.getSiguiente() + ").");
        } else {
            System.out.println(" >> [Sistema]: El paciente se encuentra en la ultima etapa.");
        }
    }

    public static void retrocederPaciente(ListaDoble etapasQuirofano){
        if (etapaActual != etapasQuirofano.getInicio()){
            NodoDoble actual = (NodoDoble) etapasQuirofano.getInicio();

            while (actual != null){
                if (actual == etapaActual){
                    etapaActual = actual.getAnterior();
                    break;
                }
                actual = actual.getSiguiente();
            }

            System.out.println(" >> [Sistema]: El paciente ha sido devuelto de \"" + actual + "\" a \"" + etapaActual + "\".");
            System.out.println(" >> [Sistema]: Apuntadores actualizados, Prev (" + etapaActual.getAnterior() + "), Next (" + etapaActual.getSiguiente() + ").");
        } else {
            System.out.println(" >> [Sistema]: El paciente se encuentra en la primera etapa.");
        }
    }

    public static void insertarEtapa(ListaDoble etapasQuirofano){
        if (etapaActual != etapasQuirofano.getUltimo()){
            NodoDoble siguiente = etapaActual.getSiguiente();
            NodoDoble nuevo = new NodoDoble("Emergencia", siguiente, etapaActual);
            siguiente.setAnterior(nuevo);
            etapaActual.setSiguiente(nuevo);

            etapaActual = etapaActual.getSiguiente();
            System.out.println(" >> [Sistema]: El paciente se movió a la nueva etapa de emergencia correctamente");
        } else {
            etapasQuirofano.insertarFinal("Emergencia");
            etapaActual = etapaActual.getSiguiente();
            System.out.println(" >> [Sistema]: El paciente se movió a la nueva etapa de emergencia correctamente");
        }
    }

    public static void verUbicacion(){
        System.out.println(" >> [Sistema]: La etapa actual es " + etapaActual + ".");
    }
}
