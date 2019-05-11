

/**
 * Write a description of class Car here.
 * a car simulator
 * The Car class tracks the fuel remaining in the car as it is driven based on  the fuel efficency
 * @author Sam yu 
 * @version (12 September 2014)
 */
public class Car
{
   

    private double fuelEfficiency;
    /** The number of gallons of fuel left in this car's tank
     */
    private double fuelInTank;
    /**
     * Constructor for a car of the specified fuel efficiency.
     */
    public Car(double Efficiency)
    {
        this.fuelEfficiency = Efficiency;
        fuelInTank = 0;
    }

    /**
     * Updated the fuel in this car's tank based on the specified number of miles driven and this car's fuel
     * Adds the specified number of gallons of fuel to this car's tank
     *
     * @pre        specified number of gallons does not exceed this car's tank capacity
     *            (what the method assumes about the method's parameters and class's state)
     * 
     * @param    gallons number of gallons of fuel to add to this car's tank
     */
    public void addGas(double gallons)
    {
        this.fuelInTank= this.fuelInTank + gallons;
    }


    /**
     * 
     */
    public void drive(double miles)
    {
        double gallonsBurned = miles/ this.fuelEfficiency;
        this.fuelInTank = this.fuelInTank - gallonsBurned;

    }
    
    /**
     * Returns
     * @return  description of the return value
     */
    public double getGasInTank()
    {
        return this.fuelInTank;
    }

}
