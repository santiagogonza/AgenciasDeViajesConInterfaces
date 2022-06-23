/*
@author: Gonzalo santiago Garcia
Fecha de creación: 25 de mayo del 2022
Fecha de actualización: 22 de junio del 2022
Descripción: En esta parte del programa contenera el pojo Viaje
que es importante dentro del proyecto. por lo tanto, en está clase se declarán
todos los atributos de la clase Viaje.
 */
package pojo;

public class Viaje {
/**
 * Declaración de los datos con su correspondiente tipo de dato
 */
    private long codigo;
    private String destino;
    private String salida;
    private String regreso;
    private int precio;

    /**
     * declaro un método de constructor vacío
     */
    public Viaje() {

    }
    //declaro un método con el constructor con los parámetros de la clase Viaje
    public Viaje(long codigo, String destino, String salida, String regreso, int precio) {
        this.codigo = codigo;
        this.destino = destino;
        this.salida = salida;
        this.regreso = regreso;
        this.precio = precio;
    }
    
    /**
     * 
     * métodos get y set de cada atributo
     */
    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getRegreso() {
        return regreso;
    }

    public void setRegreso(String regreso) {
        this.regreso = regreso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
