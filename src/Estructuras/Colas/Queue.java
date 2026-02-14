/**
 * Interfaz Queue.
 * Define las operaciones básicas de una cola.
 */


package Estructuras.Colas;

public interface Queue {
    public void enqueue(Object dato);
    public Object dequeue();
    public int size();
    public Object front();
    public boolean isEmpty();
}
