package model;

import java.util.List;
import pojo.Transporte;

public class TransporteModel {

    public List<Transporte> crearTransporte(List<Transporte> lista1,
            Transporte transporte) {
        lista1.add(transporte);
        return lista1;
    }

    // creamos el metodo obtenerTransporte
    public Transporte obtenerTransporte(List<Transporte> lista, long id) {
        for (Transporte transporte : lista) {
            /* hace la comparación de de ide trasnporte si es igual al id
            entonces retorna el objeto transporte
            si no encuentra el id retorna null
             */
            if (transporte.getIdTranspor() == id) {
                return transporte;
            }
        }
        return null;
    }

    // aqui llamamos a los métodos de la clase transporte y esos métodos lo imprimos
    // en pantalla
    public void mostrarTransporte(List<Transporte> lista1) {
        System.out.println("--------------------------------------------------------------");
        System.out.println("|  Id       |  Nombre de transporte  |  Número de asiento    |");
        System.out.println("--------------------------------------------------------------");
        for (Transporte transporte : lista1) {
            System.out.printf("| %9d | %21s  | %21d |",
                    transporte.getIdTranspor(), transporte.getNombreTransport(),
                    transporte.getNumAsiento());
            System.out.println("\n--------------------------------------------------------------");
        }
    }
}
