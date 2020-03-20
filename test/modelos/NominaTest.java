/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luis-clase
 */
public class NominaTest {

    public NominaTest() {
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
     * Test of getEmpleado method, of class Nomina.
     */
    @Test
    public void testGetEmpleado() {
        System.out.println("getEmpleado");
        Nomina instance = new Nomina();
        Empleado expResult = null;
        Empleado result = instance.getEmpleado();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmpleado method, of class Nomina. deberia de lanzar una
     * excepcion
     */
    @Test
    public void testSetEmpleado() {
        System.out.println("setEmpleado");
        Empleado empleado = null;
        Nomina instance = new Nomina();
        instance.setEmpleado(empleado);
        //TODO review the generated test code and remove the default call to fail.
        assertEquals(empleado, instance.getEmpleado());
    }

    /**
     * Test of getCoste method, of class Nomina.
     */
    @Test
    public void testGetCoste() {
        System.out.println("getCoste");
        Nomina instance = new Nomina();
        Coste expResult = new Coste();
        Coste result = instance.getCoste();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCoste method, of class Nomina.
     */
    @Test
    public void testSetCoste() {
        System.out.println("setCoste");
        Coste coste = new Coste();
        Nomina instance = new Nomina();
        instance.setCoste(coste);
        assertEquals(coste, instance.getCoste());
    }

    /**
     * Test of getSecretariado method, of class Nomina.
     */
    @Test
    public void testGetSecretariado() {
        System.out.println("getSecretariado");
        Nomina instance = new Nomina();
        Secretariado expResult = new Secretariado();
        Secretariado result = instance.getSecretariado();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSecretariado method, of class Nomina.
     */
    @Test
    public void testSetSecretariado() {
        System.out.println("setSecretariado");
        Secretariado secretariado = null;
        Nomina instance = new Nomina();
        instance.setSecretariado(secretariado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSecretariado method, of class Nomina. con una nomina en
     * concreto
     */
    @Test
    public void testGetIdSecretariado() {
        System.out.println("getSecretariado");
        Nomina instance = new Nomina();
        long expResult = 100001017;
        instance.setIdSecretario(expResult);
        long result = instance.getIdSecretario();
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class Nomina.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Nomina instance = new Nomina();
        long expResult = 0L;
        instance.setId(expResult);
        long result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Nomina.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        long id = 0L;
        Nomina instance = new Nomina();
        instance.setId(id);
        assertEquals(id, instance.getId());
    }

    /**
     * Test of getMes method, of class Nomina.
     */
    @Test
    public void testGetMes() {
        System.out.println("getMes");
        Nomina instance = new Nomina();
        int expResult = 0;
        int result = instance.getMes();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of setMes method, of class Nomina.
     */
    @Test
    public void testSetMes() {
        System.out.println("setMes");
        int mes = -1;
        Nomina instance = new Nomina();
        try {
            instance.setMes(mes);
            fail("el mes no puede ser -1");
        } catch (NominaException ex) {
            assert(true);
        }
    }
    /**
     * Test of setMes method, of class Nomina.
     */
    @Test
    public void testSetMes1() {
        System.out.println("setMes");
        int mes = 13;
        Nomina instance = new Nomina();
        try {
            instance.setMes(mes);
            fail("el mes no puede ser 13");
        } catch (NominaException ex) {
            assert(true);
        }
    }
    /**
     * Test of setMes method, of class Nomina.
     */
    @Test
    public void testSetMes3() {
        System.out.println("setMes");
        int mes = 6;
        Nomina instance = new Nomina();
        try {
            instance.setMes(mes);
            assert(true);
        } catch (NominaException ex) {
            assert(false);
        }
    }
    /**
     * Test of getAnio method, of class Nomina.
     */
    @Test
    public void testGetAnio() {
        try {
            System.out.println("getAnio");
            Nomina instance = new Nomina();
            int expResult = 2;
            instance.setAnio(2);
            int result = instance.getAnio();
            assertNotEquals(expResult, result);   
        } catch (NominaException ex) {
            assert(true);
        }
    }

    /**
     * Test of getIdSecretario method, of class Nomina.
     */
    @Test
    public void testGetIdSecretario() {
        System.out.println("getIdSecretario");
        Nomina instance = new Nomina();
        long expResult = 0L;
        long result = instance.getIdSecretario();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdSecretario method, of class Nomina.
     */
    @Test
    public void testSetIdSecretario() {
        System.out.println("setIdSecretario");
        long idSecretario = 0L;
        Nomina instance = new Nomina();
        instance.setIdSecretario(idSecretario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdEmpleado method, of class Nomina.
     */
    @Test
    public void testGetIdEmpleado() {
        System.out.println("getIdEmpleado");
        Nomina instance = new Nomina();
        long expResult = 0L;
        long result = instance.getIdEmpleado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdEmpleado method, of class Nomina.
     */
    @Test
    public void testSetIdEmpleado() {
        System.out.println("setIdEmpleado");
        long idEmpleado = 0L;
        Nomina instance = new Nomina();
        instance.setIdEmpleado(idEmpleado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnio method, of class Nomina.
     */
    @Test
    public void testSetAnio() throws Exception {
        System.out.println("setAnio");
        int anio = 0;
        Nomina instance = new Nomina();
        instance.setAnio(anio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRevisado method, of class Nomina.
     */
    @Test
    public void testGetRevisado() {
        System.out.println("getRevisado");
        Nomina instance = new Nomina();
        boolean expResult = false;
        boolean result = instance.getRevisado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRevisado method, of class Nomina.
     */
    @Test
    public void testSetRevisado() {
        System.out.println("setRevisado");
        boolean revisado = false;
        Nomina instance = new Nomina();
        instance.setRevisado(revisado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nuevoNomina method, of class Nomina.
     */
    @Test
    public void testNuevoNomina() throws Exception {
        System.out.println("nuevoNomina");
        Nomina expResult = null;
        Nomina result = Nomina.nuevoNomina();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNominaById method, of class Nomina.
     */
    @Test
    public void testGetNominaById() {
        System.out.println("getNominaById");
        long id = 0L;
        Nomina instance = new Nomina();
        Nomina expResult = new Nomina();
        Nomina result = instance.getNominaById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllNominas method, of class Nomina.
     */
    @Test
    public void testGetAllNominas() {
        System.out.println("getAllNominas");
        Nomina instance=new Nomina();
        ArrayList<Nomina> expResult = new ArrayList<>();
        ArrayList<Nomina> result = instance.getAllNominas();
        assertEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
        fail("");
    }

    /**
     * Test of exportarAFichero method, of class Nomina.
     */
    @Test
    public void testExportarAFichero() throws Exception {
        System.out.println("exportarAFichero");
        String ruta = "C:\\prueba.txt";
        Nomina instance = new Nomina();
        boolean result = instance.exportarAFichero(ruta);
        if(result){
            assert(true);
        }
        fail("El fichero no ha sido creado");
    }

    /**
     * Test of exportarABinario method, of class Nomina.
     */
    @Test
    public void testExportarABinario() throws Exception {
        System.out.println("exportarABinario");
        String ruta = "C:\\prueba.bin";
        Nomina instance = new Nomina();
        instance.exportarABinario(ruta);
        File bin=new File(ruta);
        if(bin.exists()){
            assert(true);
        }
        fail("El archivo no ha sido creado");
    }

    
}
