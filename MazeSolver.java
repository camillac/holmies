public class MazeSolver {
  
  public boolean mSolver( Maze maze ) {
    if (maze.explorerIsOnA() == maze.TREASURE)
      return true;
    if (maze.explorerIsOnA() == maze.WALL )
      return false;
    else {
      snapShot; // do we print out the snapshot? or print it out later
      for (int dir = 0; dir < 4; dir++) {
        maze.dropA( maze.WALL );
        go( Math.pow(2, dir) );
        if ( mSolver(maze) )
          return true;
        else
          // set current maze to snapshot; ? Not sure how or what to do
      }
      return false
    }
  }
  
  private static void snapShot( Maze candidate ) {
    
    Maze snapshot;
    snapshot = new Maze(candidate);
    
  }
