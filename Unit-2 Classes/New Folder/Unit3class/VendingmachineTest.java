

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendingmachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingmachineTest
{

    /**
     * Default constructor for objects of class VendingmachineTest
     */
    public VendingmachineTest()
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
    public void fillUp()
    {
        Vendingmachine testVending = new Vendingmachine();
        testVending.fillUp(30);
        int total = testVending.sodaChecker();
        assertEquals(40, total , 1e-6); 
        
        
    }
        
    

}
