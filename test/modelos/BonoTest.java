/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author david
 */
public class BonoTest {
    
    public BonoTest() {
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
     * Test of getAño method, of class Bono.
     */
    @Test
    public void testGetAño() {
        System.out.println("getAño");
        Bono instance = new Bono();
        int expResult = 0;
        int result = instance.getAño();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAño method, of class Bono.
     */
    @Test
    public void testSetAño() throws Exception {
        System.out.println("setAño");
        int año = 0;
        Bono instance = new Bono();
        instance.setAño(año);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Bono.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Bono instance = new Bono();
        long expResult = 9L;
        long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdUsuario method, of class Bono.
     */
    @Test
    public void testGetIdUsuario() {
        System.out.println("getIdUsuario");
        Bono instance = new Bono();
        long expResult = 9L;
        long result = instance.getIdUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdUsuario method, of class Bono.
     */
    @Test
    public void testSetIdUsuario() {
        System.out.println("setIdUsuario");
        long idUsuario = 9L;
        Bono instance = new Bono();
        instance.setIdUsuario(idUsuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnnio method, of class Bono.
     */
    @Test
    public void testGetAnnio() {
        System.out.println("getAnnio");
        Bono instance = new Bono();
        int expResult = 2020;
        int result = instance.getAnnio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnnio method, of class Bono.
     */
    @Test
    public void testSetAnnio() {
        System.out.println("setAnnio");
        int annio = 2020;
        Bono instance = new Bono();
        instance.setAnnio(annio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Bono.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        long id = 9L;
        Bono instance = new Bono();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class Bono.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Bono instance = new Bono();
        char expResult = ' ';
        char result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Bono.
     */
    @Test
    public void testSetTipo() throws Exception {
        System.out.println("setTipo");
        char tipo = ' ';
        Bono instance = new Bono();
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMes method, of class Bono.
     */
    @Test
    public void testGetMes() {
        System.out.println("getMes");
        Bono instance = new Bono();
        int expResult = 0;
        int result = instance.getMes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMes method, of class Bono.
     */
    @Test
    public void testSetMes() throws Exception {
        System.out.println("setMes");
        int mes = 0;
        Bono instance = new Bono();
        instance.setMes(mes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class Bono.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Bono instance = new Bono();
        Usuario expResult = null;
        Usuario result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class Bono.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        Usuario usuario = null;
        Bono instance = new Bono();
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nuevoBono method, of class Bono.
     */
    @Test
    public void testNuevoBono() throws Exception {
        System.out.println("nuevoBono");
        Bono expResult = null;
        Bono result = Bono.nuevoBono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nuevoBonoUsuario method, of class Bono.
     */
    @Test
    public void testNuevoBonoUsuario() {
        System.out.println("nuevoBonoUsuario");
        Bono expResult = null;
        Bono result = Bono.nuevoBonoUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBonoById method, of class Bono.
     */
    @Test
    public void testGetBonoById() {
        System.out.println("getBonoById");
        long Id = 0L;
        Bono instance = new Bono();
        Bono expResult = null;
        Bono result = instance.getBonoById(Id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllBonos method, of class Bono.
     */
    @Test
    public void testGetAllBonos() {
        System.out.println("getAllBonos");
        Bono instance = new Bono();
        ArrayList<Bono> expResult = null;
        ArrayList<Bono> result = instance.getAllBonos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exportarAFichero method, of class Bono.
     */
    @Test
    public void testExportarAFichero() throws Exception {
        System.out.println("exportarAFichero");
        String ruta = "";
        Bono instance = new Bono();
        boolean expResult = false;
        boolean result = instance.exportarAFichero(ruta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exportarABinario method, of class Bono.
     */
    @Test
    public void testExportarABinario() throws Exception {
        System.out.println("exportarABinario");
        String ruta = "";
        Bono instance = new Bono();
        instance.exportarABinario(ruta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Bono.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Bono instance = new Bono();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of data method, of class Bono.
     */
    @Test
    public void testData() {
        System.out.println("data");
        Bono instance = new Bono();
        String expResult = "";
        String result = instance.data();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
