import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;


import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class TriangleComponent extends JFrame
{
    // draw a tiny circle on click
    private static final int tiny_circ_width;
    private static final int tiny_circ_height;
    
    private static final int Frame_Width = 500;
    private static final int Frame_Height =350;
    private JPanel panel;
    private MouseListener listener;
    //probably right double check
    private Ellipse2D.Double firstClick;
    private Ellipse2D.Double secondClick;
    private Ellipse2D.Double thirdClick;
    
    private JFrame frame;
    
    
    public TriangleComponent()
    {
      frame = new JFrame();
      
      panel = new JPanel();
      
      frame.setSize( Frame_Width, Frame_Height);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      
      
    
      firstClick.mouseClicked(listener);
      secondClick.mouseClicked(listener);
      thirdClick.mouseClicked(listener);
      
      
    }


}
