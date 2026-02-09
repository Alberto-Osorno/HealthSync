package Estructuras;

public abstract class Lista {
    private Nodo primero;
    private Nodo ultimo;

    //Metodos
    public void imprimir(){
        Nodo actual = primero;
        while (actual != null){
            System.out.println(actual.getDato() + " -> ");
            actual = actual.getSiguiente();
        }
    }

    public boolean vacio(){
        return primero == null;
    }

    //Metodos abstractos
    public abstract void insertaInicio(Object dato);
    public abstract void insertaFinal(Object dato);
    public abstract void eliminarInicio();
    public abstract Object eliminarFinal();

    //Constructores
    public Lista(){
        primero = ultimo = null;
    }

    //Getters y Setters
    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }
}
