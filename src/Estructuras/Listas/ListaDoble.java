package Estructuras.Listas;

public class ListaDoble extends ListaD {
    @Override
    public void insertarInicio(Object dato) {
        if (vacio()) {
            inicio = ultimo = new NodoDoble(dato);
        } else {
            NodoDoble nuevo = new NodoDoble(dato, inicio, null);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }

    @Override
    public void insertarFinal(Object dato) {
        if (vacio()) {
            inicio = ultimo = new NodoDoble(dato);
        } else {
            NodoDoble nuevo = new NodoDoble(dato, null, ultimo);
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
    }

    @Override
    public Object eliminarInicio() {
        Object eliminado = null;
        if (vacio()) {
            System.out.println("La lista está vacía");
        } else if (inicio == ultimo) {
            eliminado = inicio.getDato();
            inicio = ultimo = null;
        } else {
            eliminado = inicio.getDato();
            inicio = inicio.getSiguiente();
            inicio.setAnterior(null);
        }
        return eliminado;
    }

    @Override
    public Object eliminarFinal() {
        Object eliminado = null;
        if (vacio()) {
            System.out.println("La lista está vacía");
        } else if (inicio == ultimo) {
            eliminado = ultimo.getDato();
            inicio = ultimo = null;
        } else {
            eliminado = ultimo.getDato();
            ultimo = ultimo.getAnterior();
            ultimo.setSiguiente(null);
        }
        return eliminado;
    }
}
