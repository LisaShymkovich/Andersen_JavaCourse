package lesson_4;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Бобик");
        Cat cat = new Cat("Мурка");

        dog.run(400);
        dog.swim(5);

        cat.run(150);
        cat.swim(1);

        System.out.println("Количество собак: " + Dog.getDogCount());
        System.out.println("Количество котов: " + Cat.getCatCount());


        Cat[] cats = {
                new Cat("Барсик"),
                new Cat("Мурзик"),
                new Cat("Том")
        };

        Plate plate = new Plate(30);
        System.out.println("Еды в тарелке: " + plate.getFood());

        for (Cat newcat : cats) {
            newcat.eat(plate, 12);
        }

        System.out.println("Оставшаяся еда: " + plate.getFood());

        for (Cat newcat : cats) {
            System.out.println(newcat.getName() + " сыт: " + newcat.isFull());
        }

        plate.addFood(20);
        System.out.println("Еды в тарелке: " + plate.getFood());

        for (Cat newcat : cats) {
            if (!newcat.isFull()) {
                newcat.eat(plate, 10);
            }
        }

        System.out.println("Оставшаяся еда: " + plate.getFood());


        Payment payment = new Payment();
        payment.addProduct("Ноутбук", 50000);
        payment.addProduct("Смартфон", 20000);
        payment.printReceipt();


        Park park = new Park();
        park.addAttraction("Колесо обозрения", "10:00-18:00", 150);
        park.addAttraction("Американские горки", "12:00-20:00", 300);
        park.printAttractions();
    }

}