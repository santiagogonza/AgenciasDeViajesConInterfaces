/*
autor: Gonzalo Santiago Garcia
fecha de creación: 1 de junio del 2022
fecha de actualización: 22 de junio del 2022 
descripción: contiene las funciones como crear, obtener, eliminar, actualizar y
 mostrar
 */
package model;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import pojo.Transporte;

public class TransporteModel {

    /**
     *creamos la función crear transporte y que creamos una lista de transporte 
     * y le pasamos los parámetros de la clase Transporte
     */
    public void crearTransporte(List<Transporte> lista, Transporte transporte) {
        lista.add(transporte);
    }

    /**
     * creamos el metodo obtenerTransporte
     * */
    public Transporte obtenerTransporte(List<Transporte> lista, int codigo) {
        for (Transporte transporte : lista) {
            /* hace la comparación de de ide trasnporte si es igual al id
            entonces retorna el objeto transporte
            si no encuentra el id retorna null
             */
            if (transporte.getIdTranspor() == codigo) {
                return transporte;
            }

        }
        return null;
    }
    /*
    función eliminar hace la comparación a través del nombre si es que es
    igual elimina ese dato
    */
    public void eliminarTransporte(List<Transporte> lista, String nom) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombreTransport().compareTo(nom) == 0) {
                lista.remove(i);
                break;
            }
        }
    }

    //función actualizar
    public void actualizarTransporte(List<Transporte> lista, Transporte transport) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getIdTranspor() == (transport.getIdTranspor())) {
                lista.set(i, transport);
                break;
            }
        }
    }

    /**
     *esta función si obtiene los datos y los muestra en la tabla
     */
    public void mostrarTransporte(List<Transporte> lista, DefaultTableModel modelo) {
        modelo.setRowCount(0);
        for (int i = 0; i < lista.size(); i++) {
            Object[] fila = new Object[4];
            fila[0] = lista.get(i).getIdTranspor();
            fila[1] = lista.get(i).getNombreTransport();
            fila[2] = lista.get(i).getNumAsiento();
            fila[3] = lista.get(i).getPrecio();

            modelo.addRow(fila);
        }

    }

}
