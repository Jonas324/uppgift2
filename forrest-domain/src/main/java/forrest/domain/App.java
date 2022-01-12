package forrest.domain;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Squirrel> squirrels = new ArrayList<>();

        Random snow = new Random();
        int wind = (int) (Math.random() * 40);
        int treeAge = (int) (Math.random() * 99) + 1;
        int numOfCones = (int) (Math.random() * 99);

        System.out.println("Hur många ekorrar? ");
        int amountSquirrels = scan.nextInt();

        for (int i = 0; i < amountSquirrels; i++) {

            Squirrel sqr = new Squirrel(weight(), hungry(), age(), numOfConesInNest());
            squirrels.add(sqr);
        }
        Owl owl = new Owl(weight(), hungry(), age(), wingSpan(), amountSquirrels);

        PineTree tree = new PineTree(treeAge, numOfCones, squirrels, owl);

        System.out.println(squirrels);

        System.out.println(owl);

        System.out.println(tree.fall(snow.nextBoolean(), treeAge,wind));
    }

    private static int wingSpan() {
        int wingSpan = (int) (Math.random()*20) + 10;

        return wingSpan;
    }

    private static int age() {
        int age = (int) (Math.random()*30) + 1;

        return age;
    }

    private static boolean hungry() {
        Random rd = new Random();
        boolean hungry = rd.nextBoolean();

        return hungry;
    }

    private static int weight() {
        int weight = (int) (Math.random()*40);
        return weight;
    }

    private static int numOfConesInNest() {
        int numOfConesInNest = (int) (Math.random()*10);

        return numOfConesInNest;
    }
}
