package org.example.animals.types.feline;

import org.example.animals.species.Feline;

public class Tiger extends Feline {
    public Tiger(String name) { super(name); }

    @Override
    public void makeSound() {
        System.out.println(name + " growling loudly.");
    }
}
