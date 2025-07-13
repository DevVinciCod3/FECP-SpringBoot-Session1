package org.example.animals.types.feline;

import org.example.animals.species.Feline;

public class Lion extends Feline {
    public Lion(String name) { super(name); }

    @Override
    public void makeSound() {
        System.out.println(name + " roar loudly.");
    }
}
