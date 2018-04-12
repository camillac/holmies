/**
  A class that solves a maze
  
 */

public class MazeSolver {
  
  public boolean mSolver( Maze maze ) {
    if (maze.explorerIsOnA() == maze.TREASURE)
      return true;
    if (maze.explorerIsOnA() == maze.WALL )
      return false;
    else {
      
      Maze snapshot = new Maze(maze);
      
      for (int dir = 0; dir < 4; dir++) {
        maze.dropA( maze.WALL );
        go( Math.pow(2, dir) );
        if ( mSolver(maze) )
          return true;
        else
          maze = snapshot;
      }
      return false;
    }
  }
  
  private static void snapShot( Maze candidate ) {
    
    Maze snapshot;
    snapshot = new Maze(candidate);
    
  }
