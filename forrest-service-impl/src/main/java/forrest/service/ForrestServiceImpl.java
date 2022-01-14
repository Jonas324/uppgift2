package forrest.service;

import forrest.domain.Owl;
import forrest.domain.PineTree;
import forrest.domain.Squirrel;

import java.util.ArrayList;
import java.util.Scanner;

public class ForrestServiceImpl implements ForrestService {

    Scanner scan = new Scanner(System.in);
    private String input = null;

    public void run() {
        while (true){

            input = scan.nextLine();

            if(input.equalsIgnoreCase("exit") ){
                System.exit(0);
            }
        }
    }

    @Override
    public Owl createOwl(int weight, boolean hungry, int age, int wingSpan, int amountSquirrels){

        Owl owl = new Owl(weight, hungry, age, wingSpan, amountSquirrels);

        return owl;
    }

    @Override
    public Squirrel createSquirrel(int weight, boolean hungry, int age, int numOfConesInNest){

        Squirrel squirrel = new Squirrel(weight, hungry, age, numOfConesInNest);

        return squirrel;
    }

    @Override
    public PineTree createPineTree(int treeAge, int numOfCones, ArrayList<Squirrel> squirrels, Owl owl){

        PineTree pineTree = new PineTree(treeAge, numOfCones, squirrels, owl);

        return pineTree;
    }
}
