
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 ** Class that sets a up several parameters for a building
 * and these parameters will be filled with input from the component class
 * @author sam yu
 * @version october
 */
public class Moon
{
     //color of moon
    private Color color;
    //horizantal distance from origin 
    private int x;
    //vertical distance from origin
    private int y;
    //height of moon
    private int height;
    //width of moon
    private int width;
   /**Constructor method for encapsulation and modifaction of private attributes
 * 
 */
   public Moon(int x, int y, int h, int w, Color color )
      {
      this.color = color;
      this.x = x;
      this.y = y;
      this.height = h;
      this.width = w;
           
    }
    /**
   @param  color is three inputed colors red green blue, build1 creates the moon object
     * @return returns a building based on component input into the viewer
     */
    public void draw(Graphics2D g2)
    
    {
       
        Ellipse2D.Double firstCircle = new Ellipse2D.Double(this.x  , this.y , this.width,this.height);
        //sets color
        g2.setColor(color);
        //draws moon
        g2.draw(firstCircle);
        //colors in moon based on set color
        g2.fill(firstCircle);
      
    }

}

