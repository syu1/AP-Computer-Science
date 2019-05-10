
import java.awt.Color;

public class Turtledraw

{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle red1 = new Turtle(turtleWorld);
        
        red1.setPenColor(Color.red);
        red1.setPenDown(false);
        red1.turn(-90);
        red1.forward(200);
        red1.turn(-90);
        red1.forward(50);
        red1.turn(180);
        red1.setPenDown(true);
        red1.forward(150);
        red1.turn(65);
        red1.forward(100);
        red1.turn(25);
        red1.forward(120);
        red1.turn(150);
        red1.forward(86);
        red1.turn(30);
        red1.forward(135);
        red1.turn(-90);
        red1.setPenDown(false);
        red1.forward(150);
        red1.turn(190);
        red1.setPenDown(true);
        red1.turn(50);
        red1.forward(80);
        red1.turn(30);
        red1.forward (140);
        red1.turn(-90);
        red1.forward(152);
        Turtle blue1= new Turtle(turtleWorld);
        blue1.setPenColor(Color.blue);
        blue1.setPenDown(false);
        blue1.turn(90);
        blue1.forward(10);
        blue1.turn(90);
        blue1.forward(11);
        blue1.setPenDown(true);
        blue1.turn(60);
        blue1.forward(75);
        blue1.turn(30);
        
        blue1.setPenDown(false);
        blue1.forward(9);
        blue1.setPenDown(true);
        blue1.turn(90);
        
        blue1.forward(148);
        blue1.setPenDown(false);
        blue1.backward(148);
        blue1.setPenDown(true);
        blue1.turn(-91);
        blue1.forward(138);
        
        
        
        
        
        
        
        
        
        
        
    }
}

        
        