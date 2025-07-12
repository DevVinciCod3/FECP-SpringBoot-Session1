package org.example;

import java.util.Map;
import java.util.Scanner;

public class VisitorEntry {
    Scanner s = new Scanner(System.in);
    private Map<String, Ticket> tickets;

    public VisitorEntry(Map<String, Ticket> tickets) {
        this.tickets = tickets;
    }

    public void start() {
        zooEntry();
    }

    public void zooEntry() {
        System.out.print("Enter your ticket code: ");
        String ticket_code = s.nextLine().toUpperCase();

        if (tickets.containsKey(ticket_code)) {
            Ticket visitorTicket = tickets.get(ticket_code);
            System.out.println("Access Granted. Welcome, " + visitorTicket.getVisitorName() + "!");
        } else {
            System.out.println("Access Denied. Ticket code not found in the system.");
        }
    }
}
