import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {
    private List<T> fruitList;


    private double totalWeight;
    private Object Box;

    public Box() {
        this.fruitList = new ArrayList<>();
    }

    public void addFruit(Apple fruit) {
        fruitList.add((T) fruit);

        totalWeight = totalWeight + fruit.getWeight();
    }

    public void addFruit(Orange fruit) {
        fruitList.add((T) fruit);

        totalWeight = totalWeight + fruit.getWeight();
    }

    public float getTotalWeight() {
        return (float) this.totalWeight;
    }
    public boolean compare(Box anotherBox) {
        return Box==anotherBox;
    }

    private void getWeight() {
    }
}

