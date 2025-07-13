package org.example.animals.species;

import org.example.animals.Animal;

public abstract class Pachyderm extends Animal {
    public Pachyderm(String animalType, String name, String sound, String food) {
        super(animalType, name, sound, food);
    }



    @Override
    public void roam() {
        System.out.println(name + " stomps around heavily.");
    }
}
