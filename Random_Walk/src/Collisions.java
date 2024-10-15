public class Collisions {

    public static void main(String[] args) {
        RandomWalk rw = new RandomWalk(100000, 2000000, -3, 0);
        RandomWalk rw2 = new RandomWalk(100000, 2000000, 3, 0);
        int collisions = 0;

        while (rw.moreSteps() && rw2.moreSteps()) {
            rw.takeStep();
            rw2.takeStep();
            if (rw.getX() == rw2.getX() && rw.getY() == rw2.getY()) {
                System.out.println("Collided at " + rw.getX() + ", " + rw.getY());

                collisions++;
            }
            // end if
        }// end while
        System.out.println(collisions + " collisions");
    }// end main
}// end class
