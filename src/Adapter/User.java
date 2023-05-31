package Adapter;

import java.awt.print.Pageable;
import java.util.ArrayList;

public class User {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog("댕댕이"));
        animals.add(new Cat("츄르"));
//        animals.add(new Tiger("티거"));
        animals.add(new TigerAdapter("티거"));

        animals.forEach(animal -> {
            animal.sound();
        });
    }
}
