package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class Ticket {

    public enum TicketType {
        CHILD("Child", 0, 0.0f),
        STUDENT("Student", 6, 75.0f),
        ADULT("Adult", 18, 150.0f),
        SENIOR("Senior", 60, 50.0f);

        public final String label;
        public final int minAge;
        public final float price;

        TicketType(String label, int minAge, float price) {
            this.label = label;
            this.minAge = minAge;
            this.price = price;
        }

        public static TicketType getByAge(int age) {
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative.");
            }
            return Arrays.stream(TicketType.values())
                    .filter(type -> age >= type.minAge)
                    .max(Comparator.comparingInt(type -> type.minAge))
                    .orElse(CHILD); // Default to CHILD if something goes wrong
        }
    }

    private final String ticketCode;
    private final String visitorName;
    private final int visitorAge;
    private final TicketType ticketType;

    public Ticket(String ticketCode, String visitorName, int visitorAge) {
        this.ticketCode = ticketCode;
        this.visitorName = visitorName;
        this.visitorAge = visitorAge;
        this.ticketType = TicketType.getByAge(visitorAge);
    }

    public static void displayCategoryAndPrice(int visitorAge){
        TicketType type = TicketType.getByAge(visitorAge);
        System.out.println("You qualify for a "+ type.label + " ticket");
        System.out.println("Ticket Price: ₱" + type.price);
    }
    public void displayTicket() {
        System.out.println("Ticket Code: " + this.ticketCode);
        System.out.println("Visitor Name: " + this.visitorName);
        System.out.println("Category: " + this.ticketType.label); // Get label from the enum
        System.out.printf("Price: $%.2f\n", this.ticketType.price); // Get price from the enum and format it
    }

    public String getVisitorName() {
        return visitorName;
    }

}