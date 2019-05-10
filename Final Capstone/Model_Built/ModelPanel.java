import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.*;
import javax.swing.JPanel;
import java.lang.Thread;
/**
 * A JPanel that carries the algorithms and mathematics behind
 * the collision detection and elastic collision
 * @author Sam Yu 
 * @version April 25 2015
 */
public class ModelPanel extends JPanel
{
    private double circDiameter = 100;

    private double radius;
    //Since elipse 2d starts the starting point at the top lefthand corner of the circle
    private double circUpperLeftX1 = 500.0;
    private double circUpperLeftY1 = 100.0;
    //moves the point the middle of the circle
    private double circCenterX1;
    private double circCenterY1;

    private double circUpperLeftX2;
    private double circUpperLeftY2;

    private double circCenterX2;
    private double circCenterY2;
    //instance variables for different frame detections
    private double YTopCollision = 0.0;
    private double YBotCollision = 0.0;
    private double XLeftCollision = 0.0;
    private double XRightCollision = 0.0;
    //for calculating the distance remaing between circles
    private double deltaX;
    private double deltaY;
    private double distanceMidPTS;
    private double distanceRemaining;
    //speed of the circles broken into components
    private double componentX1;
    private double componentY1;

    private double componentX2;
    private double componentY2;

    private double mass1;
    private double mass2;

    private double XfinalVelocity1;
    private double XfinalVelocity2;
    private double YfinalVelocity1;
    private double YfinalVelocity2;

    /**
     * ModelPanel Constructor
     *sets the background color of the panel to black
     */
    public ModelPanel()
    {
        setBackground (Color.black);
    }

    /**
     * Instantiates two circles and colors them in using the PhysicsCircle class.
     *
     * @param g needed for gui and graphics
     */
    public void paintComponent(Graphics g)
    {

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Color color1 = new Color(100,150,200);
        Color color2 = new Color(255,48,48);

        PhysicsCircle circ1 = new PhysicsCircle(circUpperLeftX1,circUpperLeftY1,circDiameter,circDiameter,color1);
        PhysicsCircle circ2 = new PhysicsCircle(circUpperLeftX2,circUpperLeftY2,circDiameter,circDiameter,color2);

        circ1.draw(g2);
        circ2.draw(g2);
    }

