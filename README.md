# holmies
mazeSolver project

## personnel
Camilla Cheng & Lisa Ye

## statement of problem
what is the boolean expression of the statement
  "it is possible to make a path from start to treasure"?

## recursive abstraction
When I'm asked to 
  if it is possible to find a path to the treasure,
the recursive abtraction can say
  if it is possible to find a path to the treasure from a point next to the start.

## Base case
-When explorer is on treasure
-When explorer is on a wall

## Pseudocode of algorithm
If (explorer is on treasure), 

return true

else 

for every spot next to location,
repeat the problem starting with that new spot


## Class(es), with fields and methods
### Maze
#### Fields
- int[][] mazeItself (how should the maze be stored?)

#### Methods
- public boolean isSolvable (?)
- public Maze
- 

### MazeSolver
#### Fields
- Maze m

#### Methods
- public MazeSolver (

## version *n*
- Find and return all of the solutions of the maze
- Find the shortest solution to the maze
- Pretty toString
