package lesson11;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public boolean inBox(T fruit) {
        return fruits.add(fruit);
    }

    public void clear() {
        fruits.clear();
    }

    public float getWeight() {
        if (fruits.size() == 0){
            return 0;
        }
        float weight = 0;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void transfer(Box<? super T> box) {
        box.fruits.addAll(this.fruits);
        clear();
    }
}

