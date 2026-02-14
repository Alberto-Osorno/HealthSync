package Logica;

import Estructuras.Listas.ListaSimple;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Propósito: representar y almacenar la información de un paciente
 * dentro del sistema hospitalario.
 */
public class Paciente{
    protected String nombre;
    protected int ID;
    protected int gravedad;
    protected ListaSimple expediente;
    protected LocalDate fechaActual = LocalDate.now();
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    protected String fechaDeRegistro;

    /**
     * Propósito: crear un paciente con sus datos básicos.
     * Entrada: nombre del paciente, ID y nivel de gravedad.
     * Salida: objeto paciente inicializado.
     */
    //Constructor
    public Paciente(String nombre, int ID, int gravedad){
        this.nombre  = nombre;
        this.ID = ID;
        this.gravedad = gravedad;
        expediente = new ListaSimple();
        fechaDeRegistro = fechaActual.format(formato);
    }

    /**
     * Propósito: devolver el nombre del paciente como representación en texto.
     * Entrada: ninguna.
     * Salida: nombre del paciente en formato texto.
     */
    //Metodo
    public String toString(){
        return getNombre();
    }

    //Getters y Setters

    /**
     * Propósito: obtener el nombre del paciente.
     * Entrada: ninguna.
     * Salida: nombre del paciente.
     */
    public String getNombre() { return nombre; }

    /**
     * Propósito: modificar el nombre del paciente.
     * Entrada: nuevo nombre del paciente.
     * Salida: ninguna.
     */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /**
     * Propósito: obtener el ID del paciente.
     * Entrada: ninguna.
     * Salida: ID del paciente.
     */
    public int getID() { return ID; }

    /**
     * Propósito: modificar el ID del paciente.
     * Entrada: nuevo ID.
     * Salida: ninguna.
     */
    public void setID(int ID) { this.ID = ID; }

    /**
     * Propósito: obtener el nivel de gravedad del paciente.
     * Entrada: ninguna.
     * Salida: nivel de gravedad.
     */
    public int getGravedad() { return gravedad; }

    /**
     * Propósito: modificar el nivel de gravedad del paciente.
     * Entrada: nuevo nivel de gravedad.
     * Salida: ninguna.
     */
    public void setGravedad(int gravedad) { this.gravedad = gravedad; }

    /**
     * Propósito: obtener el expediente del paciente.
     * Entrada: ninguna.
     * Salida: lista con el expediente del paciente.
     */
    public ListaSimple getExpediente() { return expediente; }

    /**
     * Propósito: modificar el expediente del paciente.
     * Entrada: nueva lista de expediente.
     * Salida: ninguna.
     */
    public void setExpediente(ListaSimple expediente) { this.expediente = expediente;}
}
