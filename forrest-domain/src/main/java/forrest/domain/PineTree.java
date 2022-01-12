package forrest.domain;

import java.util.ArrayList;

public class PineTree {

    private ArrayList<Squirrel> squirrels;
    private int numOfCones;
    private int treeAge;
    private Owl owl;

    public PineTree(int treeAge, int numOfCones, ArrayList<Squirrel> squirrels, Owl owl) {

        treeAge(treeAge);
        numOfCones(numOfCones);
        squirrels(this.squirrels);
    }

    private void squirrels(ArrayList<Squirrel> squirrels) {

        this.squirrels = squirrels;
    }

    private void numOfCones(int numOfCones) {

        this.numOfCones = numOfCones;
    }

    private void treeAge(int treeAge) {

        this.treeAge = treeAge;
    }



    public String fall(boolean snow, int age, int wind) {

        int fall = 0;

        if (snow = true) {
            fall = 40 + age + wind;
        }else {
            fall = age + wind;
        }

        if (fall >= 50){
            return "Trädet har fallit";
        }
        else {
            return "Trädet står kvar";
        }
    }

}
