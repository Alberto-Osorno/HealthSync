package Estructuras;

public class Nodo {
    private Nodo siguiente;
    private Object dato;

    //Constructores
    public Nodo(){}

    public Nodo(Object dato){
        this.siguiente = null;
        this.dato = dato;
    }

    public Nodo(Nodo siguiente, Object dato){
        this.siguiente = siguiente;
        this.dato = dato;
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
