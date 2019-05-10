import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.lang.Thread;
/**
 * Class that creates a JFrame and Places a panel inside
 * Also contains the algorithms to run the actual collision program
 * @author Sam Yu
 * @version April 25 2015
 */
public class ModelViewer implements ActionListener
{
    private JPanel panel, tools;
    private ModelViewer drawing;
    private ModelPanel physics;
    private JFrame frame;
    //Constants for the Jframe
    private static int WIDTH = 1200;
    private static int HEIGHT = 700;
    //Constant for the sleeper method in the constructor
    private static int SLEEP = 5;
    /**
     * Instantiates a new model viewer
     *
     * @param main method no parameters
     * @throws exception
     */
    public static void main(String[] args) throws InterruptedException

    {
        ModelViewer viewer = new ModelViewer();

    }

    /**
     * ModelViewer Constructor
     * Creates a new ModelPanel, JFrame and uses methods
     * from ModelPanel class to apply the algorithm
     * to run the collision software
     * 
     *@throws exception
     */
    public ModelViewer()
    throws InterruptedException 

    {

        physics = new ModelPanel();
        //make a Jframe
        frame = new JFrame();
        frame.setTitle("Welcome to Sam's Physics Engine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.add(physics);
        frame.setVisible(true);
        //Make a count to run through a horizontal and vertical collision
        int count = 0;
        //for loop so count can be incremented
        for(int i = 0; i <2 ; i++)
        {
            if(count == 0)
            {
                physics.setHorizontalCollision();
            }
            else if(count == 1)
            {
                physics.setVerticalCollision();                                
            }
           
            //checks if each circle hits a frame side
            boolean isFrameCollisionC1  = physics.frameCircleCollisionDetectedCirc1();
            boolean isFrameCollisionC2  = physics.frameCircleCollisionDetectedCirc2();
            
            //logic for collision algorithm
            while(isFrameCollisionC1 == false || isFrameCollisionC2 == false )
            {
                //sets the masses, velocity and location of circles
                if(count == 0)
                {
                    physics.checkHorizontalCollision();
                }
                if( count == 1)
                {
                    physics.checkVerticalCollision();
                }
                //if no frame collision continue moving and keep checking for a collision.
                if(isFrameCollisionC1 == false)
                {
                    isFrameCollisionC1  = physics.frameCircleCollisionDetectedCirc1();
                    
                    physics.moveCircle1();
                }
                if(isFrameCollisionC2 == false)
                {
                    isFrameCollisionC2  = physics.frameCircleCollisionDetectedCirc2();
                    
                    physics.moveCircle2();
                }

                
                physics.repaint();
                Thread.sleep(SLEEP);
            }
            //moves to next type of collision
            count+=1;
        }
    }

    /**
     * A method that returns the width of the JFrame
     *
     * @return int value for the width
     */
    public static int getFrameWidth()
    {
        return WIDTH;
    }

    /**
     * A method that returns the height of the Jframe
     *
     * @return int value for the height
     */
    public static int getFrameHeight()
    {
        return HEIGHT;
    }

   
    /**
     * Must have this method because of interfacing with JPanel
     *
     * @param event A parameter
     */
    public void actionPerformed (ActionEvent event)
    {
    }
}