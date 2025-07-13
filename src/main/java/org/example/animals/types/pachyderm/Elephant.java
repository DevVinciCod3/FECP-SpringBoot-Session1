package org.example.animals.types.pachyderm;
import org.example.animals.species.Pachyderm;

public class Elephant extends Pachyderm {
    public Elephant(String name) { super(name); }

    @Override
    public void makeSound() {
        System.out.println(name + " trumpets.");
    }
}
