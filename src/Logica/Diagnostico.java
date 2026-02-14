package Logica;

/**
 * Propósito: representar un diagnóstico médico con su descripción
 * y el costo asociado dentro del sistema.
 */
public class Diagnostico {
    protected String descripcion;
    protected float precio;

    /**
     * Propósito: crear un diagnóstico con descripción y precio.
     * Entrada: descripción del diagnóstico y precio del servicio.
     * Salida: objeto diagnóstico inicializado.
     */
    //Constructor
    public Diagnostico(String descripcion, float precio){
        this.descripcion = descripcion;
        this.precio = precio;
    }

    //Getters y setters

    /**
     * Propósito: obtener la descripción del diagnóstico.
     * Entrada: ninguna.
     * Salida: descripción del diagnóstico.
     */
    public String getDescripcion() { return descripcion; }

    /**
     * Propósito: modificar la descripción del diagnóstico.
     * Entrada: nueva descripción.
     * Salida: ninguna.
     */
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    /**
     * Propósito: obtener el precio del diagnóstico.
     * Entrada: ninguna.
     * Salida: precio del diagnóstico.
     */
    public float getPrecio() { return precio; }

    /**
     * Propósito: modificar el precio del diagnóstico.
     * Entrada: nuevo precio.
     * Salida: ninguna.
     */
    public void setPrecio(float precio) { this.precio = precio; }
}
