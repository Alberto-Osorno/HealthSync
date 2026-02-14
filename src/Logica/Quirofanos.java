package Logica;

import Estructuras.Listas.ListaDoble;
import Estructuras.Listas.NodoDoble;

/**
 * Propósito: administrar el flujo de etapas por las que pasa
 * un paciente dentro del quirófano.
 */
public class Quirofanos {
    protected static NodoDoble etapaActual;

    /**
     * Propósito: establecer las etapas iniciales del flujo del quirófano.
     * Entrada: lista doble que contiene las etapas del proceso.
     * Salida: flujo inicial configurado y etapa actual definida.
     */
    public static void establecerFlujoInicial(ListaDoble etapasQuirofano){
        etapasQuirofano.insertarInicio("Preparación");
        etapasQuirofano.insertarFinal("Cirugía");
        etapasQuirofano.insertarFinal("Recuperación");
        etapasQuirofano.insertarFinal("Alta");

        etapaActual = (NodoDoble) etapasQuirofano.getInicio();
    }

    /**
     * Propósito: mover al paciente a la siguiente etapa del proceso.
     * Entrada: lista de etapas del quirófano.
     * Salida: actualización de la etapa actual del paciente.
     */
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

    /**
     * Propósito: regresar al paciente a la etapa anterior del proceso.
     * Entrada: lista de etapas del quirófano.
     * Salida: actualización de la etapa actual del paciente.
     */
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

    /**
     * Propósito: insertar una etapa de emergencia en el flujo del quirófano.
     * Entrada: lista de etapas del quirófano.
     * Salida: nueva etapa insertada y paciente movido a ella.
     */
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

    /**
     * Propósito: mostrar la etapa actual del paciente.
     * Entrada: ninguna.
     * Salida: etapa actual mostrada en pantalla.
     */
    public static void verUbicacion(){
        System.out.println(" >> [Sistema]: La etapa actual es " + etapaActual + ".");
    }
}

