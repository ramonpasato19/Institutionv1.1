/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Ricardo Chuqui Andres Guaycha Jhonatan Atancuri Diego Castro
 */
public class Usuario extends Persona{
    private int codigouser;
    private String correo;
    private String contrasena;
    private String rol;

    public Usuario(int codigouser, String contrasena, String rol) {
        this.codigouser = codigouser;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    public Usuario(int i, String string, String string0, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCodigouser() {
        return codigouser;
    }

    public void setCodigouser(int codigouser) {
        this.codigouser = codigouser;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
}
