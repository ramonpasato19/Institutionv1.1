/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import java.util.List;
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
public class ControladorUsuarioTest {
    
    public ControladorUsuarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

//    /**
//     * Test of generarID method, of class ControladorUsuario.
//     */
//    @Test
//    public void testGenerarID() throws Exception {
//        System.out.println("generarID");
//        int expResult = 0;
//        int result = ControladorUsuario.generarID();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of agregar method, of class ControladorUsuario.
     */
    @Test
    public void testAgregar() {
       System.out.println("agregando...");
        Usuario usuario = new Usuario(100, "g3@gmail.com", "12345678", "admin");
        boolean expResult = true;
        boolean result = ControladorUsuario.agregar(usuario);
        assertEquals(expResult, result);
        
        if(expResult==true){
        
            System.out.println("Usuario ingresado");
        }else{
        
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of modificar method, of class ControladorUsuario.
     */
    @Test
    public void testModificar() {
        System.out.println("modificar");
        Usuario usuario = new Usuario(100,"","","");
        boolean expResult = ControladorUsuario.modificar("UsuarioTest1", usuario);
        boolean result = ControladorUsuario.modificar("USR1_P4", usuario);
       
        
         //assertEquals(expResult, result);

        if (result == false) {
            System.out.println("Actulizando Exitosamente");
        } else {

            fail("nose completo.");
        }
        
    }

    /**
     * Test of buscar method, of class ControladorUsuario.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        String nombreUsuario = "";
        Usuario expResult = null;
        Usuario result = ControladorUsuario.buscar(nombreUsuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class ControladorUsuario.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        String nombreUsuario = "";
        boolean expResult = false;
        boolean result = ControladorUsuario.eliminar(nombreUsuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listar method, of class ControladorUsuario.
     */
//    @Test
//    public void testListar() {
//        System.out.println("listar");
//        List<Usuario> expResult = null;
//        List<Usuario> result = ControladorUsuario.listar();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
