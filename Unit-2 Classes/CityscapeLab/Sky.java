
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
  Class that sets a up several parameters for a building
 * and these parameters will be filled with input from the component class
 * @author sam yu
 * @version october
 */
public class Sky
{
   //color of sky
    private Color color;
    //horizantal distance from origin
    private int x;
    //vertical distance from origin
    private int y;
    //height of 
    private int height;
    //width of building
    private int width;
    /**Constructor method for encapsulation and modifaction of private attributes 
 * 
 */
     public Sky(int x, int y, int h, int w, Color color )
      {
      this.color = color;
      this.x = x;
      this.y = y;
      this.height = h;
      this.width = w;
      
      
    }

    /**
     *@param  color is three inputed colors red green blue, sky creates the sky object
     * @return returns a sky based on component input into the viewer
     */
    public void draw(Graphics2D g2) 
    
    {
       Rectangle sky = new Rectangle(this.x , this.y ,this.width,this.height);
      //sets color
        g2.setColor(color);
        //draws sky
        g2.draw(sky);
        //colors in sky based on set color
        g2.fill(sky);
    
    }

}
