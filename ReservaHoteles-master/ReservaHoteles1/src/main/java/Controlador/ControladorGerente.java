package Controlador;

import Modelo.Gerente;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author Ricardo Chuqui Andres Guaycha Jhonatan Atancuri Diego Castro
 */
public class ControladorGerente {
    
    private int id;
    private SortedMap listaPersona;
    int cont;

    public ControladorGerente() {
        listaPersona = new TreeMap();
        cont = 1;
    }

    public SortedMap getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(SortedMap listaPersona) {
        this.listaPersona = listaPersona;
    }

    public void crear(int codigo, Gerente l) {
        listaPersona.put(codigo, l);
        cont++;
    }

    public void actualizar(int codigo, Gerente nuevo) {
        listaPersona.replace(codigo, nuevo);
    }

    public Gerente leer(int codigo) {
        Gerente l = (Gerente) listaPersona.get(codigo);
        return l;
    }

    public void eliminar(int codigo) {
        listaPersona.remove(codigo);
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
