import java.util.Scanner;

public class Spectrum
{
    public static double sNum;
    
    public static void main (String[] args)
{
    Scanner spectrumInput = new Scanner(System.in);
    System.out.print("\n What is the wavelength of your light(in meters): ");

    sNum = spectrumInput.nextDouble();
    final double radio = 10e-1;
    final double micro = 10e-3;
    final double infra = 7e-7;
    final double vislight = 4e-7;
    final double ultralight = 10e-8;
    final double xray = 10e-11;
    
    if (sNum >= radio)
    System.out.println("It is a radio wave!");
    else if ((micro <= sNum)&& (sNum < radio))
    System.out.println("It is a microwave!");
    else if ((infra <= sNum)&& (sNum < micro))
    System.out.println("It is a infrared wave!");
    else if ((vislight <= sNum) && (sNum < infra))
    System.out.println("It is visible light wave!");
    else if ((ultralight <= sNum) && (sNum < vislight))
    System.out.println("It is a ultraviolet wave!");
    else if ((xray <= sNum) && (sNum < ultralight))
       System.out.println("It is a X-ray wave!");
    else
    
        System.out.println("It is a gamma wave!");
    // can delete first logic part dont need it, then flip the middle thingy < >
    // also add brackets or else the next line breaks the else if statement
}
}