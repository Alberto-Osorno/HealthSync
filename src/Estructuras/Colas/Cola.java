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
    @Override
    public void enqueue(Object dato) {
        lista.insertarFinal(dato);
        cont++;
    }

    @Override
    public Object dequeue() {
        if (lista.vacio()){
            System.out.println("Cola vacía");
            return null;
        }
        else{
            cont--;
            return lista.eliminarInicio();
        }
    }

    @Override
    public int size() {
        return cont;
    }

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

    @Override
    public boolean isEmpty() {
        return lista.vacio();
    }
}
