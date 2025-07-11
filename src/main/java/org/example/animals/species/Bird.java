package org.example.animals.species;

import org.example.animals.Animal;

public abstract class Bird extends Animal {
    public Bird(String name) { super(name); }

    @Override
    public void roam() {
        System.out.println(name + " flies around the aviary.");
    }
}
