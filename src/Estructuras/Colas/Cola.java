/**
 * Clase Cola
 * Implementa una estructura de datos tipo cola (FIFO).
 * El primer elemento en entrar es el primero en salir.
 */

package Estructuras.Colas;

import Estructuras.Listas.ListaSimple;

public class Cola implements Queue{
    protected ListaSimple lista;
    protected int cont;

    //Constructor
    public Cola(){
        lista = new ListaSimple();
        cont = 0;
    }

    //Metodos

    // Inserta un elemento al final de la cola
    @Override
    public void enqueue(Object dato) {
        lista.insertarFinal(dato);
        cont++;
    }

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
    
    // Devuelve el número de elementos en la cola
    @Override
    public int size() {
        return cont;
    }
    
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

    // Verifica si la cola está vacía
    @Override
    public boolean isEmpty() {
        return lista.vacio();
    }

    //Getters y Setters
    public ListaSimple getLista() { return lista; }
    public void setLista(ListaSimple lista) { this.lista = lista; }

    public int getCont() { return cont; }
    public void setCont(int cont) { this.cont = cont; }
}
