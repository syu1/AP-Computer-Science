
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;


/**
 *
 * Class that sets a up several parameters for a Grass
 * and these parameters will be filled with input from the component class
 * @author sam yu
 * @version october
 */
public class Grass
{
   //color of grass field
    private Color color;
    //horizantal distance from origin 
    private int x;
    //vertical distance from origin
    private int y;
    //height of grass field
    private int height;
    //width of grass field
    private int width;
    /**
     * Constructor method for encapsulation and modifcation of private attributes
     */
     public Grass(int x, int y, int h, int w, Color color )
      {
      this.color = color;
      this.x = x;
      this.y = y;
      this.height = h;
      this.width = w;
    }

    /**
      * @param  color is three inputed colors red green blue, build1 creates the grass object
     * @return returns a building based on component input into the viewer
     */
    public void draw(Graphics2D g2) 
    
    {
        Rectangle grass = new Rectangle(this.x , this.y ,this.width,this.height);
        //sets color
        g2.setColor(color);
        //draws grass
        g2.draw(grass);
        //colors in grass based on set color
        g2.fill(grass);
    
    }

}
