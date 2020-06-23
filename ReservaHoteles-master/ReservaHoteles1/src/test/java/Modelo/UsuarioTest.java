/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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
public class UsuarioTest {
        Usuario instance;
    public UsuarioTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Usuario instance = new Usuario(0, "", "");
    }
    
    @After
    public void tearDown() {
    }

//    /**
//     * Test of getCodigouser method, of class Usuario.
//     */
//    @Test
//    public void testGetCodigouser() {
//        System.out.println("getCodigouser");
//        Usuario instance = null;
//        int expResult = 0;
//        int result = instance.getCodigouser();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setCodigouser method, of class Usuario.
//     */
//    @Test
//    public void testSetCodigouser() {
//        System.out.println("setCodigouser");
//        int codigouser = 0;
//        Usuario instance = null;
//        instance.setCodigouser(codigouser);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getContrasena method, of class Usuario.
     */
    @Test
    public void testGetContrasena() {
       String expResult = "";
        String result = instance.getContrasena();
        assertEquals(expResult, result);
    }

//    /**
//     * Test of setContrasena method, of class Usuario.
//     */
//    @Test
//    public void testSetContrasena() {
//        System.out.println("setContrasena");
//        String contrasena = "";
//        Usuario instance = null;
//        instance.setContrasena(contrasena);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getRol method, of class Usuario.
     */
    @Test
    public void testGetRol() {
        String expResult = "";
        String result = instance.getRol();
        assertEquals(expResult, result);
    }

//    /**
//     * Test of setRol method, of class Usuario.
//     */
//    @Test
//    public void testSetRol() {
//        System.out.println("setRol");
//        String rol = "";
//        Usuario instance = null;
//        instance.setRol(rol);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
