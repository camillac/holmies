public class UserOfMazeSolver {
  private static Displayer displayer;
  
  public static void main (String[] args) {
    Maze testMaze0 = new Maze( commandLine[0],
                             , Integer.parseInt( commandLine[1])
                             , Integer.parseInt( commandLine[2])
                             );
    System.out.println( MazeSolver.mSolver( testMaze0 ) );
  }
  
// not sure if we need any more methods that were used in UserOfMaze since they were all test methods
