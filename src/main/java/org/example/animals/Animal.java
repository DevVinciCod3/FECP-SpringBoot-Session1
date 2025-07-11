package org.example.animals;

public abstract class Animal {
    protected String name;
    protected boolean healthy = true;
    protected String location = "Enclosure";

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public abstract void roam();
    public abstract void makeSound();

    public String getName() {
        return name;
    }

    public void sendToHospital() {
        location = "Hospital";
        healthy = false;
        System.out.println(name + " has been sent to the hospital.");
    }

    public String getLocation() {
        return location;
    }
}
