/**
 * Implementación de una lista simplemente enlazada.
 */


package Estructuras.Listas;

public class ListaSimple extends Lista{

    // Inserta un elemento al inicio
    @Override
    public void insertarInicio(Object dato) {
        if (vacio())
            inicio = ultimo = new Nodo(dato);
        else
            inicio = new Nodo(dato,inicio);
    }

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
