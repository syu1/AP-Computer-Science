


public class ChoiceQuestion extends Question
{
    // what are the primary colors of light?
    //1. red blue yellow
    //2. red blue green
    //3. purple pink orange
    
    public ChoiceQuestion()
    {
        //calls parent constructor
        super();
        
        numberOfChoices = 0;
        
    }
    
    public void addChoice( String choice, boolean correct)
    {
        numberOfChoice++;
        super.addText( "\n" + numberOfChice + ") " + choice);
        if(correct)
        {
            String answerString = "" + numberOfChoice;
            super.setAnswer( answerString );
        }
    }
}