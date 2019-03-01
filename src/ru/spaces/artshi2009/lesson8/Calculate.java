package ru.spaces.artshi2009.lesson8;

public class Calculate {
    public double calc(double value1, String operator, double value2){
        double res = 0;
        switch (operator){
            case "+":
                res = value1 + value2;
                break;

            case "-":
                res = value1 - value2;
                break;
            case "*":
                res = value1 * value2;
                break;

            case "/":
                res = value1 / value2;
                break;
        }
        return res;
    }

}
