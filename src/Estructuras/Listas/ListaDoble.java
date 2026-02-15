package Estructuras.Listas;

/**
 * Propósito: implementar una lista doblemente enlazada que permite
 * insertar y eliminar elementos tanto al inicio como al final.
 */
public class ListaDoble extends ListaD {
    
    /**
     * Propósito: insertar un elemento al inicio de la lista doble.
     * Entrada: dato a insertar.
     * Salida: ninguna.
     */
    // Inserta un elemento al inicio
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

    /**
     * Propósito: insertar un elemento al final de la lista doble.
     * Entrada: dato a insertar.
     * Salida: ninguna.
     */
    // Inserta un elemento al final
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

    /**
     * Propósito: eliminar el primer elemento de la lista doble.
     * Entrada: ninguna.
     * Salida: dato eliminado o null si la lista está vacía.
     */
    // Elimina el primer elemento
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

    /**
     * Propósito: eliminar el último elemento de la lista doble.
     * Entrada: ninguna.
     * Salida: dato eliminado o null si la lista está vacía.
     */
    // Elimina el último elemento
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

