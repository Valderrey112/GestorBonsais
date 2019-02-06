

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TiendaBonsaisTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TiendaBonsaisTest
{
    /**
     * Default constructor for test class TiendaBonsaisTest
     */
    public TiendaBonsaisTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void TESTgetListaBonsais()
    {
        TiendaBonsais tiendaBo1 = new TiendaBonsais();
        tiendaBo1.setNuevoBonsai("Olmo", false, 12, 12);
        tiendaBo1.setNuevoBonsai("Ficus", true, 13, 13);
        assertEquals("1. Olmo de 12.0 cm de alto, tiene 12 años y no es de hoja perenne\n2. Ficus de 13.0 cm de alto, tiene 13 años y es de hoja perenne\n", tiendaBo1.getListaBonsais());
    }
}

