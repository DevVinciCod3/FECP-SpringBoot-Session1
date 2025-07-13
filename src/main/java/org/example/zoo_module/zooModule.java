package org.example.zoo_module;

import org.example.zoo_module.zooHospital.zooHospital;
import org.example.zoo_module.zooshop.zooShop;

import java.util.Scanner;

public class zooModule {

    public void run(){
        Scanner s = new Scanner(System.in);
        boolean active = true;
        boolean firstTime = true;

        while (active){
            if (firstTime) {
                System.out.println("What would you like to do?");
                System.out.println("1. Visit Enclosure");
                System.out.println("2. Visit Shop");
                System.out.println("3. Visit Hospital");
                System.out.println("4. Leave Zoo");
                firstTime = false;
            } else {
                System.out.println("\nWhat would you like to do next?");
            }

            System.out.print("Choose an option: ");

            int option = s.nextInt();
            s.nextLine();

            switch (option){
                case 1 -> zooEnclosure.run(s);
                case 2 -> zooShop.run(s);
                case 3 -> zooHospital.run(s);
                case 4 -> {
                    System.out.println("Thank you, come again!");
                    active = false;
                    System.exit(0);
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }
}
