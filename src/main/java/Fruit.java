public abstract class Fruit {
    private float weight;

    public Fruit(double weight) {
        this.weight = (float) weight;
    }

    public Fruit() {

    }

    float getWeight() {
        return weight;
    }
}
