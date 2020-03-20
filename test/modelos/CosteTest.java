/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.Date;
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
public class CosteTest {
    
    public CosteTest() {
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
     * Test of LeerFichero method, of class Coste.
     */
    @Test
    public void testLeerFichero() {
        System.out.println("LeerFichero");
        String archivo = "";
        ArrayList<Coste> expResult = null;
        ArrayList<Coste> result = Coste.LeerFichero(archivo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Coste.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Coste instance = new Coste();
        long expResult = 0L;
        long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Coste.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        long id = 0L;
        Coste instance = new Coste();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdAcomodador method, of class Coste.
     */
    @Test
    public void testGetIdAcomodador() {
        System.out.println("getIdAcomodador");
        Coste instance = new Coste();
        long expResult = 0L;
        long result = instance.getIdAcomodador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdAcomodador method, of class Coste.
     */
    @Test
    public void testSetIdAcomodador() {
        System.out.println("setIdAcomodador");
        long idAcomodador = 0L;
        Coste instance = new Coste();
        instance.setIdAcomodador(idAcomodador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdLimpieza method, of class Coste.
     */
    @Test
    public void testGetIdLimpieza() {
        System.out.println("getIdLimpieza");
        Coste instance = new Coste();
        long expResult = 0L;
        long result = instance.getIdLimpieza();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdLimpieza method, of class Coste.
     */
    @Test
    public void testSetIdLimpieza() {
        System.out.println("setIdLimpieza");
        long idLimpieza = 0L;
        Coste instance = new Coste();
        instance.setIdLimpieza(idLimpieza);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdInforme method, of class Coste.
     */
    @Test
    public void testGetIdInforme() {
        System.out.println("getIdInforme");
        Coste instance = new Coste();
        long expResult = 0L;
        long result = instance.getIdInforme();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdInforme method, of class Coste.
     */
    @Test
    public void testSetIdInforme() {
        System.out.println("setIdInforme");
        long idInforme = 0L;
        Coste instance = new Coste();
        instance.setIdInforme(idInforme);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdNomina method, of class Coste.
     */
    @Test
    public void testGetIdNomina() {
        System.out.println("getIdNomina");
        Coste instance = new Coste();
        long expResult = 0L;
        long result = instance.getIdNomina();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdNomina method, of class Coste.
     */
    @Test
    public void testSetIdNomina() {
        System.out.println("setIdNomina");
        long idNomina = 0L;
        Coste instance = new Coste();
        instance.setIdNomina(idNomina);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Coste.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Coste instance = new Coste();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Coste.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        Coste instance = new Coste();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImporte method, of class Coste.
     */
    @Test
    public void testGetImporte() {
        System.out.println("getImporte");
        Coste instance = new Coste();
        double expResult = 0.0;
        double result = instance.getImporte();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImporte method, of class Coste.
     */
    @Test
    public void testSetImporte() {
        System.out.println("setImporte");
        double importe = 0.0;
        Coste instance = new Coste();
        instance.setImporte(importe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReporte method, of class Coste.
     */
    @Test
    public void testGetReporte() {
        System.out.println("getReporte");
        Coste instance = new Coste();
        String expResult = "";
        String result = instance.getReporte();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReporte method, of class Coste.
     */
    @Test
    public void testSetReporte() {
        System.out.println("setReporte");
        String reporte = "";
        Coste instance = new Coste();
        instance.setReporte(reporte);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAcomodador method, of class Coste.
     */
    @Test
    public void testGetAcomodador() {
        System.out.println("getAcomodador");
        Coste instance = new Coste();
        Acomodador expResult = null;
        Acomodador result = instance.getAcomodador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAcomodador method, of class Coste.
     */
    @Test
    public void testSetAcomodador() {
        System.out.println("setAcomodador");
        Acomodador acomodador = null;
        Coste instance = new Coste();
        instance.setAcomodador(acomodador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLimpiador method, of class Coste.
     */
    @Test
    public void testGetLimpiador() {
        System.out.println("getLimpiador");
        Coste instance = new Coste();
        Limpiador expResult = null;
        Limpiador result = instance.getLimpiador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLimpiador method, of class Coste.
     */
    @Test
    public void testSetLimpiador() {
        System.out.println("setLimpiador");
        Limpiador limpiador = null;
        Coste instance = new Coste();
        instance.setLimpiador(limpiador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nuevoCoste method, of class Coste.
     */
    @Test
    public void testNuevoCoste() {
        System.out.println("nuevoCoste");
        Coste expResult = null;
        Coste result = Coste.nuevoCoste();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCosteById method, of class Coste.
     */
    @Test
    public void testGetCosteById() {
        System.out.println("getCosteById");
        long Id = 0L;
        Coste instance = new Coste();
        Coste expResult = null;
        Coste result = instance.getCosteById(Id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCostes method, of class Coste.
     */
    @Test
    public void testGetAllCostes() {
        System.out.println("getAllCostes");
        Coste instance = new Coste();
        ArrayList<Coste> expResult = null;
        ArrayList<Coste> result = instance.getAllCostes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exportarAFichero method, of class Coste.
     */
    @Test
    public void testExportarAFichero() throws Exception {
        System.out.println("exportarAFichero");
        String ruta = "";
        Coste instance = new Coste();
        boolean expResult = false;
        boolean result = instance.exportarAFichero(ruta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exportarABinario method, of class Coste.
     */
    @Test
    public void testExportarABinario() throws Exception {
        System.out.println("exportarABinario");
        String ruta = "";
        Coste instance = new Coste();
        instance.exportarABinario(ruta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Coste.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Coste instance = new Coste();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of data method, of class Coste.
     */
    @Test
    public void testData() {
        System.out.println("data");
        Coste instance = new Coste();
        String expResult = "";
        String result = instance.data();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
