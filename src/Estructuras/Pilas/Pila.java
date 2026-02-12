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

    @Override
    public void push(Object dato) {
        lista.insertarInicio(dato);
        cont++;
    }

    @Override
    public Object pop() {
        if (lista.vacio()){
            return null;
        } else {
            cont--;
            return lista.eliminarInicio();
        }
    }

    @Override
    public Object top() {
        if (lista.vacio()){
            System.out.println("Pila vacia");
            return null;
        } else {
            return lista.getInicio().getDato();
        }
    }

    @Override
    public int size() {
        return cont;
    }

    @Override
    public boolean isEmpty() {
        return lista.vacio();
    }
}
