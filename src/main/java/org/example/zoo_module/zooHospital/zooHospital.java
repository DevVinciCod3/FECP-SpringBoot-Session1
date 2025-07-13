package org.example.zoo_module.zooHospital;

import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class zooHospital {

    private static final List<SickAnimals> sickAnimals = new ArrayList<>(
            List.of(
                    new SickAnimals("Jumbo"),
                    new SickAnimals("Scar")
            )
    );
    private static final Map<String, String> healedAnimals = new LinkedHashMap<>();

    public static void admitSickAnimal(String name) {
        sickAnimals.add(new SickAnimals(name));
    }

    public static void run(Scanner s) {
        System.out.println("\n1. View Sick Animals");
        System.out.println("2. View Healed Animals");
        System.out.println("3. Attend Science Lecture");
        System.out.println("4. Heal Animals (Veterinarian)");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");

        int option = s.nextInt();
        s.nextLine();



        switch (option) {
            case 1: {
                System.out.println("Sick Animals currently in Hospital:");
                for (SickAnimals animals : sickAnimals){
                    System.out.println("- " + animals.getName());
                }
                break;
            }

            case 2: {
                System.out.println("\n🕊️ Healed Animals with Timestamps:");
                if (healedAnimals.isEmpty()) {
                    System.out.println("- None");
                } else {
                    for (Map.Entry<String, String> entry : healedAnimals.entrySet()) {
                        System.out.println("- " + entry.getKey() + " ✅ (" + entry.getValue() + ")");
                    }
                }
                break;
            }

            case 3: {
                System.out.println("\nDr. Ellie gives a science lecture on animal health and conservation.");
                break;
            }

            case 4: {
                if (sickAnimals.isEmpty()) {
                    System.out.println("\nNo sick animals to heal.");
                    return;
                }

                System.out.println("\nDr. Ellie begins healing sick animals...");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                String timestamp = formatter.format(LocalDateTime.now());

                for (SickAnimals animals : sickAnimals) {
                    System.out.println("✅ Healed: " + animals.getName());
                    System.out.println(animals.getName() + " has been discharged and returned to enclosure.");
                    healedAnimals.put(animals.getName(), timestamp);
                }
                sickAnimals.clear();
                break;
            }

            case 5: {
                System.out.println("\nExiting Zoo Vet Hospital. Goodbye!");
                break;
            }

            default: {
                System.out.println("Invalid option. Try again.");
                break;
            }
        }

    }
}