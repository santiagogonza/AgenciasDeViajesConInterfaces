package model;

import pojo.Destino;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class DestinoModel {

    public void crearDestino(List<Destino> lista, Destino destino) {
        lista.add(destino);
        //  return lista;

    }

    // se crea el método obtenerUnDestino que obtiene un id de la 
    //clase destino
    public Destino obtenerUnDestino(List<Destino> lista, int codigo) {
        for (Destino destino : lista) {
            /*hace la comparación si es igual el id que se esta igualando 
            entonces retorna un objeto destino   si no lo encuentra retorna
            un null
             */

            if (destino.getCodigoPost() == codigo) {
                return destino;
            }
        }
        return null;
    }

    public void eliminarDestino(List<Destino> lista, String nombre) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().compareTo(nombre) == 0) {
                lista.remove(i);
                break;
            }
        }
    }

    public void actualizarDestino(List<Destino> lista, Destino destino) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCodigoPost() == (destino.getCodigoPost())) {
                lista.set(i, destino);

                break;
            }

        }
    }

    // se crea el método mostrarDestino que muestra los atributos de la clase y los
    // presenta en pantalla
    public void mostrarDestino(List<Destino> lista, DefaultTableModel modelo) {
        modelo.setRowCount(0);
        for (int i = 0; i < lista.size(); i++) {
            Object[] fila = new Object[6];
            fila[0] = lista.get(i).getIdlugar();
            fila[1] = lista.get(i).getNombre();
            fila[2] = lista.get(i).getCodigoPost();
            fila[3] = lista.get(i).getDireccion();
            fila[4] = lista.get(i).getTelefono();
            modelo.addRow(fila);
        }

    }
}
