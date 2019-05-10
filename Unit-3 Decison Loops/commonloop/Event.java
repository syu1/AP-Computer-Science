import java.util.Scanner;

/**
 * Write a description of class Event here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Event
{
    /** description of instance variable x (add comment for each instance variable) */
    private String eventName = "";
    private int daysLeft;
   

    /**
     * Default constructor for objects of class Event
     */
    public Event(String name, int days)
    {
       this.eventName = name;
       this.daysLeft = days;
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
    public int getdays()
    {
        return daysLeft;
    }
    public String getevent()
    {
        return eventName;
    }
    public String toString()
    {
        int weeks = daysLeft/7;
        double daysdisplay = daysLeft-(weeks*7.0);
        String display = "There are " + weeks + " weeks left and " +  daysdisplay + " days for your event " + eventName; 
        return display;
    }
    public void addDaysLeft()
    {
        daysLeft+=1;
    }
    public void subtractDaysleft()
    {
        daysLeft-=1;
    }
    public void changeEventName()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your new name: ");
        String replacedName = in.nextLine();
        
        String newName = eventName.replace(eventName , replacedName);
    }
}
