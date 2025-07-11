package org.example.zoo_module.zooshop;

public class product {
    private final String name;
    private final int price;

    public product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }

    public int getPrice() { return price; }

    public int getTotalPrice(int quantity) {
        return price * quantity;
    }
}
