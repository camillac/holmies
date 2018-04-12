/**
  A class that solves a maze
  
 */

public class MazeSolver {
  
  public boolean mSolver( Maze maze ) {
    
    // base case 0
    if (maze.explorerIsOnA() == maze.TREASURE)
      return true;
    
    // base case 1
    if (maze.explorerIsOnA() == maze.WALL )
      return false;
    
    // recursive case
    else {
      
      Maze snapshot = new Maze(maze);
      
      for (int dir = 0; dir < 4; dir++) {
        maze.dropA( maze.WALL );
        go( Math.pow(2, dir) );
        if ( mSolver(maze) ) // if the recursive abstraction returns true
          return true;
        else
          maze = snapshot;
      } // end of for loop
      return false;
    }
    
  }
  
}
