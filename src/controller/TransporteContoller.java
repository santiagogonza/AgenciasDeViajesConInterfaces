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
import model.TransporteModel;
import pojo.Transporte;

public class TransporteContoller {
    /**
     * declaración del objeto transporte 
     */
    TransporteModel transporte1 = new TransporteModel();

    /**
     * creamos la función crearTransporte que recive como parámetro transporte
     */
    public void crearTransporte(List<Transporte> lista, Transporte transporte) {
        transporte1.crearTransporte(lista, transporte);
    }
    
    /**
     * Creamos una función que se encarga de eliminar un dato dentro de la tabla
     */
    public void eliminarTransorte(List<Transporte> lista, String nombre){
      transporte1.eliminarTransporte(lista, nombre);
    }
    /**
     */
    public void mostrarTransporte(List<Transporte> lista, DefaultTableModel modelo) {
        transporte1.mostrarTransporte(lista, modelo);
    }

    public void actualizarTransporte(List<Transporte> lista, Transporte transporte) {
        transporte1.actualizarTransporte(lista, transporte);
    }

    public Transporte obtenerTransporte(List<Transporte> lista, int id) {
        return transporte1.obtenerTransporte(lista, id);
    }
}
