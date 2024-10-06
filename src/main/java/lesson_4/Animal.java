package lesson_4;

public abstract class Animal implements Runnable, Swimmable {
    protected String name;
    protected int runLimit;
    protected int swimLimit;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }

    public String getName() {
        return name;
    }
}
