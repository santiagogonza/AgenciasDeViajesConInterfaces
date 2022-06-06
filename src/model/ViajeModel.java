package model;

import java.util.List;
import pojo.Viaje;

public class ViajeModel {

    // lista de viaje
    public List<Viaje> crearViaje(List<Viaje> lista1, Viaje viaje) {
        lista1.add(viaje);
        return lista1;
    }

    public void mostrarViaje(List<Viaje> lista1) {
        System.out
                .println("-------------------------------------------------------------------------------------------");
        System.out
                .println("|  Idcódigo  |              Destino      | Hora de salida | Hora de regreso   |  Precio   |");
        System.out
                .println("-------------------------------------------------------------------------------------------");
        for (Viaje viaje : lista1) {

            System.out.printf("| %10d | %24s  | %14s | %16s  |%10s |", 
                    viaje.getCodigo(), viaje.getDestino(),
                    viaje.getSalida(), viaje.getRegreso(), viaje.getPrecio());
            System.out.println(
                    "\n--------------------------------------------------------------------------------------------");
        }

    }
}
    