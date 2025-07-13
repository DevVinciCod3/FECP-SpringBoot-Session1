package org.example.animals;

public abstract class Animal {
    protected String name;
    protected String sound;
    protected String food;
    protected boolean healthy = true;
    protected String location = "Enclosure";
    protected String animalType;

    public Animal(String animalType, String name, String sound, String food) {
        this.name = name;
        this.sound = sound;
        this.food = food;
        this.animalType = animalType;
    }


    public void eat() {
        System.out.println(name + " is eating " + food + ".");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public abstract void roam();

    public void makeSound() {
        System.out.println(name + " says: " + sound);
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public String getFood() {
        return food;
    }

    public void sendToHospital() {
        location = "Hospital";
        healthy = false;
        System.out.println(name + " has been sent to the hospital.");
    }

    public String getLocation() {
        return location;
    }

    public boolean isHealthy() {
        return healthy;
    }
}
