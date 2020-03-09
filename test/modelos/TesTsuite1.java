/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author DAW101
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    
AcomodadorTest.class, BeneficioTest.class, BonoTest.class,CosteException.class,CosteTest.class,
    ETeatroTest.class, EmpleadoTest.class, FranquiciaTest.class, InformeTest.class, NominaExceptionTest.class,
    NominaTest.class, TaquilleroTest.class, UsuarioTest.class

})
public class TesTsuite1 {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
