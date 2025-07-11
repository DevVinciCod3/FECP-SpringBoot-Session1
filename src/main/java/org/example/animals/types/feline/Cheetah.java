package org.example.animals.types.feline;

import org.example.animals.species.Feline;

public class Cheetah extends Feline {
    public Cheetah(String name) { super(name); }

    @Override
    public void makeSound() {
        System.out.println(name + " hissing loudly.");
    }
}
