package ru.spaces.artshi2009.lesson6;

public class Cat extends Animal {
    Cat(){

    }

    Cat(String name){
        super(name);
    }

    Cat(String name, String animalType){
        super(name, animalType);
    }

    Cat(String name, double run, double jump, double swim) {
        super(name, run, jump, swim);
    }

    @Override
    void limits(double limitRun, double limitJump, double limitSwim) {
        super.limits(limitRun, limitJump, limitSwim);
    }

    @Override
    void run(double count) {
        super.run(count);
        System.out.println("run: " + checkRun(count));
    }

    @Override
    void swim(double count) {
        if (count != 0){
            System.out.println("Животное не может плыть со скоростью " + (int)count
                    + ", так как не умеет плавать.");
        }else System.out.println("Животное не умеет плавать.");
        System.out.println("swim: " + checkSwim(count));
    }

    @Override
    void jump(double count) {
        super.jump(count);
        System.out.println("jump: " + checkJump(count));
    }

    boolean checkSwim(double count) {
        if (count == getLimitsSwim()) {
            return true;
        } else return false;
    }

    boolean checkRun(double count) {
        if (count <= getLimitsRun() && count > 0) {
            return true;
        } else return false;
    }

    boolean checkJump(double count) {
        if (count <= getLimitsJump() && count > 0) {
            return true;
        } else return false;
    }
}
