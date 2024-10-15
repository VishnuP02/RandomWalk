public class Main {

    public static void main(String[] args) {
    RandomWalk rw = new RandomWalk(100, 100, 50, 50);
        RandomWalk rw2 = new RandomWalk(100, 10);
        /* System.out.println(rw);
        System.out.println(rw2);*/

        /* // take 5 steps
        for (int i = 0; i < 5; i++) {
            rw.takeStep();
            rw2.takeStep();
            System.out.println(rw + " ");
            System.out.println(rw2);
        }*/

            rw.walk();
            System.out.println(rw2);
    }
}