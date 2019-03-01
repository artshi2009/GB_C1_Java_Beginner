package ru.spaces.artshi2009.lesson5;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Test1 Test1 Test1", "Engineer", "noob1@gmail.com", "79999999911", 200000, 40);

/** Создать массив из 5 сотрудников*/
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Test1 Test1 Test1", "Engineer", "noob1@gmail.com", "79999999911", 200000, 40);
        empArray[1] = new Employee("Test2 Test2 Test2", "Engineer", "noob2@gmail.com", "79999999988", 180000, 35);
        empArray[2] = new Employee("Test3 Test3 Test3", "Engineer", "noob3@gmail.com", "79999999977", 80000, 32);
        empArray[3] = new Employee("Test4 Test4 Test4", "Engineer", "noob4@gmail.com", "79999999966", 110000, 45);
        empArray[4] = new Employee("Test5 Test5 Test5", "Engineer", "noob5@gmail.com", "79999999955", 130000, 50);

/** С помощью цикла вывести информацию только о сотрудниках старше 40 лет;*/
        for(int i = 0; i < empArray.length; i++){
            if(empArray[i].getAge() > 40){
                empArray[i].info();
            }
        }
    }
}
