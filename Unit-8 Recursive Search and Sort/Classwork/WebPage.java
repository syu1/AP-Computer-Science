import java.net.URL;
public class WebPage
{
   
    public WebPage(String adress)
    {
        
    }

   
    public void main(String[] args)
    {
        Webpage adress = new Webpage("http://www.ssa.gov/oact/babynames/")
        URL pageLocation = new URL(adress);
        
        Scanner WebPageStuff = new Scanner(pageLocation.openStream()):
        WebPageStuff.useDelimiter(" "):
        
        while(WebPageStuff.hasNext())
        {
            
             WebPageStuff.next():
             if(WebPageStuff.hasNextString())
             {
                 String Name = WebPageStuff.next();
                 if(Name.equals("Matt")
                 {
                     System.out.println("That is a good name");
                     
                 }
             }
             
             
                 
             
        }
    }

}
