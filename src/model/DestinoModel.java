package model;

import java.util.List;
import pojo.Destino;

public class DestinoModel {

    public List<Destino> crearDestino(List<Destino> lista, Destino destino) {
        lista.add(destino);
        return lista;

    }

    // se crea el método obtenerUnDestino que obtiene un id de la 
    //clase destino
    public Destino obtenerUnDestino(List<Destino> lista, long id) {
        for (Destino destino : lista) {
            /*hace la ccomparación si es igual el id que se esta igualando 
            entonces retorna un objeto destino   si no lo encuentra retorna
            un null
            */ 
          
            if (destino.getIdlugar() == id) {
                return destino;
            }
        }
        return null;
    }

    public List<Destino> eliminarDestino(List<Destino> lista, long idlugar) {
        Destino destino = new Destino();
        destino = lista.get((int) idlugar);
        lista.remove(destino);
        return lista;

    }

    // se crea el método mostrarDestino que muestra los atributos de la clase y los
    // presenta en pantalla
    public void mostrarDestino(List<Destino> lista) {
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(
                "|   Id     |   Destino      	           | Código Postal      |                  Dirección               |    Télefono        |");
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------");
        for (Destino destino : lista) {
            System.out.printf("| %8d | %28s  | %18s | %39s  |%19s |",
                    destino.getIdlugar(), destino.getNombre(),
                    destino.getCodigoPost(), destino.getDireccion(),
                    destino.getTelefono());
            System.out.println(
                    "\n--------------------------------------------------------------------------------------------------------------------------------");

        }

    }

}
