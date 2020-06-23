package Controlador;

import Modelo.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan Atancuri
 * 
 * 
 * 
 */


/**
 * 
 * @Pruba 
 */

public class ConexionDB {
    
    private static Usuario usuarioSesion;
    
    public static Connection conectar()  {
        Connection conexion = null;
        String url =  "jdbc:mysql://localhost:3306/hotel"; 
      try {
            Class.forName("com.mysql.jdbc.Driver");
              conexion= (com.mysql.jdbc.Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root", "");
        } catch (Exception e) {
            System.err.println("Error:" +e);
        }
        return conexion;
    }
    
    public static boolean ejecutarSentencia(String sql)  {
        Connection conexion = conectar();
        try {
            Statement sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
            conexion.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error sentencia: " + e.getMessage());
        }
        return false;
    }
    
    public static ResultSet ejecutarConsulta(String sql)  {
        ResultSet resultado = null;
        Connection conexion = conectar();
        try {
            Statement sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            resultado.setFetchDirection(ResultSet.FETCH_FORWARD);
            conexion.close();
        } catch (Exception e) {
            System.out.println("Error consulta: " + e.getMessage());
        }
        return resultado;
    }

    public static Usuario getUsuarioSesion() {
        return usuarioSesion;
    }

    public static void setUsuarioSesion(Usuario usuarioSesion) {
        ConexionDB.usuarioSesion = usuarioSesion;
    }
    
    public static int generarID(String sql)  {
        int id = 0;
        try {
            ResultSet resultado = ConexionDB.ejecutarConsulta(sql);
            if (resultado.next()) {
                id = resultado.getInt("max") + 1;
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return id;
    }
}