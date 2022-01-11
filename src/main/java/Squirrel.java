public class Squirrel extends Animal {

    private int numOfConesInNest;

    public Squirrel(int weight, boolean hungry, int age, int numOfConesInNest) {
        super(weight, hungry, age);

        numOfConesInNest(numOfConesInNest);
    }

    private void numOfConesInNest(int numOfConesInNest) {

        this.numOfConesInNest = numOfConesInNest;
    }

}
