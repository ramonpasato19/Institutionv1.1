/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jhonn
 */
public class ConexionDBTest {
    
    public ConexionDBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ConexionDB.setUsuarioSesion(null);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of conectar method, of class ConexionDB.
     */
//    @Test
//    public void testConectar() {
//        System.out.println("conectar");
//        Connection expResult = null;
//        Connection result = ConexionDB.conectar();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of ejecutarSentencia method, of class ConexionDB.
     */
    @Test
    public void testEjecutarSentencia() {
        boolean expResult = false;
        boolean result = ConexionDB.ejecutarSentencia("");
        assertEquals(expResult, result);
    }

    /**
     * Test of ejecutarConsulta method, of class ConexionDB.
     */
    @Test
    public void testEjecutarConsulta() {
        ResultSet expResult = null;
        ResultSet result = ConexionDB.ejecutarConsulta("");
        assertEquals(expResult, result);
    }

    /**
     * Test of getUsuarioSesion method, of class ConexionDB.
     */
    @Test
    public void testGetUsuarioSesion() {
        Usuario expResult = null;
        Usuario result = ConexionDB.getUsuarioSesion();
        assertEquals(expResult, result);
    }    
}