    /**
     * Checks the distance between Circles.
     *
     * @return True if the circles are touching, false if they are not
     */
    public boolean circleCollisionDetected()
    {
        radius = circDiameter/2.0;
        //moves the reference point the middle of the circle
        circCenterX1 = circUpperLeftX1 + radius;
        circCenterY1 = circUpperLeftY1 + radius;

        circCenterX2 = circUpperLeftX2 + radius;
        circCenterY2 = circUpperLeftY2 + radius;
        //used for the midpoint formula
        deltaX = circCenterX2-circCenterX1;
        deltaY = circCenterY2-circCenterY1;

        //finds the distance between the midpoints
        distanceMidPTS = 1.0*Math.sqrt(Math.pow(deltaX,2) + Math.pow(deltaY,2));

        //then gets the distance remaining from the edge of the circles 
        distanceRemaining = distanceMidPTS - (circDiameter);

        //Checks if there is any distance remaining between the two circles
        // then return if there is it is true or false
        if(distanceRemaining <= 0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    //spent several hours trying to get it to accept a parameter of type PhysicsCircle
    //does not work due to issues with the java swing calling paintComponent at the wrong time
    /**
     * Calculates the distance between circle 1 and all four edges of the frame
     *
     * @return True if any part of the circle touchs and part of the frame, false if no collision
     *
     * @throws exception
     */
    public boolean frameCircleCollisionDetectedCirc1() throws InterruptedException
    {
        radius = circDiameter/2.0;
        //gets the reference point to the middle
        circCenterX1 = circUpperLeftX1 + radius;
        circCenterY1 = circUpperLeftY1 + radius;
        //gets the Jframe heights
        double frameHeight = (double)ModelViewer.getFrameHeight();
        double frameWidth = (double)ModelViewer.getFrameWidth();

        //calcs the distance between top edge of the circle and the top frame
        YTopCollision = (circCenterY1 - radius);

        //calcs the distance of edge right edge of the circle and right frame, added 21 because the Jframe Width is inaccurate
        XRightCollision = circCenterX1 + radius + 20; 

        //calcs the distance of left circle edge and left frame

        XLeftCollision = (circCenterX1 - radius);

        //calcs the distance of bottom circle edge and bottom of frame, not sure why I need 41
        YBotCollision =  circCenterY1 + radius + 41;
        //checks for collision if the distance exceeds the given values
        if(YTopCollision <= 0) 
        {

            return true;
        }
        else if(XRightCollision >= frameWidth) 
        {

            return true;
        }
        else if( XLeftCollision <= 0 ) 
        {

            return true;
        } 
        else if(YBotCollision >= frameHeight) 
        {

            return true;
        }

        else
        {

            return false;
        }

    }
    //spent several hours trying to get it to accept a parameter of type PhysicsCircle
    //does not work due to issues with the java swing calling paintComponent
    /**
     * Calculates the distance between circle 2 and all four edges of the frame
     *
     * @return True if any part of the circle touchs and part of the frame, false if no collision
     */
    public boolean frameCircleCollisionDetectedCirc2() throws InterruptedException
    {
        radius = circDiameter/2.0;

        circCenterX2 = circUpperLeftX2 + radius;
        circCenterY2 = circUpperLeftY2 + radius;


        double frameHeight =(double) ModelViewer.getFrameHeight();
        double frameWidth = (double)ModelViewer.getFrameWidth();

        //calcs the distance between top edge of the circle and the top frame
        YTopCollision = (circCenterY2 - radius);

        //calcs the distance of edge right edge of the circle and right frame
        XRightCollision = circCenterX2 + radius + 20.0; 

        //calcs the distance of left circle edge and left frame

        XLeftCollision = (circCenterX2 - radius);

        //calcs the distance of bottom circle edge and bottom of frame
        YBotCollision =  circCenterY2 + radius + 41.0;

        if(YTopCollision <= 0.0) 
        {

            return true;
        }
        else if(XRightCollision >= frameWidth) 
        {

            return true;
        }
        else if( XLeftCollision <= 0.0 ) 
        {

            return true;
        } 
        else if(YBotCollision >= frameHeight) 
        {

            return true;
        }

        else
        {

            return false;
        }

    }

    /**
     * Moves circle1 according the component velocities
     *
     */
    public void moveCircle1()
    {
        circUpperLeftX1+=componentX1;
        circUpperLeftY1+=componentY1;

    }

    /**
     * Moves circle2 according the component velocities
     *
     */
    public void moveCircle2()
    {
        circUpperLeftX2+=componentX2;
        circUpperLeftY2+=componentY2;

    }

    /**
     * Sets the mass, starting point and velocity of the circles 
     *for a horizontal collison, then calculates the final velocities
     */
    public void setHorizontalCollision()
    {
        //v1final = (m1-m2/m1+m2)*v1Initial
        //v2final = (2m1/m1+m2)v1Intial
        mass1 = 50;
        mass2 = 100;

        circUpperLeftX1 = 700;
        circUpperLeftY1 = 100;
        circUpperLeftX2 = 300;
        circUpperLeftY2 = 100;

        componentX1 = -1.0;
        componentY1 = 0;

        componentX2 = 0.0;
        componentY2 = 0;

        XfinalVelocity1 = ((mass1 - mass2)/ (mass1 + mass2)) * componentX1;
        XfinalVelocity2 = ((2*mass1)/(mass1+mass2)) * componentX1;

    }
    /**
     * Method setVerticalCollision
     *
     */
    public void setVerticalCollision()
    {

        mass1 = 120;
        mass2 = 120;

        circUpperLeftX1 = 500;
        circUpperLeftY1 = 1;
        circUpperLeftX2 = 500;
        circUpperLeftY2 = 300;

        componentX1 = 0;
        componentY1 = 1;

        componentX2 = 0.0;
        componentY2 = 0.0;
        //v1final = (m1-m2/m1+m2)*v1Initial
        //v2final = (2m1/m1+m2)v1Intial
        YfinalVelocity1 = ((mass1 - mass2)/ (mass1 + mass2)) * componentY1;
        YfinalVelocity2 = ((2*mass1)/(mass1+mass2)) * componentY1;
    }

    /**
     * Uses the circleCollisionDetected method to see if the distance
     * between the circles is zero, then changes the velocities to the 
     * new calculated ones after impact
     */
    public void checkHorizontalCollision()
    {

        boolean checkCirclesCollision = circleCollisionDetected();
        if(checkCirclesCollision == true)
        {
            System.out.println("HORIZONTAL COLLISION");
            System.out.println("The mass of moving circle: " + mass1);
            System.out.println("The mass of stationary circle: " + mass2);
            System.out.println("The initial velocity of moving circle: " + componentX1);
            System.out.println("The final velocity of the BLUE circle: " + XfinalVelocity1);
            System.out.println("The final velocity of the RED circle: " + XfinalVelocity2);
            //sets new velocities after impact
            componentX1 = XfinalVelocity1;
            componentX2 = XfinalVelocity2;

        }

    }
    /**
     * Uses the circleCollisionDetected method to see if the distance
     * between the circles is zero, then changes the velocities to the 
     * new calculated ones after impact
     */
    public void checkVerticalCollision()
    {
        boolean checkCirclesCollision = circleCollisionDetected();
        if(checkCirclesCollision == true)
        {
            System.out.println("VERTICAL COLLISION");
            System.out.println("The mass of moving circle: " + mass1);
            System.out.println("The mass of stationary circle: " + mass2);
            System.out.println("The initial velocity of moving circle: " + componentY1);
            System.out.println("The final velocity of the BLUE circle: " + YfinalVelocity1);
            System.out.println("The final velocity of the RED circle: " + YfinalVelocity2);
            componentY1 = YfinalVelocity1;
            componentY2 = YfinalVelocity2;
        }
    }

    
}

