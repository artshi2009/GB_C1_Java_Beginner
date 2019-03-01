package ru.spaces.artshi2009.lesson2;

public class Array {
    public static void main(String[] args) {

        /*Проверка*/
        int [] values = {1, 0, 1, 1, 0, 0, 1, 0, 0, 1};
        replaceValueInArray(values);
        System.out.println("| Задание 1"); //переход на новую строку после предыдущего метода

        int [] empty = new int [8];
        writeArray(empty);
        System.out.println("| Задание 2");

        int [] multiArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplicationValueInArray(multiArray);
        System.out.println("| Задание 3");

        int [][] twoDimensional = {{1, 2, 3},
                                    {3, 2, 1},
                                    {3, 4, 5}};
        writeTwoDimensionalArray(twoDimensional);
        System.out.println("| Задание 4");

        int [] testArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        maxMinValueInArray(testArray);
        System.out.println(" | Задание 5");

        System.out.println("Результат = " + checkBalance(testArray) + " | Задание 6");

        shiftValuesInArray(testArray, 1);
        System.out.println("| Задание 7");
    }

    /*1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0*/
    static void replaceValueInArray(int[] values){
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 0){
                values[i] = 1;
            }else {
                values[i] = 0;
            }
            System.out.print(values[i] + " ");
        }
    }

    /*2. Задать пустой целочисленный массив размером 8.
    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21*/
    static void writeArray(int[] values){
        int i = 0;
        int j = 0;
        while (i < values.length){
            values[i] = j;
            System.out.print(values[i] + " ");
            j += 3;
            i++;
        }
    }

    /*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    и числа меньшие 6 умножить на 2*/
    static void multiplicationValueInArray(int [] values){
        int i = 0;
        while (i < values.length){
            if (values[i] < 6){
                values[i] *= 2;
            }
            System.out.print(values[i] + " ");
            i++;
        }
    }

    /*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами*/
    static void writeTwoDimensionalArray(int [][] values){
        int j, i;
        for(i = 0; i < values.length; i++){
            values[i][i] = 1;
            for (j = 0; j < values.length; j++){
                System.out.print(values[i][j] + " ");

            }System.out.println();
        }
    }

    /*5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета)*/
    static void maxMinValueInArray(int [] values){
        int max = values[0];
        int min = values[0];
        for (int i = 0; i < values.length; i++){
            if (values[i] > max){
                max = values[i];
            }
            if (values[i] <= min){
                min = values[i];
            }
        }
        System.out.println("Минимальное значение массива = " + min);
        System.out.print("Максимальное значение массива = " + max);
    }


    /*6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
    checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.*/
    private static boolean checkBalance(int[] values) {
        int leftSideSum, rightSideSum;

        for (int i = 0; i < values.length + 1; i++) {
            leftSideSum = 0;
            rightSideSum = 0;

            for (int j = 0; j < i; j++) {
                leftSideSum += values[j];
            }

            for (int j = i; j < values.length; j++) {
                rightSideSum += values[j];
            }

            if (leftSideSum == rightSideSum) return true;
        }
        return false;
    }

    /*7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
    при этом метод должен сместить все элементымассива на n позиций.
    Для усложнения задачи нельзя пользоваться вспомогательными массивами.*/
    private static void shiftValuesInArray(int[] values, int n) {
        for (int i : values) System.out.print(i + " ");
        System.out.println(" ");

        if (n > 0) {
            for (int j = 0; j < n; j++) {
                int buf = values[values.length - 1];
                if (values.length - 1 >= 0) System.arraycopy(values, 0, values, 1, values.length - 1);
                values[0] = buf;
                for (int i : values) System.out.print(i + " ");
                System.out.println();
            }
        }
        if (n < 0) {
            for (int j = 0; j > n; j--) {
                int buf = values[0];
                System.arraycopy(values, 1, values, 0, values.length - 1);
                values[values.length - 1] = buf;
                for (int i : values){
                    System.out.print(i + " ");
                }
                System.out.print(" ");
            }
        }
    }
}
