import java.util.ArrayList;

public class PineTree {

    private ArrayList<Squirrel> squirrels;
    private int numOfCones;
    private int treeAge;

    public PineTree(int treeAge, int numOfCones, ArrayList<Squirrel> squirrels) {

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

    public void getSquirrel() {

    }
}
