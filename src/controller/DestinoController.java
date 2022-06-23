/*
autor: Gonzalo Santiago Garcia
fecha de creación: 1 de junio del 2022
fecha de actualización: 22 de junio del 2022 
descripción: en esta parte creo la función de crear, eliminar, mostrar
y actualizar
 */
package controller;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.DestinoModel;
import pojo.Destino;

public class DestinoController {
    /**
     * creamos el objeto destinoM que se usa coomo una variable global que se
     * ocupara dentro del programa
     */
    DestinoModel destinoM = new DestinoModel();
    /**
     * creamos la función crearDestino que tiene como parámetro el tipo de dato
     * destino 
     */
    public void crearDestino(List<Destino> lista, Destino destino) {
        destinoM.crearDestino(lista, destino);
    }
    /**
     * creamos la función eliminar que se en carga de eliminar un destino  
     */
    public void eliminarDestino(List<Destino> lista, String nombre) {
        destinoM.eliminarDestino(lista, nombre);
    }
    /**
     * la función mostrar se encarga de mostrar los datos que serán 
     * correspondiente a la lista 
     * 
     */
    public void mostrarDestino(List<Destino> lista, DefaultTableModel modelo) {
        destinoM.mostrarDestino(lista, modelo);
    }
    /**
     *cramos una función que actualiza los datos de la lista y que recibe como
     * parámetro
     */
    public void actualizarDestino(List<Destino> lista, Destino destino) {
        destinoM.actualizarDestino(lista, destino);
    }

    /**
     * se crea una función en la cual obtiene un id 
     */
    public Destino obtenerUnDestino(List<Destino> lista, int id) {
        return destinoM.obtenerUnDestino(lista, id);
    }
}
