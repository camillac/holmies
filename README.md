# holmies
mazeSolver project

## personnel
Camilla Cheng & Lisa Ye

## statement of problem
what is the boolean value of the statement
  "it is possible to make a path from explorer's current position to treasure"?

## recursive abstraction
When I'm asked

  if it is possible to find a path to the treasure,
  
the recursive abtraction can say

  if it is possible to find a path to the treasure from a point next to the the explorer's current location

## Base case
- When explorer is on treasure, return true
- When explorer is on a wall, return false

## Pseudocode of algorithm
    if (explorer is on treasure), 
        return true
    if (explorer is on wall),
        return false
    else {
        for every spot next to location {
            drop a wall on current location
            move explorer to the new spot
            if ([RECURSIVE ABSTRACTION: repeat the problem starting with that new spot] returns false) {
                //do nothing??
            }
            else {
                return true;
            }
        }
        return false
    }


## Class(es), with fields and methods
### Maze
#### Fields
- int[][] maze
- representation of treasure
- representation of wall
- representation of stepping stone
- rep of directions

#### Methods
- public boolean isSolvable (?)
- public Maze
- 

### MazeSolver
#### Fields
- Maze m

#### Methods
- public MazeSolver 


## version *n*
- Find and return all of the solutions of the maze
- Find the shortest solution to the maze
- Pretty toString
