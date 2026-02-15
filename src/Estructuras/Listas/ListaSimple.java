package Estructuras.Listas;

/**
 * Propósito: implementar una lista simplemente enlazada que permite
 * insertar y eliminar elementos al inicio y al final.
 */
public class ListaSimple extends Lista{

    /**
     * Propósito: insertar un elemento al inicio de la lista.
     * Entrada: dato a insertar.
     * Salida: ninguna.
     */
    // Inserta un elemento al inicio
    @Override
    public void insertarInicio(Object dato) {
        if (vacio())
            inicio = ultimo = new Nodo(dato);
        else
            inicio = new Nodo(dato,inicio);
    }

    /**
     * Propósito: insertar un elemento al final de la lista.
     * Entrada: dato a insertar.
     * Salida: ninguna.
     */
    // Inserta un elemento al final
    @Override
    public void insertarFinal(Object dato) {
        if (vacio()){
            inicio = ultimo = new Nodo(dato);
        }
        else{
            Nodo temp = new Nodo(dato);
            ultimo.setSiguiente(temp);
            ultimo = temp;
        }
    }

    /**
     * Propósito: eliminar el primer elemento de la lista.
     * Entrada: ninguna.
     * Salida: dato eliminado o null si la lista está vacía.
     */
    // Elimina el primer elemento
    @Override
    public Object eliminarInicio() {
        Object eliminado=null;
        if(vacio())
            System.out.println("La lista está vacía.");
        else
        if (inicio==ultimo){
            eliminado = inicio.getDato();
            inicio = ultimo = null;
        }
        else{
            eliminado = inicio.getDato();
            inicio = inicio.getSiguiente();
        }

        return eliminado;
    }

    /**
     * Propósito: eliminar el último elemento de la lista.
     * Entrada: ninguna.
     * Salida: dato eliminado o null si la lista está vacía.
     */
    // Elimina el último elemento
    @Override
    public Object eliminarFinal() {
        Object eliminado = null;
        if (vacio())
            System.out.println("La lista está vacía");
        else
        if (inicio==ultimo){
            eliminado = inicio.getDato();
            inicio = ultimo = null;
        }
        else{
            Nodo actual = inicio;
            while (actual.getSiguiente()!=ultimo)
                actual = actual.getSiguiente();
            eliminado = ultimo.getDato();
            actual.setSiguiente(null);
            ultimo = actual;
        }
        return eliminado;
    }
}
