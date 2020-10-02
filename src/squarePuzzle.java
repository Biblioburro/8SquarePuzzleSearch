
public class squarePuzzle {
	//constructors
	public  squarePuzzle() {
		
	}
	public squarePuzzle(int s) {
		size = s;
		puzzle = new int[size][size];
			
	}
	
	//Functions to solves the puzzle 
	
	
	//function to assign random values to the puzzle
	public void randomizePuzzle() {
		
	}
	//solved using the Uniform Cost search
	public void solveUsingUCS() {
		
	}
	//solved using Best First Search
	public void solveUsingBFS() {
		
	}
	//solved using the A* algorithm
	public void solveUsingA(){
		
	}
	//function used to print to the console for 
	//debugging purposes
	public void printPuzzle () {
		for(int x =0;x<puzzle.length;x++) {
			for(int y = 0;y<puzzle[x].length;y++ ) {
				System.out.print(puzzle[x][y]+" ");
			}
			System.out.println();
		}
	}
	public int[][] getState(){
		return puzzle;
	}
	//Function for accessing values of the array
	public int valueAt(int x , int y) {
		return puzzle[x][y];
		
	}
	//Function to check whether or not we are at the 
	//goal state
	public boolean checkSolutions() {
		boolean isCorrect = true;
		for(int x = 0;x<puzzle.length;x++) {
			for(int y = 0;y<puzzle[x].length;y++) {
				if(puzzle[x][y]!= goalState[x][y]) {
					isCorrect = false;
				}
			}
		}
		return isCorrect;
	}
	
	//declaring variables for storing the function
	private int size = 3;
	private int[][] goalState = {{1,2,3},{8,0,4},{7,6,5}};
	private int[][] puzzle = new int[size][size];
}
