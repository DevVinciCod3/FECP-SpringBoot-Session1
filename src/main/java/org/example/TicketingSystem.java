package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TicketingSystem {
    Scanner s = new Scanner(System.in);
    Map<String, Ticket> tickets = new HashMap<>();



    public void start(){
        while (true) {
            System.out.println("\n== ZOO TICKETING SYSTEM ==");
            System.out.println("1. Purchase New Ticket");
            System.out.println("2. Display All Tickets");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = s.nextInt();
            s.nextLine();

            switch (choice) {
                case 1:
                    purchaseNewTicket();
                    break;
                case 2:
                    displayAllTickets();
                    break;
                case 3:
                    System.out.println("Thank you for using the system. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public void purchaseNewTicket() {
        System.out.print("Would you like to buy a ticket? (yes/no): ");
        String ticket_choice = s.nextLine().toLowerCase();

        if (ticket_choice.equals("yes")) {
            System.out.print("Enter your name: ");
            String name = s.nextLine();

            System.out.print("Enter your age: ");
            int age = s.nextInt();
            s.nextLine();

            Ticket.displayCategoryAndPrice(age);

            System.out.print("Proceed with purchase? (yes/no): ");
            String purchase_choice = s.nextLine().toLowerCase();

            if (purchase_choice.equals("yes")) {
                String newTicketCode = generateTicketCode();
                Ticket newTicket = new Ticket(newTicketCode, name, age);
                tickets.put(newTicketCode, newTicket);
                System.out.println("Purchase successful!");
                newTicket.displayTicket();
            } else {
                System.out.println("Purchase canceled. Hope you visit us again next time!");
            }
        } else {
            System.out.println("Hope you visit us again next time!");
        }
    }



    public String generateTicketCode() {
        int min = 1000;
        int max = 9999;
        int ticket_number = (int) (Math.random() * (max - min + 1)) + min;
        // Return ONLY the code
        return "ZOO-" + ticket_number;
    }

    public void displayAllTickets() {
        System.out.println("\n--- All Tickets Sold ---");
        if (tickets.isEmpty()) {
            System.out.println("No tickets have been sold yet.");
        } else {
            for (Ticket ticket : tickets.values()) {
                ticket.displayTicket();
                System.out.println("--------------------");
            }
        }
    }
    public Map<String, Ticket> getTickets() {
        return tickets;
    }


}
