
package Modelo;

/**
 *
 * @author Ricardo Chuqui Andres Guaycha Jhonatan Atancuri Diego Castro
 */
public class Recepcionista extends Persona {

    private String codigo_recepcionista;

    public Recepcionista() {
    }
    
    public Recepcionista(String codigo_recepcionista) {
        this.codigo_recepcionista = codigo_recepcionista;
    }

    public String getCodigo_cliente() {
        return codigo_recepcionista;
    }

    public void setCodigo_cliente(String codigo_recepcionista) {
        this.codigo_recepcionista = codigo_recepcionista;
    }
    
}
