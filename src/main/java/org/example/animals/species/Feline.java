package org.example.animals.species;

import org.example.animals.Animal;

public abstract class Feline extends Animal {
    public Feline(String name) { super(name); }

    @Override
    public void roam() {
        System.out.println(name + " stealthily prowls.");
    }
}
