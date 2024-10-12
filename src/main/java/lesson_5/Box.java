package lesson_5;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> boxOfFruits = new ArrayList<>();

    public void addFruit(T fruit) {
        boxOfFruits.add(fruit);
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : boxOfFruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box <?> otherBox){
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.0001;
    }

    public void transferFruits(Box<? super T> otherBox) {
        if (this == otherBox) {
            throw new IllegalArgumentException("Нельзя пересыпать фрукты в ту же самую коробку");
        }
        otherBox.boxOfFruits.addAll(this.boxOfFruits);
        this.boxOfFruits.clear();
    }

    public int getFruitCount(){
        return boxOfFruits.size();
    }
}
