/**
 * Clase abstracta que define una lista enlazada básica.
 * Sirve como base para listas simples y dobles.
 */


package Estructuras.Listas;

public abstract class Lista {
    protected Nodo inicio;
    protected Nodo ultimo;

    //Constructores
    public Lista(){
        inicio = ultimo = null;
    }

    //Metodos

    // Imprime todos los elementos de la lista
    public void imprimir(){
        Nodo actual = inicio;

        while(actual!=null){
            System.out.println(actual.getDato()+"->");
            actual = actual.getSiguiente();
        }
    }

    // Verifica si la lista está vacía
    public boolean vacio(){
        return getInicio() == null;
    }

    //Metodos abstractos

    // Inserta un elemento al inicio de la lista
    public abstract void insertarInicio(Object dato);
    // Inserta un elemento al final de la lista
    public abstract void insertarFinal(Object dato);
    // Elimina el primer elemento de la lista
    public abstract Object eliminarInicio();
    // Elimina el último elemento de la lista
    public abstract Object eliminarFinal();

    //Getters y Setters
    public Nodo getInicio() { return inicio; }
    public void setInicio(Nodo inicio) { this.inicio = inicio; }

    public Nodo getUltimo() { return ultimo; }
    public void setUltimo(Nodo ultimo) { this.ultimo = ultimo; }
}
