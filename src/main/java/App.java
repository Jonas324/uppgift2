import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

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
        }

        int wingSpan = 40;
        Owl owl = new Owl(weight, hungry, age, wingSpan);

        PineTree tree = new PineTree(treeAge, numOfCones);
        tree.getSquirrel();
    }
}
