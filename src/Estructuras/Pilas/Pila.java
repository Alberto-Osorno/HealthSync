package Estructuras.Pilas;

import Estructuras.Listas.ListaSimple;

public class Pila implements Stack{
    protected ListaSimple lista;
    protected int cont;

    //Constructor
    public Pila(){
        lista = new ListaSimple();
        cont = 0;
    }

    // Inserta un elemento en la pila
    @Override
    public void push(Object dato) {
        lista.insertarInicio(dato);
        cont++;
    }

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

    // Devuelve la cantidad de elementos en la pila
    @Override
    public int size() {
        return cont;
    }
    
    // Verifica si la pila está vacía
    @Override
    public boolean isEmpty() {
        return lista.vacio();
    }
}
