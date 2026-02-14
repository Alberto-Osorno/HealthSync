/**
 * Clase abstracta para listas doblemente enlazadas.
 */


package Estructuras.Listas;

public abstract class ListaD extends Lista {
    protected NodoDoble inicio;
    protected NodoDoble ultimo;

    //Metodos

    // Verifica si la lista está vacía
    public boolean vacio() {
        return inicio == null;
    }

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
    public NodoDoble getInicio() { return inicio; }
    public NodoDoble getUltimo() { return ultimo; }
}
