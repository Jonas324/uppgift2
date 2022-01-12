package forrest.domain;

public class Owl extends Animal {

    private int wingSpan;
    private int setAmountSquirrels;


    public Owl(int weight, boolean hungry, int age, int wingSpan, int amountSquirrels) {
        super(weight, hungry, age);
        
        setWingSpan(wingSpan);
        setAmountSquirrels(amountSquirrels);
    }

    private void setAmountSquirrels(int amountSquirrels) {

        this.setAmountSquirrels = amountSquirrels;
    }

    private void setWingSpan(int wingSpan) {
        
        this.wingSpan = wingSpan;
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
    public String toString(){

        return "Owl" + "weight: " + getWeight() + " age: " + getAge() + " wing span: " + wingSpan + "hungrig: " + eat(setAmountSquirrels);

    }
}
