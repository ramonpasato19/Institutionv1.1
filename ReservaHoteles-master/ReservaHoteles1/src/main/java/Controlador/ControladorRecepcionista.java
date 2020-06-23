package Controlador;

import Modelo.Recepcionista;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author Ricardo Chuqui Andres Guaycha Jhonatan Atancuri Diego Castro
 */
public class ControladorRecepcionista {

    private int id;
    private SortedMap listaRecepcionista;
    int cont;

    public ControladorRecepcionista() {
        listaRecepcionista = new TreeMap();
        cont = 1;
    }

    public SortedMap getListaPersona() {
        return listaRecepcionista;
    }

    public void setListaRecepcionista(SortedMap listaRecepcionista) {
        this.listaRecepcionista = listaRecepcionista;
    }

    public void crear(int codigo, Recepcionista l) {
        listaRecepcionista.put(codigo, l);
        cont++;
    }

    public void actualizar(int codigo, Recepcionista nuevo) {
        listaRecepcionista.replace(codigo, nuevo);
    }

    public Recepcionista leer(int codigo) {
        Recepcionista l = (Recepcionista) listaRecepcionista.get(codigo);
        return l;
    }

    public void eliminar(int codigo) {
        listaRecepcionista.remove(codigo);
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
