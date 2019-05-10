import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

import javax.swing.JComponent;

/**
 * Write a description of class TreeComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreeComponent extends JComponent
{
  
   
   private final double newLineFactor = 2/3;// the factor of which the new line decreases
   private final double angle = Math.PI/6;
    /**
     * Default constructor for objects of class TreeComponent
     */
    public TreeComponent()
    {
     
    }

    

  
    public void drawFractal (double X1, double Y1, double X2, double Y2, double angle, Graphics page)                    
    {
        Graphics2D g2 = (Graphics2D) page;
        Color c = new Color (250, 100, 50);
        g2.setColor(c);
        Point2D.Double pointOne = new Point2D.Double(X1,Y1);
        Point2D.Double pointTwo = new Point2D.Double(X2,Y2);
        Line2D.Double segmentOne = new Line2D.Double(pointOne,pointTwo);
        double calc_distanceX = X2-X1;
        double calc_distanceY = Y2-Y1;
        double distance = Math.sqrt(Math.pow(calc_distanceX,2) + Math.pow(calc_distanceY,2));
        double newDistance = distance*newLineFactor;
                                                  
        //i get to choose the new angle
        //int newDistance = some sort of alegrabic expression that mister sschmict taught us but i forot 
        g2.draw(segmentOne);
        
        
       
    }
   
   public void paintComponent (Graphics page)
   {
    double x1 = 100;
    double y1 = 300;
    double x2 = 100;
    double y2 = 100;
     Graphics2D g2 = (Graphics2D) page;
     drawFractal(x1,y1,x2,y2,angle,page);
   }
}
