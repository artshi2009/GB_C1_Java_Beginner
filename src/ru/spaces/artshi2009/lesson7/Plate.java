package ru.spaces.artshi2009.lesson7;

public class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    boolean decreaseFood(int countFood) {
        int count = food - countFood;
        if (count < 0){
            return false;
        }
        food -= countFood;
        return true;
    }

    void addFood(int food) {
        this.food += food;
    }

    void info() {
        System.out.println("Добавлено еды в тарелку: " + food + ".");
    }
}
