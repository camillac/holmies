/**
  Test MazeSolver class.

  Recycled from UserOfMaze:

  Requires command line arguments:
  o  the name of a file containing a maze.
  o  the rank and file where an explorer is starting

  For example,
      java UserOfMazeSolver mazes/4cell_treasureWest.txt -1 -1  # no explorer
 */

public class UserOfMazeSolver {
  
  public static void main (String[] commandLine) {
    try {
      Maze testMaze0 = new Maze( commandLine[0]
                               , Integer.parseInt( commandLine[1])
                               , Integer.parseInt( commandLine[2])
                               );
    } catch (java.io.FileNotFoundException unusedID ) {
    
        Maze testMaze0 = new Maze( commandLine[0]
                                 , Integer.parseInt( commandLine[1])
                                 , Integer.parseInt( commandLine[2])
                                 );
      System.out.println("Maze File Not Found: Will Use Default Maze: "
                         + System.lineSeparator());
    }
      System.out.println(MazeSolver.mazeSolver( testMaze0 ));
  }
}
  
// not sure if we need any more methods that were used in UserOfMaze since they were all test methods
