/**
  A class that solves a maze
  
 */

public class MazeSolver {
	
  public final static int directions[] = { Maze.EAST
										 , Maze.NORTH
										 , Maze.WEST
										 , Maze.SOUTH };
  
  public static boolean mazeSolver( Maze maze ) {
    
    System.out.println("Explorer has moved:" + System.lineSeparator() + maze );
    
    // base case 0
    if (maze.explorerIsOnA() == Maze.TREASURE)
      return true;
    
    // base case 1
    if (maze.explorerIsOnA() == Maze.WALL )
      return false;
    
    // recursive case
    else {
      
      
      for (int dir = 0; dir < 4; dir++) {
		Maze snapshot = new Maze(maze);
		debug("Snapshot taken:", snapshot);
        maze.dropA( Maze.WALL );
        maze.go( directions[dir] );
        if ( mazeSolver( maze ) ) // if the recursive abstraction returns true
          return true;
        else
          debug("Before restoration:" + dir, maze);
          maze = snapshot;
          debug("After restoration:" + dir, maze);
      } // end of for loop
      return false;
    }
    
  }
  
  public static void debug(String s, Maze m) {
	  System.out.println(s + System.lineSeparator() + m);
  }
  
}
