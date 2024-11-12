import java.util.Scanner;

public class DrunkenWalk {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the boundary for the platform: ");
        int boundary = scan.nextInt();
        System.out.print("Enter the maximum number of steps: ");
        int maxSteps = scan.nextInt();
        System.out.print("Enter the number of drunks to simulate: ");
        int numDrunks = scan.nextInt();

        int falls = 0;  // Counter for how many times a drunk falls off the platform

        // Simulate the walk for each drunk
        for (int i = 0; i < numDrunks; i++) {
            RandomWalk drunk = new RandomWalk(maxSteps, boundary);
            drunk.walk();

            // Check if the drunk went out of bounds
            if (!drunk.inBounds()) {
                falls++;
            }
        }

        // Output the result
        System.out.println("The drunk fell off the platform " + falls + " times.");
    }
}