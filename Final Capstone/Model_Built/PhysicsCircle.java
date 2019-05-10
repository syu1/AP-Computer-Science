import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Makes a cicle based on the parameters
 * 
 * @author Sam Yu
 * @version April 25th 2015
 */
public class PhysicsCircle
{
   
    private Color color;
    private double x;
    private double y;
    private double height;
    private double width;
    /**
     * Default constructor for objects of class PhysicsCircle
     */
   public PhysicsCircle(double x, double y, double h, double w, Color color )
      {
      this.color = color;
      this.x = x;
      this.y = y;
      this.height = h;
      this.width = w;
           
    }
    /**
     * Draws a circle and fills it in using parameters
     * @param graphics g2 needed for gui and graphics usage
     */
    public void draw(Graphics2D g2)
    
    {
       
        Ellipse2D.Double firstCircle = new Ellipse2D.Double(this.x  , this.y , this.width,this.height);
        g2.setColor(color);
        g2.draw(firstCircle);
        g2.fill(firstCircle);
      
    }

}

