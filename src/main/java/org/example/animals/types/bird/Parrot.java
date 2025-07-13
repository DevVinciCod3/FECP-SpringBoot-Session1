package org.example.animals.types.bird;
import org.example.animals.species.Bird;

public class Parrot extends Bird {
    public Parrot(String name) { super(name); }

    @Override
    public void makeSound() {
        System.out.println(name + " squawks.");
    }
}
