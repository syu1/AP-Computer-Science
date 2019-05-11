
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
public class TargetDraw
{
    private int x;
    private int y;
    
   
       public TargetDraw(int x, int y)
    {
           this.x = x;
           this.y = y;
           
    }
    public void draw(Graphics2D g2)
    
    {
       
        Ellipse2D.Double firstCircle = new Ellipse2D.Double(this.x + 0 , this.y + 0, 150, 150);
        Ellipse2D.Double secondCircle = new Ellipse2D.Double(this.x +33  ,this.y +33 , 100,100 );
        g2.setColor(Color.red);
        g2.draw(firstCircle);
        g2.fill(firstCircle);
        g2.setColor(Color.white);
        g2.draw(secondCircle);
        g2.fill(secondCircle);
    }
}
    