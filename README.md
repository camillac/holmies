# holmies
mazeSolver project

### personnel
Camilla Cheng & Lisa Ye

---
# Maze Solver
## Statement of problem
What is the boolean value of the statement
  "it is possible to make a path from explorer's current position to treasure"?

## Recursive abstraction
<pre>
When I'm asked
    if it is possible to find a path to the treasure,
the recursive abtraction can say
    if it is possible to find a path to the treasure from a point next to the the explorer's current location
</pre>

## Base case
- When explorer is on treasure, return true
- When explorer is on a wall, return false

## Pseudocode of algorithm
    if (explorer is on treasure)
        return true;
    if (explorer is on wall)
        return false;
    else {
        take a snapshot of maze; // saves image of maze before the explorer moves to a new spot
        for ( each spot in all four directions [N,E,S,W] next to the current position ) {
            drop a wall on current location;
            move explorer to the new spot (in the direction mentioned in the for loop);
            if ( [RECURSIVE ABSTRACTION: repeat the problem starting with that new spot] ) {
                return true;
            }
            else {
                set current maze to snapshot; // reset the image of the maze to before the explorer moved
            }
        }
        return false;
    }

---

## Class(es), with fields and methods
### Maze
#### Fields
- int[][] maze
- representation of treasure
- representation of wall
- representation of stepping stone
- rep of directions [N,E,S,W]

#### Methods
- public Maze
- public go(direction)
- public explorerIsOnA(location)
- public toString

### UserOfMaze
#### Fields
- Maze m

#### Methods
- public static void main(String[] args)

---

## Known Bugs/Issues
- nullPointer error when testing on big maze(1 rank, 3 files)
- Snapshot is being replaced on every recursive call
- Need to change parameter in for loop

## Version *n*
- Find and return all of the solutions of the maze
- Find the shortest solution to the maze
- Build a nice visual of the maze
