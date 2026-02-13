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
    public NodoDoble getSiguiente() { return siguiente; }
    public void setSiguiente(NodoDoble siguiente) { this.siguiente = siguiente; }

    public NodoDoble getAnterior() { return anterior; }
    public void setAnterior(NodoDoble anterior) { this.anterior = anterior; }
}
