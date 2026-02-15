package Estructuras.Listas;

/**
 * Propósito: representar un nodo de una lista doblemente enlazada,
 * almacenando un dato y referencias al nodo siguiente y anterior.
 */
public class NodoDoble extends Nodo{
    protected NodoDoble siguiente;
    protected NodoDoble anterior;

    /**
     * Propósito: crear un nodo doble vacío.
     * Entrada: ninguna.
     * Salida: nodo inicializado sin referencias.
     */
    //Constructores
    public NodoDoble(){}

    /**
     * Propósito: crear un nodo doble con un dato inicial.
     * Entrada: dato a almacenar.
     * Salida: nodo inicializado sin conexiones.
     */
    public NodoDoble(Object dato){
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    /**
     * Propósito: crear un nodo doble con referencias al siguiente y anterior.
     * Entrada: dato a almacenar y nodos siguiente y anterior.
     * Salida: nodo inicializado con conexiones establecidas.
     */
    public NodoDoble(Object dato, NodoDoble siguiente, NodoDoble anterior){
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    /**
     * Propósito: devolver el dato del nodo en forma de texto.
     * Entrada: ninguna.
     * Salida: representación en texto del dato almacenado.
     */
    @Override
    public String toString(){
        return dato.toString();
    }

    //Getters y Setters

    /**
     * Propósito: obtener el nodo siguiente.
     * Entrada: ninguna.
     * Salida: referencia al nodo siguiente.
     */
    // Devuelve el nodo siguiente
    public NodoDoble getSiguiente() { return siguiente; }

    /**
     * Propósito: establecer el nodo siguiente.
     * Entrada: nodo que será asignado como siguiente.
     * Salida: ninguna.
     */
    // Establece el nodo siguiente
    public void setSiguiente(NodoDoble siguiente) { this.siguiente = siguiente; }

    /**
     * Propósito: obtener el nodo anterior.
     * Entrada: ninguna.
     * Salida: referencia al nodo anterior.
     */
    // Devuelve el nodo anterior
    public NodoDoble getAnterior() { return anterior; }

    /**
     * Propósito: establecer el nodo anterior.
     * Entrada: nodo que será asignado como anterior.
     * Salida: ninguna.
     */
    // Establece el nodo anterior
    public void setAnterior(NodoDoble anterior) { this.anterior = anterior; }
}
