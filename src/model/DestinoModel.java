/**
 * Autor:Gonzalo Santiago García 
 * Fecha de creación: 1 de junio del 2022
 * Fecha de actualización: 22 de junio del 2022
 * Descripción: desntro de la clase Destino model, creamos algunas de las
 * funciones que necesitaremos para el manejo de nuestro List y que a través 
 * dentro de la clase se seguira implenentando los detalles del programa
 */

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
    /**
     * lista: nombra la lista de array lis 
     * nombre: tipo de parámetro que recive
     *en este método eliminar se encarga de eliminar un destino al obtener ese
     * método lo realiza 
     */
    public void eliminarDestino(List<Destino> lista, String nombre) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().compareTo(nombre) == 0) {
                lista.remove(i);
                break;
            }
        }
    }

    /**
     * en este método creamos el método actialiar que lo guardamos en un  array 
     * List y que recive como parámetro un tipo de dato destino
     */
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
