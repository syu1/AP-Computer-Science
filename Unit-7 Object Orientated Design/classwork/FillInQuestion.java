import java.util.Scanner;

/**
 * Write a description of class FillInQuestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FillInQuestion extends Question
{
    // specified test: "The invetor of Java is _James Gosling_ from Sun."
    // This class converts the specified text into the prompt and answer
    // test: "The inventor of Java is ____ from Sun."
    // answer: James Gosling"
  public FillInQuestion()
  {
      Scanner parser = new Scanner( questionText );
      
      parser.useDelimiter( "_" );
      
      String question = parser.next();
      String answer  =  parser.next;
      question += "______" + parser.next();
      
      super.setText(question);
      super.setAnswer(answer);
  }
    

}
