package org.example;

import org.example.animals.*;
import org.example.animals.types.bird.Parrot;
import org.example.animals.types.feline.Lion;
import org.example.animals.types.pachyderm.Elephant;

import java.time.LocalDateTime;
import java.util.*;

public class Handler_Module {
    private static final List<Animal> pachyderms = List.of(
            new Elephant("Dumbo"),
            new Elephant("Horton")
    );
    private static final List<Animal> felines = List.of(
            new Lion("Mufasa"),
            new Lion("Simba")
    );
    private static final List<Animal> birds = List.of(
            new Parrot("Polly"),
            new Parrot("Zazu")
    );

    public static void accessModule(Scanner sc, Zoo_Staff zooStaff) {
        System.out.print("Enter your name (Handler): ");
        String handlerName = sc.nextLine();

        List<Animal> assignedAnimals = null;

        if (handlerName.equals(zooStaff.getPachydermHandler())) {
            assignedAnimals = pachyderms;
        } else if (handlerName.equals(zooStaff.getFelineHandler())) {
            assignedAnimals = felines;
        } else if (handlerName.equals(zooStaff.getBirdHandler())) {
            assignedAnimals = birds;
        } else {
            System.out.println("Unauthorized handler name.");
            return;
        }

        System.out.println("Welcome, Handler " + handlerName + "!");

        while (true) {
            System.out.println("=== Animal Duty Menu ===");
            System.out.println("Animals assigned to you:");
            for (int i = 0; i < assignedAnimals.size(); i++) {
                System.out.printf("%d. %s (%s)\n", i + 1, assignedAnimals.get(i).getName(), assignedAnimals.get(i).getLocation());
            }
            System.out.println("0. Exit");
            System.out.print("Choose animal number to interact with: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 0) break;

            if (choice < 1 || choice > assignedAnimals.size()) {
                System.out.println("Invalid choice.");
                continue;
            }

            Animal selected = assignedAnimals.get(choice - 1);
            System.out.println("Choose action:");
            System.out.println("1. Feed " + selected.getName());
            System.out.println("2. Exercise " + selected.getName());
            System.out.println("3. Examine " + selected.getName() + " to Vet");
            System.out.print("Choose an option: ");
            int action = sc.nextInt();
            sc.nextLine();

            switch (action) {
                case 1 -> selected.eat();
                case 2 -> selected.roam();
                case 3 -> {
                    selected.sendToHospital();
                    System.out.println(selected.getName() + " admitted at " + LocalDateTime.now());
                }
                default -> System.out.println("Invalid action.");
            }
        }

        System.out.println("Finished duties for the day.");
    }
}
