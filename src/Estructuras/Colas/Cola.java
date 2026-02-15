package Estructuras.Colas;

import Estructuras.Listas.ListaSimple;

/**
 * Propósito: implementar una estructura de datos tipo cola (FIFO),
 * donde el primer elemento en entrar es el primero en salir.
 */
public class Cola implements Queue{
    protected ListaSimple lista;
    protected int cont;

    /**
     * Propósito: crear una cola vacía inicializando su lista interna.
     * Entrada: ninguna.
     * Salida: cola inicializada.
     */
    //Constructor
    public Cola(){
        lista = new ListaSimple();
        cont = 0;
    }

    //Metodos

    /**
     * Propósito: insertar un elemento al final de la cola.
     * Entrada: dato a insertar en la cola.
     * Salida: ninguna.
     */
    // Inserta un elemento al final de la cola
    @Override
    public void enqueue(Object dato) {
        lista.insertarFinal(dato);
        cont++;
    }

    /**
     * Propósito: eliminar y devolver el primer elemento de la cola.
     * Entrada: ninguna.
     * Salida: elemento eliminado o null si la cola está vacía.
     */
    // Elimina y devuelve el primer elemento de la cola
    @Override
    public Object dequeue() {
        if (lista.vacio()){
            return null;
        }
        else{
            cont--;
            return lista.eliminarInicio();
        }
    }
    
    /**
     * Propósito: obtener la cantidad de elementos en la cola.
     * Entrada: ninguna.
     * Salida: número de elementos almacenados.
     */
    // Devuelve el número de elementos en la cola
    @Override
    public int size() {
        return cont;
    }
    
    /**
     * Propósito: obtener el primer elemento sin eliminarlo.
     * Entrada: ninguna.
     * Salida: elemento al inicio de la cola o null si está vacía.
     */
    // Obtiene el primer elemento sin eliminarlo
    @Override
    public Object front() {
        if (lista.vacio()){
            System.out.println("Cola vacía");
            return null;
        }
        else{
            return lista.getInicio().getDato();
        }
    }

    /**
     * Propósito: verificar si la cola está vacía.
     * Entrada: ninguna.
     * Salida: true si está vacía, false en caso contrario.
     */
    // Verifica si la cola está vacía
    @Override
    public boolean isEmpty() {
        return lista.vacio();
    }

    //Getters y Setters

    /**
     * Propósito: obtener la lista interna utilizada por la cola.
     * Entrada: ninguna.
     * Salida: lista interna.
     */
    public ListaSimple getLista() { return lista; }

    /**
     * Propósito: modificar la lista interna de la cola.
     * Entrada: nueva lista a utilizar.
     * Salida: ninguna.
     */
    public void setLista(ListaSimple lista) { this.lista = lista; }

    /**
     * Propósito: obtener el contador de elementos en la cola.
     * Entrada: ninguna.
     * Salida: número de elementos.
     */
    public int getCont() { return cont; }

    /**
     * Propósito: modificar el contador de elementos de la cola.
     * Entrada: nuevo valor del contador.
     * Salida: ninguna.
     */
    public void setCont(int cont) { this.cont = cont; }
}

