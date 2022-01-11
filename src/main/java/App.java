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

        int weight = 30;
        boolean hungry = false;
        int age = 0;

        for (int i = 0; i < amountSquirrels; i++) {

            int numOfConesInNest = 5;

            Squirrel sqr = new Squirrel(weight, hungry, age, numOfConesInNest);
            squirrels.add(sqr);
        }
        int wingSpan = 40;
        Owl owl = new Owl(weight, hungry, age, wingSpan, amountSquirrels);

        PineTree tree = new PineTree(treeAge, numOfCones, squirrels, owl);

        System.out.println(squirrels);

        System.out.println(owl);

        System.out.println(tree.fall(snow.nextBoolean(), treeAge,wind));
    }
}
