package Estructuras.Listas;

/**
 * Propósito: definir la estructura base para listas enlazadas,
 * sirviendo como clase abstracta para listas simples y dobles.
 */
public abstract class Lista {
    protected Nodo inicio;
    protected Nodo ultimo;

    /**
     * Propósito: crear una lista vacía inicializando sus nodos.
     * Entrada: ninguna.
     * Salida: lista inicializada sin elementos.
     */
    //Constructores
    public Lista(){
        inicio = ultimo = null;
    }

    //Metodos

    /**
     * Propósito: imprimir todos los elementos almacenados en la lista.
     * Entrada: ninguna.
     * Salida: elementos mostrados en consola.
     */
    // Imprime todos los elementos de la lista
    public void imprimir(){
        Nodo actual = inicio;

        while(actual!=null){
            System.out.println(actual.getDato()+"->");
            actual = actual.getSiguiente();
        }
    }

    /**
     * Propósito: verificar si la lista está vacía.
     * Entrada: ninguna.
     * Salida: true si no contiene elementos, false en caso contrario.
     */
    // Verifica si la lista está vacía
    public boolean vacio(){
        return getInicio() == null;
    }

    //Metodos abstractos

    /**
     * Propósito: insertar un elemento al inicio de la lista.
     * Entrada: dato a insertar.
     * Salida: ninguna.
     */
    // Inserta un elemento al inicio de la lista
    public abstract void insertarInicio(Object dato);

    /**
     * Propósito: insertar un elemento al final de la lista.
     * Entrada: dato a insertar.
     * Salida: ninguna.
     */
    // Inserta un elemento al final de la lista
    public abstract void insertarFinal(Object dato);

    /**
     * Propósito: eliminar el primer elemento de la lista.
     * Entrada: ninguna.
     * Salida: elemento eliminado.
     */
    // Elimina el primer elemento de la lista
    public abstract Object eliminarInicio();

    /**
     * Propósito: eliminar el último elemento de la lista.
     * Entrada: ninguna.
     * Salida: elemento eliminado.
     */
    // Elimina el último elemento de la lista
    public abstract Object eliminarFinal();

    //Getters y Setters

    /**
     * Propósito: obtener el nodo inicial de la lista.
     * Entrada: ninguna.
     * Salida: nodo inicial.
     */
    public Nodo getInicio() { return inicio; }

    /**
     * Propósito: establecer el nodo inicial de la lista.
     * Entrada: nuevo nodo inicial.
     * Salida: ninguna.
     */
    public void setInicio(Nodo inicio) { this.inicio = inicio; }

    /**
     * Propósito: obtener el último nodo de la lista.
     * Entrada: ninguna.
     * Salida: nodo final.
     */
    public Nodo getUltimo() { return ultimo; }

    /**
     * Propósito: establecer el último nodo de la lista.
     * Entrada: nuevo nodo final.
     * Salida: ninguna.
     */
    public void setUltimo(Nodo ultimo) { this.ultimo = ultimo; }
}
