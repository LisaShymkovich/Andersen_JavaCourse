package lesson_5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание1");
        String[] array = {"A", "B", "C", "D"};
        System.out.println("Before swap: " + java.util.Arrays.toString(array));
        Task1.arraySwapper(array, 1, 3);
        System.out.println("After swap: " + java.util.Arrays.toString(array));

        System.out.println("Задание2");

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight());
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight());

        System.out.println("Сравнение коробок: " + appleBox.compare(orangeBox));

        Box<Apple> anotherAppleBox = new Box<>();
        appleBox.transferFruits(anotherAppleBox);
        System.out.println("Количество яблок в новой коробке: " + anotherAppleBox.getFruitCount());
        System.out.println("Количество яблок в старой коробке: " + appleBox.getFruitCount());

    }
}