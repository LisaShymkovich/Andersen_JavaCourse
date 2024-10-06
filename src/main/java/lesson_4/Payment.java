package lesson_4;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private List<Product> productList;

    public Payment() {
        productList = new ArrayList<>();
    }


    public void addProduct(String name, double price) {
        Product product = new Product(name, price);
        productList.add(product);
    }

    public void printReceipt() {
        double total = 0;
        System.out.println("Список товаров:");
        for (Product product : productList) {
            System.out.println(product.getName() + " - " + product.getPrice() + " руб.");
            total += product.getPrice();
        }
        System.out.println("Общая сумма: " + total + " руб.");
    }

    public class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }
}
