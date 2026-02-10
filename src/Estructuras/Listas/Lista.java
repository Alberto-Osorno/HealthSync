package Estructuras.Listas;

public abstract class Lista {
    protected Nodo inicio;
    protected Nodo ultimo;

    //Constructores
    public Lista(){
        inicio = ultimo = null;
    }

    //Metodos
    public void imprimir(){
        Nodo actual = inicio;

        while(actual!=null){
            System.out.println(actual.getDato()+"->");
            actual = actual.getSiguiente();
        }
    }

    public boolean vacio(){
        return getInicio() == null;
    }

    //Metodos abstractos
    public abstract void insertarInicio(Object dato);
    public abstract void insertarFinal(Object dato);
    public abstract Object eliminarInicio();
    public abstract Object eliminarFinal();

    //Getters y Setters
    public Nodo getInicio() { return inicio; }
    public void setInicio(Nodo inicio) { this.inicio = inicio; }

    public Nodo getUltimo() { return ultimo; }
    public void setUltimo(Nodo ultimo) { this.ultimo = ultimo; }
}
