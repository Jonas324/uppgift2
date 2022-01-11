public class Owl extends Animal {

    private int wingSpan;

    public Owl(int weight, boolean hungry, int age, int wingSpan) {
        super(weight, hungry, age);
        
        setwingSpan(wingSpan);
    }

    private void setwingSpan(int wingSpan) {
        
        this.wingSpan = wingSpan;
    }
}
