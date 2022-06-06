package controller;

import java.util.List;
import model.DestinoModel;
import pojo.Destino;

public class DestinoController {

    final private DestinoModel model;

    public DestinoController() {
        this.model = new DestinoModel();
    }

    public List<Destino> crearDestino(List<Destino> lista, Destino destino) {
        return model.crearDestino(lista, destino);
    }

    public List<Destino> eliminarDestino(List<Destino> lista, long idlugar) {
        return model.eliminarDestino(lista, idlugar);
    }

    public void mostrarDestino(List<Destino> lista) {
        model.mostrarDestino(lista);
    }

    public Destino obtenerUnDestino(List<Destino> lista, long id) {
        return model.obtenerUnDestino(lista, id);
    }
}
