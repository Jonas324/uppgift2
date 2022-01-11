public class Squirrel extends Animal {

    private int numOfConesInNest;

    public Squirrel(int weight, boolean hungry, int age, int numOfConesInNest) {
        super(weight, hungry, age);

        numOfConesInNest(numOfConesInNest);
    }

    private void numOfConesInNest(int numOfConesInNest) {

        this.numOfConesInNest = numOfConesInNest;
    }

    @Override
    public String eat(Object food) {
        int i = (int) food;

        if (i > 0) {
            return "har ätit";
        }
        return "har inte ätit";
    }

    @Override
    public String toString() {
        return "weight: " + getWeight() + " age: " + getAge() + " cones: " + numOfConesInNest + "hungrig: " + eat(numOfConesInNest);
    }
}
