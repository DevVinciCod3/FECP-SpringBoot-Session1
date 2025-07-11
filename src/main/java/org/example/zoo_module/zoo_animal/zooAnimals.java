package org.example.zoo_module.zoo_animal;

public class zooAnimals {
    private String name;
    private String sound;
    private String food;

    public zooAnimals(String name, String sound, String food) {
        this.name = name;
        this.sound = sound;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public String feed() {
        return food;
    }

    public String makeSound() {
        return sound;
    }
}
