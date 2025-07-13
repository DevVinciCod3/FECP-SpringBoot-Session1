package org.example.ticketing_module;

import java.util.Scanner;
public class TicketingModule {
    public static void run() {
        Scanner s = new Scanner(System.in);
        TicketingSystem zooTicketingSystem = new TicketingSystem();

        while (true) {
            System.out.println("\n=== WELCOME TO THE ZOO TICKETING SHOP ===");
            System.out.println("Here's what you can experience at the zoo:");
            System.out.println("Visit animal enclosures (Elephant, Lion, Owl)");
            System.out.println("Buy snacks and drinks from our Shops");
            System.out.println("Listen to science lectures at the hospital");
            System.out.println("Buy fun gifts at our gift shop");

            System.out.println("\nWhat would you like to do?: ");
            System.out.println("1. Get Tickets");
            System.out.println("2. Enter Zoo");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    zooTicketingSystem.start();
                    break;
                case 2:
                    VisitorEntry zooVisitorEntry = new VisitorEntry(zooTicketingSystem.getTickets());
                    zooVisitorEntry.start();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}