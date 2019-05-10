import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL(
            "http://www.gannett-cdn.com/-mm-/acc9106e8c1f7a978e9ddcbe377b2a5a6cc78b16/c=95-85-2461-1863&r=x404&c=534x401/local/-/media/USATODAY/test/2013/09/05/1378400626002--NASBrd-08-11-2013-Tennessean-1-B004-2013-08-10-IMG-NAS-FATCAT-03jpg-1-1-P.jpg");
        JOptionPane.showMessageDialog(null,"Hello","Title",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}