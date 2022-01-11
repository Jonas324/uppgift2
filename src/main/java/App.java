import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int treeAge = (int) (Math.random()*99) + 1;
        int numOfCones = (int) (Math.random()*99);

        System.out.println("Hur många ekorrar? ");
        int amountSquirrels = scan.nextInt();

        for (int i = 0; i < amountSquirrels ; i++){

            Squirrel sqr = new Squirrel((int) (Math.random()*10));
        }

        PineTree tree = new PineTree(treeAge, numOfCones);
        tree.getSquirrel();
    }
}
