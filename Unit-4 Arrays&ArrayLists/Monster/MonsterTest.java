

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MonsterTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MonsterTest
{
    /**
     * Default constructor for test class MonsterTest
     */
    public MonsterTest()
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
    public void testscan()
    {
        Monster testMonster = new Monster(100,100,75,75,1,1);
        for (int i=0;i < 100; i++)
        {
            testMonster.scan();
        }
        int ultimateDx = testMonster.getDx();
        int ultimateDy = testMonster.getDy();
        assertEquals(1,ultimateDx, 1e-6);
        assertEquals(1,ultimateDy,1e-6);
        //System.out.println("finalDx" + testMonster.getDx() + "finalDy" +testMonster.getDy());
    }
    @Test
     public void testscan2()
    {
        Monster testMonster = new Monster(100,100,75,75,-1,1);
        for (int i=0;i < 100; i++)
        {
            testMonster.scan();
        }
      
         int ultimateDx = testMonster.getDx();
        int ultimateDy = testMonster.getDy();
        assertEquals(-1,ultimateDx, 1e-6);
        assertEquals(1,ultimateDy,1e-6);
        //System.out.println("finalDx" + testMonster.getDx() + "finalDy" +testMonster.getDy());
    }
}
