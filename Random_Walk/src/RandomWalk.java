import java.util.Random;

public class RandomWalk {
    private int x, y;  // Current position (x, y)
    private int maxSteps;  // Maximum number of steps
    private int stepsTaken;  // Steps taken so far
    private int boundary;  // Boundary of the walk area

    // Constructor with boundary and max steps, starting at (0, 0)
    public RandomWalk(int max, int edge) {
        maxSteps = max;
        boundary = edge;
        x = 0;
        y = 0;
        stepsTaken = 0;
    }

    // Constructor with boundary, max steps, and custom starting position
    public RandomWalk(int max, int edge, int startX, int startY) {
        maxSteps = max;
        boundary = edge;
        x = startX;
        y = startY;
        stepsTaken = 0;
    }

    // Method to take a single random step
    public void takeStep() {
        Random rand = new Random();
        int direction = rand.nextInt(4); // Generate a random number from 0 to 3

        switch (direction) {
            case 0: x++; break; // Move right
            case 1: x--; break; // Move left
            case 2: y++; break; // Move up
            case 3: y--; break; // Move down
        }
        stepsTaken++;
    }

    // Method to check if more steps can be taken
    public boolean moreSteps() {
        return stepsTaken < maxSteps;
    }

    // Method to check if the current position is within the boundary
    public boolean inBounds() {
        return x >= -boundary && x <= boundary && y >= -boundary && y <= boundary;
    }

    // Simulates the entire walk
    public void walk() {
        while (moreSteps() && inBounds()) {
            takeStep();
        }
    }

    // Getters for x and y coordinates
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // toString method to display the current position and steps taken
    public String toString() {
        return "Steps: " + stepsTaken + "; Position: (" + x + "," + y + ")";
    }
}