package ru.spaces.artshi2009.lesson6;

public class Animal {
    private String name;
    private double run;
    private double jump;
    private double swim;
    private String actionSwim;
    private String actionRun;
    private String actionJump;
    private String animalType;
    private double limitSwim;
    private double limitRun;
    private double limitJump;

    Animal(){

    }

    Animal(String name){
        this.name = name;
    }

    Animal(String name, String animalType){
        this.name = name;
        this.animalType = animalType;
    }

    Animal(String name, double run, double jump, double swim){
        this.name = name;
        this.run = run;
        this.jump = jump;
        this.swim = swim;
    }

    void animalInfo(){
        System.out.println("-----------------");
        System.out.println("Животное: " + animalType + " - " + name + ".");
        System.out.println("-----------------");
    }

    void run(double count){
        this.run = count;
        if (run == 0){
            actionRun = " не бежит.";
        }
        else if (run > 0 && run <= limitRun){
            actionRun = " побежало.";
        }
        else actionRun = " не может не может бежать со скоростью " + (int)run + ".";

        System.out.println("Животное" + actionRun);
    }

    void jump(double count){
        this.jump = count;
        if (jump == 0){
            actionJump = " не прыгает.";
        }
        else if (jump > 0 && jump <= limitJump){
            actionJump = " прыгнуло.";
        }
        else actionJump = " не может не может прыгать в высоту на " + (int)jump + ".";

        System.out.println("Животное" + actionJump);
    }

    void swim(double count){
        this.swim = count;
        if (swim == 0){
            actionSwim = " не плывет.";
        }
        else if (swim > 0 && swim <= limitSwim){
            actionSwim = " поплыло.";
        }
        else actionSwim = " не может не может плыть со скоростью " + (int)swim + ".";

        System.out.println("Животное" + actionSwim);
    }

    void limits(double limitRun, double limitJump, double limitSwim){
        this.limitRun = limitRun;
        this.limitJump = limitJump;
        this.limitSwim = limitSwim;
    }

    double getLimitsRun(){
        return limitRun;
    }

    double getLimitsJump(){
        return limitJump;
    }

    double getLimitsSwim(){
        return limitSwim;
    }
}
