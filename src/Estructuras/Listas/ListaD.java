package Estructuras.Listas;

public abstract class ListaD extends Lista {
    protected NodoDoble inicio;
    protected NodoDoble ultimo;

    //Metodos
    public boolean vacio() {
        return inicio == null;
    }

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
