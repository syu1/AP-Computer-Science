import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public class KochSnowflakeViewer implements ActionListener
{
    private final int WIDTH = 600;
    private final int HEIGHT = 500;

    private final int MIN = 1, MAX = 9;

    private JButton increase, decrease, randomColor, randomAngle;
    private JLabel titleLabel, titleLabel2, titleLabel3, orderLabel;
    private KochPanel drawing;
    private JPanel panel, tools;
    private JFrame frame;

    //-----------------------------------------------------------------
    //  Sets up the components for the applet.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        KochSnowflakeViewer viewer = new KochSnowflakeViewer();
    }

    public KochSnowflakeViewer()
    {
        tools = new JPanel ();
        tools.setLayout (new BoxLayout(tools, BoxLayout.X_AXIS));
        tools.setBackground (Color.yellow);
        tools.setOpaque (true);

        //titleLabel = new JLabel ("The fractal tree lab");
        //titleLabel.setForeground (Color.black);

        increase = new JButton (new ImageIcon ("increase.gif"));
        increase.setPressedIcon (new ImageIcon ("increasePressed.gif"));
        increase.setMargin (new Insets (0, 0, 0, 0));
        increase.addActionListener (this);
        
        decrease = new JButton (new ImageIcon ("decrease.gif"));
        decrease.setPressedIcon (new ImageIcon ("decreasePressed.gif"));
        decrease.setMargin (new Insets (0, 0, 0, 0));
        decrease.addActionListener (this);
        
        titleLabel2 = new JLabel ("Random color");
        titleLabel2.setForeground (Color.black);

        randomColor = new JButton (new ImageIcon ("Flower.gif"));
        randomColor.setPressedIcon (new ImageIcon ("Flower.gif"));
        randomColor.setMargin (new Insets (0, 0, 0, 0));
        randomColor.addActionListener (this);

        titleLabel3 = new JLabel ("Random angle");
        titleLabel3.setForeground (Color.black);

        randomAngle = new JButton (new ImageIcon ("Bug.gif"));
        randomAngle.setPressedIcon (new ImageIcon ("BoxBug.gif"));
        randomAngle.setMargin (new Insets (0, 0, 0, 0));
        randomAngle.addActionListener (this);

        orderLabel = new JLabel ("Order: 1");
        orderLabel.setForeground (Color.black);

        //tools.add (titleLabel);
        tools.add (orderLabel);
        tools.add (Box.createHorizontalStrut (20));
        tools.add (decrease);
        tools.add (increase);
        tools.add (Box.createHorizontalStrut (20));
        tools.add (titleLabel2);
        tools.add (randomColor);
        tools.add (Box.createHorizontalStrut (20));
        tools.add (titleLabel3);
        tools.add (randomAngle);
        tools.add (Box.createHorizontalStrut (20));

        drawing = new KochPanel (1);

        panel = new JPanel();
        panel.add (tools);
        panel.add (drawing);

        frame = new JFrame();
        frame.setTitle("Sam's tree of colors");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.add(panel);
        frame.setVisible(true);
    }

    //-----------------------------------------------------------------
    //  Determines which button was pushed, and sets the new order
    //  if it is in range.
    //-----------------------------------------------------------------
    public void actionPerformed (ActionEvent event)
    {
        int order = drawing.getOrder();
        
        
        if (event.getSource() == increase) {
            order++;
        }
            
        if (event.getSource() == decrease) {
            order--;
        }
       
        if (event.getSource() == randomColor) {
            Random ran1 = new Random();
            int c1 = ran1.nextInt(255);
            int c2 = ran1.nextInt(255);
            int c3 = ran1.nextInt(255);
            
            drawing.setColor( new Color(c1,c2,c3) );
        }

        if (event.getSource() == randomAngle) {
            Random ran1 = new Random();
            int a1 = ran1.nextInt(40);
            drawing.setAngle( (double) 20 + a1 );
        }

        if (order >= MIN && order <= MAX)
        {
            orderLabel.setText ("Order: " + order);
            drawing.setOrder (order);
            frame.repaint();
        }
    }
}