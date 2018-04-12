/**
  A class that solves a maze
  
 */

public class MazeSolver {
  
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
      
      for (int dir = 0; dir < 4; dir++) {
        maze.dropA( Maze.WALL );
        maze.go( (int) Math.pow(2, dir) );
        if ( mazeSolver( maze ) ) // if the recursive abstraction returns true
          return true;
        else
          maze = snapshot;
          System.out.println(maze);
      } // end of for loop
      return false;
    }
    
  }
  
}
