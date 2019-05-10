import java.awt.*;
import javax.swing.JPanel;
import java.util.Random;
public class KochPanel extends JPanel
{
   private final int PANEL_WIDTH = 500;
   private final int PANEL_HEIGHT = 500;

   private final double SQ = Math.sqrt(3.0) / 6;

   private final int TOPX = 250, TOPY = 300;
   private final int BOTX = 250, BOTY = 400;
   
   private double angle = 30; // current angle
   private int current; //current order
   private Color color = Color.green; //current color

   //-----------------------------------------------------------------
   //  Sets the initial fractal order to the value specified.
   //-----------------------------------------------------------------
   public KochPanel (int currentOrder)
   {
      current = currentOrder;
      setBackground (Color.black);
      setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
   }

   //-----------------------------------------------------------------
   //  Draws the fractal recursively. Base case is an order of 1 for
   //  which a simple straight line is drawn. Otherwise three
   //  intermediate points are computed, and each line segment is
   //  drawn as a fractal.
   //-----------------------------------------------------------------
   public void drawFractal (int order, int x1, int y1, int x2, int y2, double angle,
                            Graphics page)
   {
      int deltaX, deltaY;
      double newLineFactor = .9;
      page.drawLine(x1,y1,x2,y2);
      if (order == 1)
         {
              page.drawLine (x1, y1, x2, y2);
         }
      else
      {
         deltaX = x2 - x1;  // distance between end points
         
         deltaY = y2 - y1;
         int counter = 0;
        
         double distance = Math.sqrt(Math.pow(deltaX,2) + Math.pow(deltaY,2));
         
         double newDistance = distance*newLineFactor;
         
         double xComponent = newDistance*Math.sin(Math.toRadians(angle+(.5*angle)*(counter)));
         double yComponent = newDistance*Math.cos(Math.toRadians(angle+(.5*angle)*(counter)));
         
         double xComponent2 = newDistance*Math.sin(Math.toRadians(angle+(.5*angle)*(counter)));
         double yComponent2 = newDistance*Math.cos(Math.toRadians(angle+(.5*angle)*(counter)));
         
         counter++;
         x2 = x1 + (int)xComponent ;
         y2 = y1 - (int)yComponent ;
         
         
        
         int x3 = x2 + (int)xComponent2;
         int y3 = y1 - (int)yComponent2;
        
        
         drawFractal (order-1, x1, y1, x2, y2, angle , page);
         drawFractal (order-1, x1, y1, x2, y2, -angle , page);
         drawFractal (order-1, x2, y2, x3, y3, angle , page);
         drawFractal (order-1, x2, y2, x3, y3, -angle , page);
         
      }
   }

   //-----------------------------------------------------------------
   //  Performs the initial calls to the drawFractal method.
   //-----------------------------------------------------------------
   public void paintComponent (Graphics page)
   {
      super.paintComponent (page);
      page.setColor (color);
   
      drawFractal (current, TOPX, TOPY, BOTX, BOTY, this.angle, page);
      drawFractal (current, TOPX, TOPY, BOTX, BOTY, -this.angle, page);
      
   }

   //-----------------------------------------------------------------
   //  Sets the fractal order to the value specified.
   //-----------------------------------------------------------------
   public void setOrder (int order)
   {
      current = order;
   }

   //-----------------------------------------------------------------
   //  Returns the current order.
   //-----------------------------------------------------------------
   public int getOrder ()
   {
      return current;
   }
   

   //-----------------------------------------------------------------
   //  Sets the fractal color to the value specified.
   //-----------------------------------------------------------------
   public void setColor (Color color)
   {
      this.color = color;
   }

   //-----------------------------------------------------------------
   //  Returns the current color.
   //-----------------------------------------------------------------
   public Color getColor()
   {
      return color;
   }
   
   //-----------------------------------------------------------------
   //  Sets the fractal angle to the value specified.
   //-----------------------------------------------------------------
   public void setAngle (double angle)
   {
      this.angle = angle;
   }

   //-----------------------------------------------------------------
   //  Returns the current angle.
   //-----------------------------------------------------------------
   public double getAngle()
   {
      return angle;
   }
   
}