package org.example.animals.species;

import org.example.animals.Animal;

public abstract class Pachyderm extends Animal {
    public Pachyderm(String name) { super(name); }

    @Override
    public void roam() {
        System.out.println(name + " stomps around heavily.");
    }
}
