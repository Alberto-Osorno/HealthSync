package Estructuras.Listas;

public class Nodo {
    protected Object dato;
    protected Nodo siguiente;

    //Constructores
    public Nodo(){}

    public Nodo(Object dato){
        this.dato = dato;
        this.siguiente = null;
    }

    public Nodo(Object dato, Nodo siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }

    //Getters y Setters
    public Nodo getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Object getDato() {
        return dato;
    }
    public void setDato(Object dato) {
        this.dato = dato;
    }
}
