package ru.spaces.artshi2009.lesson1;

public class Main {
    public static void main(String[] args) {

        /*2. Создать переменные всех пройденных типов данных и инициализировать их значения*/
        float value0 = 0.f;
        double value1 = 0.d;
        int value2 = 60000;
        char value3 = 'a';
        String msg = "Проверка";
        byte value4 = 1;
        long value5 = 11234124312L;
        short value6 = 30000;



        /*Проверка*/
        System.out.println("a * (b + (c / d)) = " + resultValue(1,2,3,4));
        System.out.println("Сумма чисел лежит между 10 и 20? : " + boolValue(10,10));
        positiveValue(1);
        System.out.println("Отрицательное число? : " + negativeValue(-1));
        printName("AndroidDev");
        leapYear(2019);
    }
    /*3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
             где a, b, c, d – входные параметры этого метода.*/
    static  double resultValue(double a, double b, double c, double d){
        return a * (b + (c / d));
    }


    /*4. Написать метод, принимающий на вход два числа и проверяющий,
      что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.*/
    static boolean boolValue(int value1, int value2){
        int sum = value1 + value2;
        return sum >= 10 && sum <= 20;
    }

    /*5. Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.*/
    static void positiveValue(int value){
        String positive = value >= 0 ? "Положительное число" : "Отрицательное число";
        System.out.println(positive);
    }

    /*6. Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное.*/
    static boolean negativeValue(int value){
        return  value < 0;
    }

    /*7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    Метод должен вывести в консоль сообщение «Привет, указанное_имя!».*/
    static void printName(String name){
        System.out.println("Привет, " + name + "!");
    }

    /*8. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
      Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/
    static void leapYear(int year){
        if ((year%4 != 0 || year%100 == 0 && year%400 != 0)){
            System.out.println("Год не високосный");
        }
        else System.out.println("Год високосный");
    }
}
