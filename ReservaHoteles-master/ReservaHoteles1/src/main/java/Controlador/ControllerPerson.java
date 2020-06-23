/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Modelo.Person;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author larp
 */
public class ControllerPerson {
     ConexionDB mysql = new ConexionDB();
   Connection cn =mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer totalregistros;

    private String id;
    private String identification;
    private String name;
    private String address;
    private String phone;
    private String age;
    private String role;
    
    
    public DefaultTableModel show(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"id", "identification", "name", "address", "phone", "age", "role"};

        String[] registro = new String[10];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.idpersona,p.nombre,p.apaterno,p.amaterno,p.tipo_documento,p.num_documento,"
                + "p.direccion,p.telefono,p.email,c.codigo_cliente from person p inner join cliente c "
                + "on p.idpersona=c.idpersona where num_documento like '%"
                + buscar + "%' order by idpersona desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                
                
                registro[0] = rs.getString("id");
                registro[1] = rs.getString("identification");
                registro[2] = rs.getString("name");
                registro[3] = rs.getString("address");
                registro[4] = rs.getString("phone");
                registro[5] = rs.getString("age");
                registro[6] = rs.getString("role");


                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public boolean insertar(Person dts) {
        sSQL = "insert into person (id, identification, name, address, phone, age, role)"
                + "values (?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            
            pst.setString(1, dts.getId());
            pst.setString(2, dts.getIdentification());
            pst.setString(3, dts.getName());
            pst.setString(4, dts.getAddress());
            pst.setString(5, dts.getPhone());
            pst.setString(6, dts.getAge());
            pst.setString(7, dts.getRole());
            int n = pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        return true;
    }

    public boolean editar(Person dts) {
        sSQL = "update persona set id=?,identification=?,name=?,address=?,phone=?,"
                + " age=?,role=?";
        
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getId());
            pst.setString(2, dts.getIdentification());
            pst.setString(3, dts.getName());
            pst.setString(4, dts.getAddress());
            pst.setString(5, dts.getPhone());
            pst.setString(6, dts.getAge());
            pst.setString(7, dts.getRole());
            int n = pst.executeUpdate();


        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        return true;
    }

    public boolean eliminar(Person dts) {
        sSQL = "delete from person where id=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getId());
            int n = pst.executeUpdate();

                    } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        return true;
    }
}
