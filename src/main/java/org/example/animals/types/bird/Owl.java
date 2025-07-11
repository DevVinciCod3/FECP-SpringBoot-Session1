package org.example.animals.types.bird;
import org.example.animals.species.Bird;

public class Owl extends Bird {
    public Owl(String name) { super(name); }

    @Override
    public void makeSound() {
        System.out.println(name + " hoot-hoot.");
    }
}
