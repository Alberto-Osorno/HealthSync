package Estructuras.Listas;

/**
 * Propósito: definir la estructura base para listas doblemente enlazadas,
 * permitiendo recorrer elementos hacia adelante y hacia atrás.
 */
public abstract class ListaD extends Lista {
    protected NodoDoble inicio;
    protected NodoDoble ultimo;

    //Metodos

    /**
     * Propósito: verificar si la lista doble está vacía.
     * Entrada: ninguna.
     * Salida: true si no contiene elementos, false en caso contrario.
     */
    // Verifica si la lista está vacía
    public boolean vacio() {
        return inicio == null;
    }

    /**
     * Propósito: imprimir los elementos de la lista de inicio a fin.
     * Entrada: ninguna.
     * Salida: elementos mostrados en consola.
     */
    // Imprime la lista de inicio a fin
    public void imprimir() {
        NodoDoble actual = inicio;
        while (actual != null) {
            if (actual != ultimo) {
                System.out.print("[" + actual.getDato() + "]<->");
            } else {
                System.out.print("[" + actual.getDato() + "]");
            }
            actual = actual.getSiguiente();
        }
        System.out.println();
    }

    /**
     * Propósito: imprimir los elementos de la lista en orden inverso.
     * Entrada: ninguna.
     * Salida: elementos mostrados en consola en orden inverso.
     */
    // Imprime la lista en orden inverso
    public void imprimirAlReves() {
        NodoDoble actual = ultimo;
        while (actual != null) {
            if (actual != inicio) {
                System.out.print("[" + actual.getDato() + "]<-");
            } else {
                System.out.print("[" + actual.getDato() + "]");
            }
            actual = actual.getAnterior();
        }
        System.out.println();
    }

    //Getter y Setter

    /**
     * Propósito: obtener el nodo inicial de la lista doble.
     * Entrada: ninguna.
     * Salida: nodo inicial.
     */
    public NodoDoble getInicio() { return inicio; }

    /**
     * Propósito: obtener el último nodo de la lista doble.
     * Entrada: ninguna.
     * Salida: nodo final.
     */
    public NodoDoble getUltimo() { return ultimo; }
}
