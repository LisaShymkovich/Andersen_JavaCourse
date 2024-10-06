package lesson_4;

public class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFull;

    public Cat(String name) {
        super(name, 200, 0);
        this.isFull = false;
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может бежать больше " + runLimit + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public static int getCatCount() {
        return catCount;
    }

    public boolean isFull() {
        return isFull;
    }

    public void eat(Plate plate, int foodAmount) {
        if (plate.getFood() >= foodAmount) {
            plate.decreaseFood(foodAmount);
            System.out.println(this.getName() + " покушал " + foodAmount + " еды.");
            this.isFull = true; // Если кот смог поесть, он становится сытым
        } else {
            System.out.println(this.getName() + " не смог поесть, в тарелке недостаточно еды.");
        }
    }
}
