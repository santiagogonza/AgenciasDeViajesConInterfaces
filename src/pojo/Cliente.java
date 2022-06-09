/*
autor: Gonzalo Santiago Garcia
fecha de creación: 1 de mayo del 2022
fecha de actualización: 9 de junio del 2022 
descripción: declaración de los atributos con sus get y set de cada atributo 
por lo que se crea los atributos de la clase Cliente
 */
package pojo;

public class Cliente {

    private String nombre;
    private String apellidos;
    private String telefono;
    private String viaje;

    public Cliente() {

    }

    public Cliente(String nombre, String apellidos, String telefono, String viaje) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.viaje = viaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getViaje() {
        return viaje;
    }

    public void setViaje(String viaje) {
        this.viaje = viaje;
    }
}
