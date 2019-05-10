import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonViewer

{
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 100;
    private JFrame frame;
    private JPanel panel;
    private JButton buttonA;
    private JButton buttonB;
    private JLabel label;

    public ButtonViewer()
    {
        frame = new JFrame();
        panel = new JPanel();

        label = new JLabel( "No button clicked");

        buttonA = new JButton( "A");
        buttonB = new JButton( "B");
        panel.add(buttonA);
        panel.add(buttonB);
        panel.add(label);
        frame.add(panel);

        ClickListener listener = new ClickListener();

        buttonA.addActionListener( listener);
        buttonB.addActionListener( listener);

        frame.setSize( FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public static void main(String[] args)

    {  
        ButtonViewer viewer = new ButtonViewer();

    }


    public class ClickListener implements ActionListener
    {

        public void actionPerformed( ActionEvent event)
        {

            label.setText( "Button " + event.getActionCommand() + " was clicked!");

        }
    }
}