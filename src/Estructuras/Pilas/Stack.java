/**
 * Interfaz Stack.
 * Define las operaciones básicas de una pila.
 */

package Estructuras.Pilas;

public interface Stack {
    public void push(Object dato);
    public Object pop();
    public Object top();
    public int size();
    public boolean isEmpty();
}
