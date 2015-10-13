// PUT FILE HEADER HERE
/**
 * This game is based on John Conway's Game of Life as described in Wikipedia.
 * https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life
 */


// PUT import statements here

import java.util.Arrays;
import java.util.Scanner;


//PUT CLASS HEADER HERE
public class GameOfLife {

	// DO NOT ADD STATIC FIELDS TO THIS CLASS
	// YOU MUST SOLVE ALL PARTS BY PASSING THE 
	// THE VALUES YOU NEED TO AND FROM METHODS.
	// WE WILL TEST ALL METHODS INDEPENDENT OF 
	// OTHER METHODS.  
	//
	// THAT CAN ONLY WORK IF YOU DEFINE EACH 
	// METHOD AS DESCRIBED.  YOU MAY NOT IMPLEMENT
	// YOUR OWN DESIGN EXCEPT TO ADD PRIVATE
	// HELPER METHODS AS YOU LIKE.  YOU MUST
	// STILL IMPLEMENT ALL PUBLIC METHODS
	// OF THIS CLASS.

	/**
	 * Program execution starts here.
	 * @param args UNUSED
	 */    
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		//declare local variables
		int userInput;
		// Display Welcome message        
		System.out.println("Welcome to the Game of Life");
			//menu choices
		do {
		displayMenu();
		userInput = scnr.nextInt();
		if (scnr.hasNextInt())
			userInput = scnr.nextInt();
		else
			scnr.next();
		}while((userInput > 5 || userInput < 1) && userInput != 9);
				// check for integer input


			//initialize the world based on the user's choice    	


