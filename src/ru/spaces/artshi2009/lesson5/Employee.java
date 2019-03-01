package ru.spaces.artshi2009.lesson5;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(){

    }
/** Конструктор класса должен заполнять поля при создании объекта;*/
    public Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
/** Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;*/
    public void info() {
        System.out.println("Имя пользователя: " + fullName + "; Должность: " + position + "; Емейл: " + email + "; Номер телефона: "
                + phone + "; Заработная плата: " + salary + "; Возраст: " + age);
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
