package org.example.zoo_module.zooshop;

import org.example.zoo_module.zooshop.product;

import java.util.*;

public class zooShop {

    private static final List<product> products = List.of(
            new product("Soft Drink", 30),
            new product("Popcorn", 50),
            new product("Plush Toy", 120),
            new product("Key Chain", 45)
    );

    public static void run(Scanner s) {
        System.out.println("=== Zoo Shop ===");
        System.out.println("\nAvailable Products:");

        int count = 1;
        for (product p : products) {
            System.out.printf("%d. %s - $%d%n", count++, p.getName(), p.getPrice());
        }

        System.out.print("Enter the number of the product you want to buy: ");
        int option = s.nextInt();
        s.nextLine();

        if (option < 1 || option > products.size()) {
            System.out.println("Invalid product option.");
            return;
        }

        System.out.print("Quantity: ");
        int quantity = s.nextInt();
        s.nextLine();

        product selected = products.get(option - 1);
        int total = selected.getTotalPrice(quantity);

        System.out.println("You bought " + quantity + " " + selected.getName() + "(s).");
        System.out.println("Total: $" + total);



        System.out.print("Proceed to checkout? (yes/no): ");
        String checkout = s.nextLine().trim();

        while (!checkout.equalsIgnoreCase("yes")) {
            if (checkout.equalsIgnoreCase("no")) {
                System.out.print("Okay, let me ask again.\nProceed to checkout? (yes/no): ");
                checkout = s.nextLine().trim();
            } else {
                System.out.print("Invalid input. Please type yes or no: ");
                checkout = s.nextLine().trim();
            }
        }

        System.out.println("Payment Successful");
        System.out.println("Receipt:");
        System.out.println("- " + selected.getName() + " - $" + selected.getPrice());
        System.out.println("--- " + "Quantity: " + quantity);
        System.out.println("--- " + "Total Paid: $" + total);

    }
}
