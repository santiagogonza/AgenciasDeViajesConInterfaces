/*
autor: Gonzalo Santiago Garcia
fecha de creación: 1 de junio del 2022
fecha de actualización: 9 de junio del 2022 
descripción: en esta parte creo la función de crear, eliminar, mostrar
y actualizar
 */
package controller;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.DestinoModel;
import pojo.Destino;

public class DestinoController {

    DestinoModel destinoM = new DestinoModel();

    public void crearDestino(List<Destino> lista, Destino destino) {
        destinoM.crearDestino(lista, destino);
    }

    public void eliminarDestino(List<Destino> lista, String nombre) {
        destinoM.eliminarDestino(lista, nombre);
    }

    public void mostrarDestino(List<Destino> lista, DefaultTableModel modelo) {
        destinoM.mostrarDestino(lista, modelo);
    }

    public void actualizarDestino(List<Destino> lista, Destino destino) {
        destinoM.actualizarDestino(lista, destino);
    }

    public Destino obtenerUnDestino(List<Destino> lista, int id) {
        return destinoM.obtenerUnDestino(lista, id);
    }
}
