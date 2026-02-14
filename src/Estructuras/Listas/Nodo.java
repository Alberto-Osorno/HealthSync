/**
 * Representa un nodo de una lista enlazada,
 * contiene un dato y referencia al siguiente nodo.
 */


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

    // Devuelve el nodo siguiente
    public Nodo getSiguiente() {
        return siguiente;
    }

    // Establece el nodo siguiente
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    // Obtiene el dato almacenado en el nodo
    public Object getDato() {
        return dato;
    }

    // Modifica el dato almacenado en el nodo
    public void setDato(Object dato) {
        this.dato = dato;
    }
}
