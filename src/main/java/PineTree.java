import java.util.HashMap;

public class PineTree {

    private HashMap<Squirrel, String> squirrels;
    private int numOfCones;
    private int treeAge;

    public PineTree(int treeAge, int numOfCones) {
        super();

        treeAge(treeAge);
        numOfCones(numOfCones);
        squirrels(squirrels);
    }

    private void squirrels(HashMap<Squirrel, String> squirrels) {

        this.squirrels = squirrels;
    }

    private void numOfCones(int numOfCones) {

        this.numOfCones = numOfCones;
    }

    private void treeAge(int treeAge) {

        this.treeAge = treeAge;
    }

    public void getSquirrel() {



        return squirrels;
    }
}
