import java.util.Scanner;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class EventTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EventTest
{
    
    /**
     * Default constructor for objects of class EventTest
     */
    public EventTest()
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
    public void testEvent()
    {  
        Scanner in  = new Scanner(System.in);
        System.out.println("Type your days: "); 
        System.out.println("Type your event name: "); 
       
        int dLeft  = in.nextInt();
        String Ename = in.nextLine();
        
        Event testEvent = new Event(Ename , dLeft);
        testEvent.toString();
        testEvent.subtractDaysleft();
        testEvent.toString();
        
    
    }
}
