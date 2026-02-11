package Logica;

import Estructuras.Listas.ListaSimple;

public class Paciente {
    protected String nombre;
    protected int ID;
    protected int gravedad;
    protected ListaSimple expediente;

    public Paciente(String nombre, int ID, int gravedad){
        this.nombre  = nombre;
        this.ID = ID;
        this.gravedad = gravedad;
        expediente = new ListaSimple();
    }

    //Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getID() { return ID; }
    public void setID(int ID) { this.ID = ID; }

    public int getGravedad() { return gravedad; }
    public void setGravedad(int gravedad) { this.gravedad = gravedad; }

    public ListaSimple getExpediente() { return expediente; }
    public void setExpediente(ListaSimple expediente) { this.expediente = expediente;}
}
