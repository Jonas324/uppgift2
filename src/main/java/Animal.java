public abstract class Animal {

    private int weight;
    private boolean hungry;
    private int age;

    public Animal(int weight, boolean hungry, int age) {
        super();
        this.weight = weight;
        this.hungry = hungry;
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String eat(boolean hungry){
        if(hungry)
        return "Har ätit";
        else return "Har inte ätit";
    }

}
