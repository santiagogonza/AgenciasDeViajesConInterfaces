/*
 * @autor: Gonzalo Santiago Garcia
 * Fecha de creación: 01 de mayo del 2022
 * fecha de actualización: 22 de junio 2022
 * Descripción: En la clase Transporte se declaran los atributos de esa clase
   y además se declara sus métodos get y set de cada atributo.
 */
package pojo;

public class Transporte {
/**
 * declaración de los atributos con sus tipos de datos corresporndientes
 */
    private long idTranspor;
    private int numAsiento;
    private String nombreTransport;
    private int precio;
/**
 * Constructor vacio Transporte
 */
    public Transporte() {

    }
/**
 * Constructor con los parámetros de cada atributo
 */
    public Transporte(long idTranspor, int numAsiento, String nombreTransport, int precio) {
        this.idTranspor = idTranspor;
        this.numAsiento = numAsiento;
        this.nombreTransport = nombreTransport;
        this.precio = precio;
    }

    /**
     * 
     * Declaración del método get y set de cada atributo
     */
    public long getIdTranspor() {
        return idTranspor;
    }

    public void setIdTranspor(long idTranspor) {
        this.idTranspor = idTranspor;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }

    public String getNombreTransport() {
        return nombreTransport;
    }

    public void setNombreTransport(String nombreTransport) {
        this.nombreTransport = nombreTransport;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
