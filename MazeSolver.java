/**
  A class that solves a maze
  
 */

public class MazeSolver {
	
  public final static int directions[] = { Maze.EAST
										 , Maze.NORTH
										 , Maze.WEST
										 , Maze.SOUTH };
	
  
  public static boolean mazeSolver( Maze maze ) {
    
    System.out.println( maze + System.lineSeparator());
    
    // base case 0
    if (maze.explorerIsOnA() == Maze.TREASURE)
      return true;
    
    // base case 1
    if (maze.explorerIsOnA() == Maze.WALL )
      return false;
    
    // recursive case
    else {
      
      Maze snapshot = new Maze(maze);
      System.out.println("Snapshot taken:" + System.lineSeparator() + snapshot);
      
      for (int dir = 0; dir < 4; dir++) {
        maze.dropA( Maze.WALL );
        maze.go( directions[dir] );
        if ( mazeSolver( maze ) ) // if the recursive abstraction returns true
          return true;
        else
          System.out.println("Before restoration:" + System.lineSeparator() + maze);
          maze = snapshot;
          System.out.println("After restoration:" + System.lineSeparator() + maze);
      } // end of for loop
      return false;
    }
    
  }
  
}
