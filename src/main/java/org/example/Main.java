package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float price=0f;
        System.out.println("=== WELCOME TO THE ZOO TICKETING SHOP ===");
        System.out.println("Here's what you can experience at the zoo:");
        System.out.println("Visit animal enclosures (Elephant, Lion, Owl)");
        System.out.println("Buy snacks and drinks from our Shops");
        System.out.println("Listen to science lectures at the hospital");
        System.out.println("Buy fun gifts at our gift shop");

        System.out.print("Would you like to buy a ticket? (yes/no):");
        String ticket_choice = s.nextLine().toLowerCase();
        buy_ticket(s, ticket_choice);



//        System.out.printf("Price: $%.2f%n",price);
    }

    public static void buy_ticket(Scanner s, String ticket_choice){
        if (ticket_choice.equals("yes")){
            System.out.print("Enter your name: ");
            String name = s.next();
            System.out.print("Enter your age: ");
            int age = s.nextInt();
            age_category(age);
            age_price(age);


        }else{
            System.out.println("Hope you visit us again next time!");
        }
    }
    public static void age_category(int age){
        if (age >= 60){
            System.out.println("You qualify for a SENIOR ticket");
        } else if (age >= 18){
            System.out.println("You qualify for a ADULT ticket");
        } else if (age >= 6) {
            System.out.println("You qualify for a STUDENT ticket");
        } else if (age >= 0) {
            System.out.println("You qualify for a CHILD ticket");
        }else{
            System.out.println("Please enter a valid age.");
        }
    }
    public static void age_price(int age){
        if (age >= 60){
            System.out.println("Ticket Price: ₱50");
        } else if (age >= 18){
            System.out.println("Ticket Price: ₱150");
        } else if (age >= 6) {
            System.out.println("Ticket Price: ₱75");
        } else if (age >= 0) {
            System.out.println("Ticket Price: ₱0");
        }else{
            System.exit(0);
        }
    }




}