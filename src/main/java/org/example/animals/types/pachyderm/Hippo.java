package org.example.animals.types.pachyderm;
import org.example.animals.species.Pachyderm;

public class Hippo extends Pachyderm {
    public Hippo(String name) { super(name); }

    @Override
    public void makeSound() {
        System.out.println(name + " groans.");
    }
}
