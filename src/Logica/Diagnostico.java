package Logica;

public class Diagnostico {
    protected String descripcion;
    protected float precio;

    //Constructor
    public Diagnostico(String descripcion, float precio){
        this.descripcion = descripcion;
        this.precio = precio;
    }

    //Getters y setters
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public float getPrecio() { return precio; }
    public void setPrecio(float precio) { this.precio = precio; }
}
