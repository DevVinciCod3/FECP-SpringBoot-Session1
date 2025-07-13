package org.example.zoo_module;

import org.example.animals.Animal;
import org.example.animals.types.feline.*;
import org.example.animals.types.pachyderm.*;
import org.example.animals.types.bird.*;

import java.util.Scanner;

public class zooEnclosure {

    public static void run(Scanner s) {

        System.out.println("=== Zoo Enclosure ===\n");

        System.out.println("1. Pachyderm (rhino, elephant, hippo)");
        System.out.println("2. Feline (tiger, lion, cheetah)");
        System.out.println("3. Bird (parrot, falcon, owl)");
        System.out.print("Choose Enclosure: ");
        int option = s.nextInt();
        s.nextLine();

        Animal animal = null;

        switch (option) {
            case 1 -> {
                System.out.println("\nWelcome to the Pachyderm Enclosure");
                System.out.println("1. Feed rhino");
                System.out.println("2. Feed elephant");
                System.out.println("3. Feed hippo");
                System.out.print("Choose Animal to Feed: ");
                int choice = s.nextInt();
                s.nextLine();

                animal = switch (choice) {
                    case 1 -> new rhino();
                    case 2 -> new elephant();
                    case 3 -> new hippo();
                    default -> null;
                };
            }

            case 2 -> {
                System.out.println("\nWelcome to the Feline Enclosure");
                System.out.println("1. Feed tiger");
                System.out.println("2. Feed lion");
                System.out.println("3. Feed cheetah");
                System.out.print("Choose Animal to Feed: ");
                int choice = s.nextInt();
                s.nextLine();

                animal = switch (choice) {
                    case 1 -> new tiger();
                    case 2 -> new lion();
                    case 3 -> new cheetah();
                    default -> null;
                };
            }

            case 3 -> {
                System.out.println("\nWelcome to the Bird Enclosure");
                System.out.println("1. Feed parrot");
                System.out.println("2. Feed falcon");
                System.out.println("3. Feed owl");
                System.out.print("Choose Animal to Feed: ");
                int choice = s.nextInt();
                s.nextLine();

                animal = switch (choice) {
                    case 1 -> new parrot();
                    case 2 -> new falcon();
                    case 3 -> new owl();
                    default -> null;
                };
            }

            default -> System.out.println("Invalid enclosure choice.");
        }

        if (animal != null) {
            System.out.println("\nYou chose to feed the " + animal.getName());
            System.out.println(animal.getName() + " is eating " + animal.getFood());
            System.out.println(animal.getName() + " says " + animal.getSound());
        } else {
            System.out.println("Invalid animal choice.");
        }

    }
}
