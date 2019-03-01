package ru.spaces.artshi2009.lesson7;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(30);
        int count = (int)(Math.random() * 15);
        Cat[] cats = {
                new Cat("кот1", count),
                new Cat("кот2", count),
                new Cat("кот3", count),
                new Cat("кот4", count),
                new Cat("кот5", count)
        };

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.animalInfo();
        }

        plate.addFood(50);
        plate.info();
    }
}
