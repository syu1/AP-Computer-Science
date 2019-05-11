
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;

public class TargetComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        TargetDraw target1 = new TargetDraw(100 , 100);
        
        target1.draw(g2);
      
        
    }
}
        
    
