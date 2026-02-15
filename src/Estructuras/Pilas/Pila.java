package Estructuras.Pilas;

import Estructuras.Listas.ListaSimple;

/**
 * Propósito: implementar una estructura de datos tipo pila (LIFO),
 * donde el último elemento en entrar es el primero en salir.
 */
public class Pila implements Stack{
    protected ListaSimple lista;
    protected int cont;

    /**
     * Propósito: crear una pila vacía inicializando su lista interna.
     * Entrada: ninguna.
     * Salida: pila inicializada.
     */
    //Constructor
    public Pila(){
        lista = new ListaSimple();
        cont = 0;
    }

    /**
     * Propósito: insertar un elemento en la parte superior de la pila.
     * Entrada: dato a insertar.
     * Salida: ninguna.
     */
    // Inserta un elemento en la pila
    @Override
    public void push(Object dato) {
        lista.insertarInicio(dato);
        cont++;
    }

    /**
     * Propósito: eliminar y devolver el elemento superior de la pila.
     * Entrada: ninguna.
     * Salida: elemento eliminado o null si la pila está vacía.
     */
    // Elimina el elemento superior de la pila
    @Override
    public Object pop() {
        if (lista.vacio()){
            return null;
        } else {
            cont--;
            return lista.eliminarInicio();
        }
    }

    /**
     * Propósito: obtener el elemento superior sin eliminarlo.
     * Entrada: ninguna.
     * Salida: elemento superior o null si está vacía.
     */
    // Devuelve el elemento superior sin eliminarlo
    @Override
    public Object top() {
        if (lista.vacio()){
            System.out.println("Pila vacia");
            return null;
        } else {
            return lista.getInicio().getDato();
        }
    }

    /**
     * Propósito: obtener la cantidad de elementos almacenados en la pila.
     * Entrada: ninguna.
     * Salida: número de elementos.
     */
    // Devuelve la cantidad de elementos en la pila
    @Override
    public int size() {
        return cont;
    }
    
    /**
     * Propósito: verificar si la pila está vacía.
     * Entrada: ninguna.
     * Salida: true si está vacía, false en caso contrario.
     */
    // Verifica si la pila está vacía
    @Override
    public boolean isEmpty() {
        return lista.vacio();
    }
}
