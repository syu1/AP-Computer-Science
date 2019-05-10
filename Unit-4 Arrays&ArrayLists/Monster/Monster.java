import java.util.Scanner;
/**
 * Class that contains a monster hunter program
 * 
 * @author @Sam Yu
 * @version 15 December 2014
 */
public class Monster
{
    
    // stores whether each cell triggered detection for the current scan of the radar
    private boolean[][] currentScan;
    private boolean[][] prevScan;
    // value of each cell is incremented for each scan in which that cell triggers detection 
    private int[][] accumulator;
    
    // location of the monster
    private int monsterLocationRow;
    private int monsterLocationCol;

    // probability that a cell will trigger a false detection (must be >= 0 and < 1)
    private double noiseFraction;
    
    // number of scans of the radar since construction
    private int numScans;
    // the dy and dx inputed by the user
    private int dx;
    private int dy;
    private int finalDx = 0;
    private int finalDy = 0;
    private int maxVelocity = 0;
    /**
     * Constructor for objects of class monster
     * 
     * @param   rows    the number of rows in the monster grid
     * @param   cols    the number of columns in the monster grid
     * @param monsterRow the row of the monster
     * @param monsterCol the col of the monster
     * @param dx         the change in x of the monster
     * @param dy         the change in y of the monster
     */
    
    public Monster(int rows, int cols, int monsterRow, int monsterCol, int dx, int dy)
    {
        
        
        //initalizes given dx and dy  
        this.dx = dx;
        this.dy = dy;
        
        prevScan = new boolean[rows][cols];//elements will be set to false
        currentScan = new boolean[rows][cols]; // elements will be set to false
        accumulator = new int[11][11]; // elements will be set to 10
        //ititalizes inital position of the monster
        monsterLocationRow = monsterRow;
        monsterLocationCol = monsterCol;
        
        //probability of a false monster appearing
        noiseFraction = 0.05;
        //number of times the scan method has been run
        numScans= 0;
    }
      /**
     * Constructor for objects of class monster but takes dx and dy through user input
     * 
     * @param   rows    the number of rows in the monster grid
     * @param   cols    the number of columns in the monster grid
     * @param monsterRow the row of the monster
     * @param monsterCol the col of the monster
     * dx         the change in x of the monster
     * dy         the change in y of the monster
     */
    
    public Monster(int rows, int cols, int monsterRow, int monsterCol)
    {
        //initalizes given dx and dy through user input  
        Scanner input = new Scanner(System.in);
        System.out.println("what is your dx: ");
        dx = input.nextInt();
        System.out.println("what is your dy: ");
        dy = input.nextInt();
        System.out.println("Please wait...");
        
        prevScan = new boolean[rows][cols];//elements will be set to false
        currentScan = new boolean[rows][cols]; // elements will be set to false
        accumulator = new int[11][11]; // elements will be set to 10
        //ititalizes inital position of the monster
        monsterLocationRow = monsterRow;
        monsterLocationCol = monsterCol;
        
        //probability of a false monster appearing
        noiseFraction = 0.05;
        //number of times the scan method has been run
        numScans= 0;
    }
    /**
     * Detector for the monster using given varibles dx and dy
     * 
     * @return returns false if the monster has left the screen and exits the method, otherwise returns true and runs through
     */
    
