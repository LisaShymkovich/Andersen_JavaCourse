package lesson_4;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private List<Attraction> attractionList;

    public Park() {
        attractionList = new ArrayList<>();
    }


    public void addAttraction(String name, String workingHours, double price) {
        Attraction attraction = new Attraction(name, workingHours, price);
        attractionList.add(attraction);
    }


    public void printAttractions() {
        System.out.println("Информация об аттракционах:");
        for (Attraction attraction : attractionList) {
            System.out.println(attraction.getName() + ": Часы работы - " + attraction.getWorkingHours() +
                    ", Стоимость - " + attraction.getPrice() + " руб.");
        }
    }


    public class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public String getWorkingHours() {
            return workingHours;
        }

        public double getPrice() {
            return price;
        }
    }
}
