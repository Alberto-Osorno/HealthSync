package Estructuras.Listas;

/**
 * Propósito: representar un nodo dentro de una lista enlazada,
 * almacenando un dato y una referencia al siguiente nodo.
 */
public class Nodo {
    protected Object dato;
    protected Nodo siguiente;

    /**
     * Propósito: crear un nodo vacío.
     * Entrada: ninguna.
     * Salida: nodo inicializado sin datos.
     */
    //Constructores
    public Nodo(){}

    /**
     * Propósito: crear un nodo con un dato inicial.
     * Entrada: dato a almacenar.
     * Salida: nodo inicializado con dato y sin siguiente.
     */
    public Nodo(Object dato){
        this.dato = dato;
        this.siguiente = null;
    }

    /**
     * Propósito: crear un nodo con dato y referencia al siguiente nodo.
     * Entrada: dato a almacenar y nodo siguiente.
     * Salida: nodo inicializado con referencias establecidas.
     */
    public Nodo(Object dato, Nodo siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }

    //Getters y Setters

    /**
     * Propósito: obtener el nodo siguiente.
     * Entrada: ninguna.
     * Salida: referencia al nodo siguiente.
     */
    // Devuelve el nodo siguiente
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * Propósito: establecer el nodo siguiente.
     * Entrada: nodo que será asignado como siguiente.
     * Salida: ninguna.
     */
    // Establece el nodo siguiente
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * Propósito: obtener el dato almacenado en el nodo.
     * Entrada: ninguna.
     * Salida: dato almacenado.
     */
    // Obtiene el dato almacenado en el nodo
    public Object getDato() {
        return dato;
    }

    /**
     * Propósito: modificar el dato almacenado en el nodo.
     * Entrada: nuevo dato a guardar.
     * Salida: ninguna.
     */
    // Modifica el dato almacenado en el nodo
    public void setDato(Object dato) {
        this.dato = dato;
    }
}

