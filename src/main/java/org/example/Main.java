package org.example;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final String adminUserName = "admin";
    private static final String adminPassword = "adminadmin";
    private static final Zoo_Staff zooStaff = new Zoo_Staff();

    public static void main(String[] args) {
        System.out.println("=== Welcome to the Zoo Admin Console ===");
        System.out.println("Please Log In.");
        System.out.print("Enter username: ");
        String userName = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (!adminUserName.equals(userName) || !adminPassword.equals(password)) {
            System.out.println("Incorrect Username or Password");
            return;
        }

        System.out.println("\nLogin successful. Welcome!");

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("========== ZOO ADMIN MAIN MENU ==========");
            System.out.println("""
                    1. Setup Zoo Staff
                    2. Access Handler Module
                    3. Open Zoo to Visitors
                    4. Close Zoo to Visitors
                    5. Exit
                    """);
            System.out.print("Choose an option: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1 -> setupZooStaff();
                case 2 -> Handler_Module.accessModule(sc, zooStaff);
                case 3 -> System.out.println("Zoo is now OPEN to visitors!");
                case 4 -> System.out.println("Zoo is now CLOSED to visitors.");
                case 5 -> {
                    System.out.println("Exiting admin console. Goodbye!");
                    isRunning = false;
                }
                default -> System.out.println("Invalid Option.");
            }
        }
    }

    private static void setupZooStaff() {
        System.out.println("=== Zoo Setup ===");
        System.out.print("Enter your name, Manager: ");
        zooStaff.setManager(sc.nextLine());

        System.out.print("Enter Veterinarian's name: ");
        zooStaff.setVeterinarian(sc.nextLine());

        System.out.print("Enter Handler for Pachyderm Enclosure: ");
        zooStaff.setPachydermHandler(sc.nextLine());

        System.out.print("Enter Handler for Feline Enclosure: ");
        zooStaff.setFelineHandler(sc.nextLine());

        System.out.print("Enter Handler for Bird Enclosure: ");
        zooStaff.setBirdHandler(sc.nextLine());

        System.out.print("Enter Vendor for Ticket Shop: ");
        zooStaff.setTicketVendor(sc.nextLine());

        System.out.print("Enter Vendor for Shop: ");
        zooStaff.setShopVendor(sc.nextLine());

        System.out.println("Zoo staff setup complete.");
    }
}
