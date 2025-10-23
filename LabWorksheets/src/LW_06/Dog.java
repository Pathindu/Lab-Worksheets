package LW_06;

public class Dog extends pet {

    double weight;
    public Dog(String name) {
        super.setName(name);
    }

    public String speak() {
        return "";
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
