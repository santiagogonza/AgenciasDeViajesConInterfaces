/*
 * @autor: Gonzalo Santiago Garcia
 * Fecha de creación: 25 mayo del 2022
 * fecha de actualización: 9 de mayo 2022
 * Descripción: En la clase Transporte se declaran los atributos de esa clase
   y además se declara sus métodos get y set de cada atributo.
 */
package pojo;

public class Transporte {
    private long idTranspor;
    private int numAsiento;
    private String nombreTransport;

    public Transporte(){
        
    }
    
    public Transporte(long idTranspor, int numAsiento, String nombreTransport) {
        this.idTranspor = idTranspor;
        this.numAsiento = numAsiento;
        this.nombreTransport = nombreTransport;
    }

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
}
