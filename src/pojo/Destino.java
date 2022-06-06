/*
 @author: Gonzalo santiago Garcia
Fecha de creación: 25 de mayo del 2022
Fecha de actualización: ----
Descripción: En esta parte del programa contenera el pojo Destino
 que es importante dentro del proyecto. por lo tanto, en está clase se declarán
todos los atributos de la clase Destino.
 */
package pojo;

public class Destino {

    private long idlugar;
    private String nombre;
    private String direccion;
    private String telefono;
    private int codigoPost;

    public Destino() {

    }

    public Destino(long idlugar, String nombre, String direccion, String telefono, int codigoPost) {
        this.idlugar = idlugar;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.codigoPost = codigoPost;
    }

    public long getIdlugar() {
        return idlugar;
    }

    public void setIdlugar(long idlugar) {
        this.idlugar = idlugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCodigoPost() {
        return codigoPost;
    }

    public void setCodigoPost(int codigoPost) {
        this.codigoPost = codigoPost;
    }
}
