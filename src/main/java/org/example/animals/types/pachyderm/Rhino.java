package org.example.animals.types.pachyderm;
import org.example.animals.species.Pachyderm;

public class Rhino extends Pachyderm {
    public Rhino(String name) { super(name); }

    @Override
    public void makeSound() {
        System.out.println(name + " grunting roars.");
    }
}
