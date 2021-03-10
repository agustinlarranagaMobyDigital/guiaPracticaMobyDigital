package Models;

import java.sql.Date;

public class Cliente {

    private int id;
    private  String nombre;
    private  String apellido;
    private  String dni;
    private String telefono;
    private boolean consumidor_final;
    //private Date nacimiento
    private int descuento;

    public Cliente() {

    }
    public Cliente(String nombre, String apellido, String dni, String telefono,  boolean consumidor_final) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.consumidor_final = consumidor_final;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public boolean isConsumidor_final() {
        return consumidor_final;
    }

    public void setConsumidor_final(boolean consumidor_final) {
        this.consumidor_final = consumidor_final;
    }
}
