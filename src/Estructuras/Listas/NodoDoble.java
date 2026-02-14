/**
 * Nodo para lista doblemente enlazada,
 * contiene referencias al nodo siguiente y anterior.
 */

package Estructuras.Listas;

public class NodoDoble extends Nodo{
    protected NodoDoble siguiente;
    protected NodoDoble anterior;

    //Constructores
    public NodoDoble(){}

    public NodoDoble(Object dato){
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    public NodoDoble(Object dato, NodoDoble siguiente, NodoDoble anterior){
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    @Override
    public String toString(){
        return dato.toString();
    }

    //Getters y Setters

    // Devuelve el nodo siguiente
    public NodoDoble getSiguiente() { return siguiente; }
    // Establece el nodo siguiente
    public void setSiguiente(NodoDoble siguiente) { this.siguiente = siguiente; }

    // Devuelve el nodo anterior
    public NodoDoble getAnterior() { return anterior; }
    // Establece el nodo anterior
    public void setAnterior(NodoDoble anterior) { this.anterior = anterior; }
}
