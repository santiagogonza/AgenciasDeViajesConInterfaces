/*
autor: Gonzalo Santiago Garcia
fecha de creación: 1 de junio del 2022
fecha de actualización: 9 de junio del 2022 
descripción: en esta parte creo la función de crear, eliminar, mostrar
y actualizar
 */
package controller;

import java.util.List;
//import javax.swing.DefaultButtonModel;
import javax.swing.table.DefaultTableModel;
import model.TransporteModel;
import pojo.Transporte;

public class TransporteContoller {

    TransporteModel trasM = new TransporteModel();

    public void crearTransporte(List<Transporte> lista, Transporte transporte) {
        trasM.crearTransporte(lista, transporte);
    }

    public void eliminarTransorte(List<Transporte> lista, String nombre){
      trasM.eliminarTransporte(lista, nombre);
    }
    public void mostrarTransporte(List<Transporte> lista, DefaultTableModel modelo) {
        trasM.mostrarTransporte(lista, modelo);
    }

    public void actualizarTransporte(List<Transporte> lista, Transporte transporte) {
        trasM.actualizarTransporte(lista, transporte);
    }

    public Transporte obtenerTransporte(List<Transporte> lista, int id) {
        return trasM.obtenerTransporte(lista, id);
    }
}
