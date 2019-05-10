import java.awt.*;
import javax.swing.*;


/**
 * Write a description of class TreeViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreeViewer
{
    
    
    
    /**
     * Default constructor for objects of class TreeViewer
     */
    public TreeViewer()
    {
       JFrame frame = new JFrame();
       
       frame.setTitle("TreeFractal");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300, 400);
        TreeComponent comp = new TreeComponent();
     
       frame.add(comp);
      
       frame.setVisible(true);
      
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public static void main(String[] args)
    {
       
      
       TreeViewer view = new TreeViewer();
       
      
    }

}
