package org.example.animals.types.bird;
import org.example.animals.species.Bird;

public class Falcon extends Bird {
    public Falcon(String name) { super(name); }

    @Override
    public void makeSound() {
        System.out.println(name + " kak-kak.");
    }
}
