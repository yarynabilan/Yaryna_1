package Homework6;

import java.util.ArrayList;
import java.util.List;

class Products {
    private String name;
    private String color;
    private double price;

    public Products(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Products> products = createProductList();

        System.out.println("All products");
        products.stream()
                .forEach(product -> System.out.println(product.getName()));

        String targetColor = "Red";
        System.out.println("Products with color " + targetColor + ":");
        products.stream()
                .filter(product -> product.getColor().equalsIgnoreCase(targetColor))
                .forEach(product -> System.out.println(product.getName()));

        double targetPrice = 100.0;
        System.out.println("Products with price higher than " + targetPrice + " uah:");
        products.stream()
                .filter(product -> product.getPrice() > targetPrice)
                .forEach(product -> System.out.println(product.getName()));
    }

    public static List<Products> createProductList() {
        List<Products> products = new ArrayList<>();
        products.add(new Products("Apple", "Red", 15.00));
        products.add(new Products("Blueberry", "Blue", 150.00));
        products.add(new Products("lime", "Green", 80.50));
        products.add(new Products("Strawberry", "Red", 120.80));
        products.add(new Products("Lemon", "Yellow", 100.00));
        return products;
    }
}

