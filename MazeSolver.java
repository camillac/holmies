/**
  A class that solves a maze
  
 */

public class MazeSolver {
	
  public final static int directions[] = { Maze.EAST
										 , Maze.NORTH
										 , Maze.WEST
                     , Maze.SOUTH };
                     
  private static int steps;
  
  public static boolean mazeSolver( Maze maze ) {
    
    System.out.println("Explorer has moved:" 
                        + System.lineSeparator() 
                        + maze 
                        + "Steps taken:" 
                        + steps++);
    
    // base case 0: on treasure
    if (maze.explorerIsOnA() == Maze.TREASURE)
      return true;
    
    // base case 1: on a wall
    if (maze.explorerIsOnA() == Maze.WALL )
      return false;
    
    // recursive case
    else {
      //takes a snapshot
      Maze snapshot = new Maze(maze);
      for (int dir = 0; dir < 4; dir++) {
                // debug("Snapshot taken:", snapshot);
        //drops a wall in current position
        maze.dropA( Maze.WALL );
        //moves toward a direction
        maze.go( directions[dir] );
        if ( mazeSolver( maze ) ) // if the recursive abstraction returns true
          return true; 
        else 
                // debug("Before restoration:" + dir, maze);
          //restores the maze to snapshot
          maze = new Maze(snapshot);
                // debug("After restoration:" + dir, maze);
      } // end of for loop
      return false;
    }
    
  }
  
  public static void debug(String s, Maze m) {
	  System.out.println(s + System.lineSeparator() + m);
  }
  
}