				//loop to print out world and prompt for next generation or Exit          
	} 	

	/**
	 * Create a new world
	 * @param numRows The number of rows to be in the created world
	 * @param numColumns  The number of columns to be in the created world
	 * @return A double dimension array of boolean that is numRows by 
	 * numColumns in size and initialized to all false values. 
	 */
	public static boolean[][] createNewWorld( int numRows, int numColumns) {

		// TODO: Implement this method		
		//create the world of the proper size
		boolean[][] world = new boolean[numRows][numColumns];
		

		return world;
	}

	/**
	 * Sets all the cells in the world to not alive (false).
	 * @param world 
	 */
	public static void clearWorld( boolean[][]world) {

		// TODO: Implement this method		

		for(int i = 0; i <= world.length i++)	{
			for (int e = 0; e <= world[i].length; e++)	{
				world[i][e] = false;
			}
		}
	}	

	/**
	 * Initializes the world to the Glider pattern.
	 * <pre>
	 * ..........
	 * .@........
	 * ..@@......
	 * .@@.......
	 * ..........
	 * ..........
	 * ..........
	 * ..........
	 * ..........
	 * ..........
	 * </pre>
	 * @param world  the existing double dimension array that will be 
	 * reinitialized to the Glider pattern. 
	 */
	public static void initializeGlider(boolean[][]world) {

		// TODO: Implement this method		

		//initialize to all false values


		//in the world set specific cells to true that are alive for the 
		//glider pattern

	}

	/**
	 * Initializes the world to the Beacon pattern.
	 * <pre>
	 * ..........
	 * .@@.......
	 * .@........
	 * ....@.....
	 * ...@@.....
	 * ..........
	 * ..........
	 * ..........
	 * ..........
	 * ..........
	 * </pre> 
	 * @param world the existing double dimension array that will be 
	 * reinitialized to the Beacon pattern.
	 */		
	public static void initializeBeacon(boolean[][] world) {

		// TODO: Implement this method				
		//initialize to all false values

		//in the world set the cells to true that are alive for the 
		// Beacon pattern.

	}

	/**
	 * Initializes the world to the Boat pattern.
	 * <pre>
	 * ..........
	 * .@@.......
	 * .@.@......
	 * ..@.......
	 * ..........
	 * ..........
	 * ..........
	 * ..........
	 * ..........
	 * ..........
	 * </pre> 
	 * @param world the existing double dimension array that will be 
	 * reinitialized to the Boat pattern.
	 */		
	public static void initializeBoat(boolean[][] world) {
		// TODO: Implement this method
		//initialize to all false values


		//in the world set the cells to true that are alive for the 
		// Boat pattern.		


	}	
	/**
	 * Initializes the world to the R-pentomino pattern.
	 * <pre>
	 * ..........
	 * ..@@......
	 * .@@.......
	 * ..@.......
	 * ..........
	 * ..........
	 * ..........
	 * ..........
	 * ..........
	 * ..........
	 * </pre> 
	 * @param world the existing double dimension array that will be 
	 * reinitialized to the R-pentomino pattern.
	 */		
	public static void initializeRpentomino(boolean[][] world) {
		// TODO: Implement this method
		//initialize to all false values


		//in the world set the cells to true that are alive for the 
		// R-pentomino pattern.		


	}	
	/**
	 * Initialize the GameOfLife world with a random selection of cells alive. 
	 * 
	 * @param world  the existing double dimension array that will be 
	 * reinitialized to a Random pattern.
	 */	
	public static void initializeRandomWorld(boolean[][] world){
		// TODO: Implement this method	    	

		//initialize to all false values

		//loop through every row

			//here we are within a row, so loop through every column

				//for the cell in the specific row and column, give it a 
				//true value 'Config.CHANCE_ALIVE' percent of the time.
				//(hint: if Config.CHANCE_ALIVE is 0.25, then there should be 
				// about a 25% chance this cell is alive.  
				// Recall that the nextDouble() method from the java.util.Random 
				// class returns a uniformly distributed double value between 
				// 0.0 and 1.0.)            	

				if( Config.RNG.nextDouble() < Config.CHANCE_ALIVE) {
					//set cell to be alive
 
				}


	}

	/** 
	 * Whether a cell is living in the next generation of the game.
	 * 
	 * The rules of the game are as follows:
	 * 1) Any live cell with fewer than two live neighbors dies, as if caused
	 *    by under-population.
	 * 2) Any live cell with two or three live neighbors lives on to the next 
	 *    generation.
	 * 3) Any live cell with more than three live neighbors dies, as if by 
	 *    overcrowding.
	 * 4) Any dead cell with exactly three live neighbors becomes a live cell, 
	 *    as if by reproduction.
	 * 
	 * @param numLivingNeighbors The number of neighbors that are currently
	 *        living.
	 * @param cellCurrentlyLiving Whether the cell is currently living.
	 * 
	 * @return True if this cell is living in the next generation.    
	 */
	public static boolean isCellLivingInNextGeneration( int numLivingNeighbors, 
			boolean cellCurrentlyLiving) {
		// TODO: Implement this method		
		return false;
	}


	/**
	 * Whether a specific neighbor is alive.
	 *
	 * Check whether the specific cell is alive or dead.
	 * 
	 * Note that cellRow and cellColumn may not be valid. If the cellRow is 
	 * less than 0 or greater than the number of rows -1 
	 * then the cell is outside the world. If the cellColumn is less than 0 
	 * or is greater than the number of columns -1 then 
	 * the cell is outside the world. Return false for any cell outside the 
	 * world.
	 * 
	 * @param world The current world.
	 * @param neighborCellRow The row of the cell which we are wanting to know
	 *  is alive.
	 * @param neighborCellColumn The column of the cell for which we are wanting
	 *  to know is alive.
	 * 
	 * @return Whether the cell is alive.
	 */	
	public static boolean isNeighborAlive(boolean [][]world, int neighborCellRow, 
			int neighborCellColumn) {

		// TODO: Implement this method    	
		//if valid row index

			//if valid column index
		
		return false;
	}

	/**
	 * Counts the number of neighbors that are currently living around the 
	 * specified cell.
	 *
	 * A cell has eight neighbors. The neighbors are the cells that are 
	 * horizontally, vertically and diagonally adjacent.
	 * 
	 * Note that if a specific cell is on the edge of the world then it may not 
	 * have neighboring cells.  For example: for the 0'th row (top row) of the 
	 * world there are not any rows above it.
	 * Assume all those cells are dead (have false values).
	 * 
	 * @param world The current world.
	 * @param cellRow The row of the cell for which we are looking for neighbors.
	 * @param cellColumn The column of the cell for which we are looking for 
	 * neighbors.
	 * 
	 * @return The number of neighbor cells that are currently living.
	 */
	public static int numNeighborsAlive(boolean[][] world, int cellRow, 
			int cellColumn) {
		// TODO: Implement this method		

		//neighbors in the row above

		//neighbors in the row below

		//neighbor to the left

		//neighbor to the right
		
		return -1;
	}

	/**
	 * Determines the next generation of the world.
	 * 
	 * @param currentWorld The world currently shown. 
	 * @param newWorld The new world to determine by looking at
	 * each cells neighbors in the current world. 
	 */
	public static void nextGeneration(boolean[][] currentWorld, boolean[][] newWorld) {
		// TODO: Implement this method		

		//for each row


			//for each column

				//determine the number of neighbors that are alive for the 
				//specific cell

				//determine whether the cell should be alive the next generation

	}

	/**
	 * Prints out the world showing each cell as alive or dead.
	 * 
	 * Loops through every cell of the world. If a cell is alive, print out
	 * the Config.ALIVE character, otherwise the Config.DEAD character. 
	 * 
	 * Tracks how many cells are alive and prints out the number of cells alive
	 * or that no cells are alive.
	 * 
	 * @param patternName The name of the pattern chosen by the user. 
	 * @param world The array representation of the current world. 
	 * @param generationNum The number of the current generation.  
	 */    
	public static void printWorld( String patternName, boolean[][] world, 
			int generationNum) {
		// TODO: Implement this method    	
		//declare and initialize local variables

		//print out pattern and generation

		//for each row in the world

			//for each column in the world

				//if the cell is alive

				//otherwise if the cell is dead.

		//print out the number of cells alive.
	}
	private static void displayMenu() {
		System.out.println("Select a pattern of life for the world");
		System.out.println("1 - Glider");
		System.out.println("2 - Beacon");
		System.out.println("3 - Boat");
		System.out.println("4 - R-pentomino");
		System.out.println("5 - Random");
		System.out.println("9 - Exit");
		System.out.print("Choice:");	
	}
}