    public boolean scan()
    {
        //zero the grid and creates a nextScan copy
       for(int row = 0; row<prevScan.length; row++)
       {
           for(int col= 0; col<prevScan[0].length;col++)
           {
               prevScan[row][col] = currentScan[row][col];
               currentScan[row][col] = false;

               
           }
       }
       //places monster using given location
       if(numScans == 0)
       {
           prevScan[monsterLocationRow][monsterLocationCol] = true;
       }
       
       // checks if monster is within the bounds
       if(monsterLocationRow+dx>=getNumRows() || monsterLocationCol+dy>=getNumCols()|| monsterLocationRow+dx<0 || monsterLocationCol+dy < 0)
       {
           
           
           return false;
      
       }
        //monster moves to new location based given dy dx
       else
       {
           monsterLocationRow = monsterLocationRow+dx;
           monsterLocationCol = monsterLocationCol+dy;
          
           currentScan[monsterLocationRow][monsterLocationCol] = true;
       }
       
       //could not get it to work
       //injectNoise();
     
       
       //next i need to compare the distance between every pixel in the first frame
       //to the second frame and accumulate the distance.
       //by comparing the the distance in the frames. Then the accumulator
       //will increment. The acculator row and col being based on the dy and dx. Not monster
       //location.
       
       //cycles through prevScan's cells checking for monsters
       for(int row = 0; row < prevScan.length; row++)
        {
            for(int col = 0; col < prevScan[0].length; col++)
            {
               if(prevScan[row][col] == true)
               {
                
               //cycles through currentScan's cells checking for monsters
               for(int row2 = 0; row2 < currentScan.length; row2++)
               {
                   for(int col2 = 0; col2 < currentScan[0].length; col2++)
                   {
                       
                       //if a monster is found, currentScan cells and prevScan dx and dy are compared
                       if(currentScan[row2][col2] == true)
                       {
                           //this is calculating each of the possible dx and dys
                            int calcDx = row2 - row;
                            int calcDy = col2 - col;
                             //this is adjusted value
                             //after calculating the possible dx and dy's of a monster
                             //so that its cell's are all positive locations in the accumaltor
                            int accumDx = calcDx+5;
                            int accumDy = calcDy+5;
                            
                            //checks if the dy or dx is withing the acceptable range of zero and 10
                           if((0<=accumDx && accumDx<=10) && ((0<=accumDy && accumDy<=10)))
                           {
                               //increases the accumulator
                               accumulator[accumDx][accumDy]+= 1;
                               
                           }
                       }
                
                    }
                }
            }
            }
        
        }
        
        //initalized to zero as our base value
     
        //find the highest value of the accumulator cell using for loop and take the index of that for the dx and dy
        for(int accumRow = 0; accumRow < accumulator.length; accumRow++)
        {
            for( int accumCol = 0; accumCol< accumulator[0].length; accumCol++)
            {
                
                if(accumulator[accumRow][accumCol]> maxVelocity)
                {
                    //highest frequency found of the dx and dy index
                    maxVelocity = accumulator[accumRow][accumCol];
                    //subtract five to return the correct adjusted dx and dy
                    finalDy = accumCol-5;
                    finalDx = accumRow-5;
                }
            }
            
        }
        numScans++;
        return true;
    }
     /**
     * Sets the probability that a given cell will generate a false detection
     * 
     * @param   fraction    the probability that a given cell will generate a flase detection expressed
     *                      as a fraction (must be >= 0 and < 1)
     */
    public void setNoiseFraction(double fraction)
    {
        noiseFraction = fraction;
    }
    
    /**
     * Returns true if the specified location in the radar grid triggered a detection.
     * 
     * @param   row     the row of the location to query for detection
     * @param   col     the column of the location to query for detection
     * @return true if the specified location in the radar grid triggered a detection
     */
    public boolean isDetected(int row, int col)
    {
        return currentScan[row][col];
    }
    
    /**
     * Returns the number of times that the specified location in the radar grid has triggered a
     *  detection since the constructor of the radar object.
     * 
     * @param   row     the row of the location to query for accumulated detections
     * @param   col     the column of the location to query for accumulated detections
     * @return the number of times that the specified location in the radar grid has
     *          triggered a detection since the constructor of the radar object
     */        
 
    public int getAccumulatedDetection(int row, int col)
    {
        return accumulator[row][col];
    }
     /**
     * Returns the dx of the monster
     * 
     * @return the dx of the monster
     */
    public int getDx()
    {
        return finalDx;
    }
    public int getDy()
    {
        return finalDy;
    }
    /**
     * Returns the dy of the monster
     * 
     * @return the dy of the monster
     */
    public int getNumRows()
    {
        return currentScan.length;
    }
    
    /**
     * Returns the number of columns in the radar grid
     * 
     * @return the number of columns in the radar grid
     */
    public int getNumCols()
    {
        return currentScan[0].length;
    }
    
    /**
     * Returns the number of scans that have been performed since the radar object was constructed
     * 
     * @return the number of scans that have been performed since the radar object was constructed
     */
    public int getNumScans()
    {
        return numScans;
    }
    
    /**
     * Sets cells as falsely triggering detection based on the specified probability
     *
     */
    private void injectNoise()
    {
        for(int row = 0; row < currentScan.length; row++)
        {
            for(int col = 0; col < currentScan[0].length; col++)
            {
                // each cell has the specified probablily of being a false positive
                if(Math.random() < noiseFraction)
                {
                    currentScan[row][col] = true;
                }
            }
        }
    }
     /**
     * main method, takes information from the constructor
     * and outputs the dx and dy through window
     *
     */
    public static void main(String[] args)
    {
        
        Monster monster = new Monster(150,150,75,75);
        for (int i=0;i < 100; i++)
        {
            monster.scan();
        }
        System.out.println("finalDx" + monster.getDx() + "finalDy" +monster.getDy());
        
    }
    }