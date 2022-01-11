public class Owl extends Animal {

    private int wingSpan;

    public Owl(int weight, boolean hungry, int age, int wingSpan) {
        super(weight, hungry, age);
        
        setWingSpan(wingSpan);
    }

    private void setWingSpan(int wingSpan) {
        
        this.wingSpan = wingSpan;
    }

    @Override
    public String eat(Object food) {
        return null;
    }

    @Override
    public String toString(){
        return null;
    }
}
