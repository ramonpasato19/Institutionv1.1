/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jhonn
 */
public class ControladorUsuario {
    
    public static int generarID() throws ClassNotFoundException {
        String sql = "select max(codigo) from usuarios";
        return ConexionDB.generarID(sql);
    }
    
    public static boolean agregar(Usuario usuario) {
        if (buscar(usuario.getNombre()) == null) {
            String sql = "insert into usuarios values(" +
                      usuario.getCodigouser() + ", '" + 
                      usuario.getNombre() + "', '" +
                      usuario.getEmail()+ "', '" +
                      usuario.getContrasena() + "', '" +
                      usuario.getRol() + "')";
            ConexionDB.ejecutarSentencia(sql);
            return true;
        }
        return false;
    }
    
    public static boolean modificar(String nombre, Usuario usuario) {
        if (buscar(nombre) != null) {
            String sql = "update usuarios set " + 
                         "nombre = '" + usuario.getNombre() + "'," +
                         "correo = '" + usuario.getNombre() + "'," +
                         "contraseña = '" + usuario.getContrasena()+ "'," +
                         "rol = '" + usuario.getRol() +"' " +  
                         "where codigo = " + usuario.getCodigouser();
            ConexionDB.ejecutarSentencia(sql);
            return true;
        }
        return false;
    } 
    
    public static Usuario buscar(String nombreUsuario) {
        Usuario usuario = null;
        String sql = "select * from usuarios where nombre = '" + nombreUsuario + "'";
        try {
            ResultSet resultado = ConexionDB.ejecutarConsulta(sql);
            if (resultado.next()) {
                int id = resultado.getInt("codigo");
                String nombre = resultado.getString("nombre");
                String clave = resultado.getString("contraseña");
                String rol = resultado.getString("rol");
                usuario = new Usuario(id, nombre, clave, rol);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return usuario;
    }
    
    public static boolean eliminar(String nombreUsuario) {
        if (buscar(nombreUsuario) != null) {
            String sql = "delete from usuarios where nombre = '" + nombreUsuario + "'";
            ConexionDB.ejecutarSentencia(sql);
            return true;
        }
        return false;
    }
    
    public static List<Usuario> listar() {
        List<Usuario> lista = new ArrayList();
        String sql = "select * from usuarios";
        try {
            ResultSet resultado = ConexionDB.ejecutarConsulta(sql);
            while (resultado.next()) {
                int id = resultado.getInt("codigo");
                String nombre = resultado.getString("nombre");
                String clave = resultado.getString("contraseña");
                String rol = resultado.getString("rol");
                lista.add(new Usuario(id, nombre, clave, rol));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return lista;
    }
}