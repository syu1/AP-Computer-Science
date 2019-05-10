import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList;
/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    
    // the game board will have 5 rows and 5 columns
    private final int ROWS = 25;
    private final int COLS = 25;
    
    // constants for the location of the three cells initially alive
    private final int X1 = 0, Y1 = 2;
    private final int X2 = 2, Y2 = 0;
    private final int X3 = 2, Y3 = 1;
    // constants for the location of the second generation
   
    // third generation expects all null

    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        ActorWorld world = new ActorWorld(grid);
        // populate the game
        populateGame(world);
        
        // display the newly constructed and populated world
        world.show();
        
    }
    
    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife(ActorWorld world)
    {
        // create the grid, of the specified size, that contains Actors
        //BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        //ActorWorld world = new ActorWorld(grid);
        // populate the game
        populateGame(world);
        
        // display the newly constructed and populated world
        //world.show();
        
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame(ActorWorld world)
    {
        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add rocks (a type of Actor) to the three intial locations
        Rock rock1 = new Rock();
        Location loc1 = new Location(X1, Y1);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(X2, Y2);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(X3, Y3);
        grid.put(loc3, rock3);
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        //OK when the next gen method is called a new board is created with the constructor variables
        BoundedGrid<Actor> nowGrid = new BoundedGrid<Actor>(ROWS, COLS);
        BoundedGrid<Actor> nextGenGrid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        ActorWorld world1 = new ActorWorld(nowGrid);
        ActorWorld world2 = new ActorWorld(nextGenGrid);
       
        // get access to the information of the current grid from world object,
        // of the specified size, that contains Actors
        
        Grid<Actor> currentGrid = world1.getGrid();
        Grid<Actor> afterGrid = world2.getGrid();
        // insert magic here...
        
     
        final int MAX_ROWS = currentGrid.getNumRows();
        final int MAX_COLS = currentGrid.getNumCols();
        
        GameOfLife game1 = new GameOfLife(world1);
      
        
        for(int row = 0; row < MAX_ROWS; row++)
        {
           for(int col = 0; col < MAX_COLS; col++)
           {
               //made a rock to put in different places when needed
              Rock rock = new Rock();
               //This creates a new game of life using the given constructors when the method is called upon
              //Get actor from the first grid
              Actor cell = game1.getActor(row, col, world1);
              //gets current cell based on the row and col from the for loops  
              Location cellLocation = new Location(row,col);
              //Gets nearby locations based on the current value of the two for loops  
              ArrayList<Location> occupiedCells = currentGrid.getOccupiedAdjacentLocations(cellLocation);
              //counts the number of locations, by checking the size of the array occupiedCells  
              int numOfNeighbors  = occupiedCells.size();
              //gets the same location...
              Location newloc = new Location(row, col); 
              
               // if the cell at the current row and col should be alive, assert that the actor is not null
                if(cell == null) 
                {
                   
                   
                  // if (checkValid == true)//if it is valid and full
                  // {
                       //remove the object in the new grid
                    //   currentGrid.remove(newloc);
                   
                  // }
                   
                   
                   if(numOfNeighbors == 3)
                   {
                       // save result into new grid that this cell at row,col is ALIVE
                       
                       
                       afterGrid.put(newloc,rock);
                     
                   }
                   //switch out the grids? somehow
               }
                else 
               {
                   
                   
                   if(numOfNeighbors == 2 || numOfNeighbors == 3 )
                   {
                       //saving these numbers to the extra grid
                       
                       
                       
                       
                       //need to check if the cell in the next gen grid is full or not.
                       //if it is full leave it alone
                       //if it is not, run the code below
                       afterGrid.put(newloc,rock);
                   
                    }
                 
                   
                   afterGrid.remove(newloc);
                   
                    
                       
                   
                   
                }
                
           }
       }
       
       world1 = world2;
       world2 = world1;
       world1.show();
     
       
    }
    
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col,ActorWorld world)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args)
    {
        GameOfLife game = new GameOfLife();
        //need to run next geneeration method here and print display output for expected cells
        // run population method again?
        //run nextgen for third generation... expect nothing
        
        game.createNextGeneration();
        game.createNextGeneration();
        //ok.. make it so that by calling nextgeneration makes it run through till the end
        
}
}