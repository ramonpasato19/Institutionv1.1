/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Recepcionista;
import java.util.SortedMap;
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
public class ControladorRecepcionistaTest {
    
    public ControladorRecepcionistaTest() {
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

    /**
     * Test of getListaPersona method, of class ControladorRecepcionista.
     */
    @Test
    public void testGetListaPersona() {
        System.out.println("getListaPersona");
        ControladorRecepcionista instance = new ControladorRecepcionista();
        SortedMap expResult = null;
        SortedMap result = instance.getListaPersona();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaRecepcionista method, of class ControladorRecepcionista.
     */
    @Test
    public void testSetListaRecepcionista() {
        System.out.println("setListaRecepcionista");
        SortedMap listaRecepcionista = null;
        ControladorRecepcionista instance = new ControladorRecepcionista();
        instance.setListaRecepcionista(listaRecepcionista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crear method, of class ControladorRecepcionista.
     */
    @Test
    public void testCrear() {
        System.out.println("crear");
        int codigo = 0;
        Recepcionista l = null;
        ControladorRecepcionista instance = new ControladorRecepcionista();
        instance.crear(codigo, l);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class ControladorRecepcionista.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        int codigo = 0;
        Recepcionista nuevo = null;
        ControladorRecepcionista instance = new ControladorRecepcionista();
        instance.actualizar(codigo, nuevo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leer method, of class ControladorRecepcionista.
     */
    @Test
    public void testLeer() {
        System.out.println("leer");
        int codigo = 0;
        ControladorRecepcionista instance = new ControladorRecepcionista();
        Recepcionista expResult = null;
        Recepcionista result = instance.leer(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class ControladorRecepcionista.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        int codigo = 0;
        ControladorRecepcionista instance = new ControladorRecepcionista();
        instance.eliminar(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCont method, of class ControladorRecepcionista.
     */
    @Test
    public void testGetCont() {
        System.out.println("getCont");
        ControladorRecepcionista instance = new ControladorRecepcionista();
        int expResult = 0;
        int result = instance.getCont();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCont method, of class ControladorRecepcionista.
     */
    @Test
    public void testSetCont() {
        System.out.println("setCont");
        int cont = 0;
        ControladorRecepcionista instance = new ControladorRecepcionista();
        instance.setCont(cont);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class ControladorRecepcionista.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        ControladorRecepcionista instance = new ControladorRecepcionista();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class ControladorRecepcionista.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        ControladorRecepcionista instance = new ControladorRecepcionista();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
