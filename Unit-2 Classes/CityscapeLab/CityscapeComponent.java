import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @Sam Yu
 * @version 06 October 2014
 */
public class CityscapeComponent extends JComponent
{
    /**
     * This method draws pictures on the viewerframe using the draw method
     *
     *
     * @param g is the parameter for graphics objects 
    
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        //Color
        //sets gray color of first building
        Color colorbuilding1 = new Color(100,100,100);
        Color colorbuilding2 = new Color(100,100,100);
        Color colorbuilding3 = new Color(100,100,100);
        //sets green color for grass background
        Color colorgrass = new Color(50,150,50);
        //sets black color for background sky
        Color colorsky = new Color(0,50,200);
        //sets silver color for moon object
        Color colormoon = new Color(255,255,153);
        //creates moon object
        Moon moon = new Moon(575,35,100,100, colormoon);
        //creates building1 objects
        Building building1 = new Building(50,110,310,80, colorbuilding1);
        Building building2 = new Building(180,20,400,80,colorbuilding2);
        Building building3 = new Building(310,270,150,80,colorbuilding3);
        //creats grasas object
        Grass grass = new Grass(0,200,350,800,colorgrass);
        //creates sky object
        Sky sky = new Sky(0,0,350,800,colorsky);
       
        //uses draw method to create the objects on the viewerframe
        
        sky.draw(g2);
        grass.draw(g2); 
        moon.draw(g2);
        building1.draw(g2);
        building2.draw(g2);
        building3.draw(g2);
       
        
        
    }

}

