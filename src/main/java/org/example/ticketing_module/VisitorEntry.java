package org.example.ticketing_module;

import org.example.zoo_module.zooModule;

import java.util.Map;
import java.util.Scanner;

public class VisitorEntry {
    Scanner s = new Scanner(System.in);
    private final Map<String, Ticket> tickets;
    zooModule zoo = new zooModule();

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
            zoo.run();
        } else {
            System.out.println("Access Denied. Ticket code not found in the system.");
        }
    }


}
