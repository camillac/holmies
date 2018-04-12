/**
  A class that solves a maze
  
 */

public class MazeSolver {
  
  public static boolean mazeSolver( Maze maze ) {
    
    // base case 0
    if (maze.explorerIsOnA() == Maze.TREASURE)
      return true;
    
    // base case 1
    if (maze.explorerIsOnA() == Maze.WALL )
      return false;
    
    // recursive case
    else {
      
      Maze snapshot = new Maze(maze);
      
      for (int dir = 0; dir < 4; dir++) {
        maze.dropA( Maze.WALL );
        Maze.go( (int) Math.pow(2, dir) );
        if ( mazeSolver( maze ) ) // if the recursive abstraction returns true
          return true;
        else
          maze = snapshot;
      } // end of for loop
      return false;
    }
    
  }
  
}
