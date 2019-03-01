package ru.spaces.artshi2009.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /*1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
        При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
        После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).*/
        //matchValue("Введите число от 0 до 9: ");

        /*2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
        "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
        "pear", "pepper", "pineapple", "pumpkin", "potato"};
        При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
                сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
                Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
                apple – загаданное
        apricot - ответ игрока
        ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        Для сравнения двух слов посимвольно, можно пользоваться:
        String str = "apple";
        str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        Играем до тех пор, пока игрок не отгадает слово
        Используем только маленькие буквы*/
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        wordTarget(words);
        sc.close();
    }

    private static void wordTarget(String[] words) {
        char[] arr = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};
        System.out.print("Введите предполагаемое слово: ");
        String scannerText;
        String arrRepl;
        do {
            scannerText = "apple";
            for (int i = 0; i < words.length; i++) {
                for (int j = 0; j < words[i].length(); j++) {
                    if (scannerText.charAt(j) == words[i].charAt(j)) {
                        arr[j] = words[i].charAt(j);
                    }
                }
            }
            String array = Arrays.toString(arr);
            arrRepl = array.replaceAll("#|[|]", "");
            if (arrRepl == scannerText){
                System.out.println(arr);
            }
        }while(arrRepl != scannerText);
    }

    private static void matchValue(String msg){
        int randomValue = (int)(Math.random() * 9);
        int readValue;
        do{
            for(int i = 0; i < 3; i++){
                System.out.println();
                System.out.print(msg);
                readValue = sc.nextInt();

                if (readValue > randomValue){
                    System.out.print("Значение меньше чем " + readValue);
                }
                else if (readValue < randomValue){
                    System.out.print("Значение больше чем " + readValue);
                }
                else {
                    System.out.println("Вы угадали! Загаданное число: " + randomValue);
                    randomValue = (int)(Math.random() * 9);
                    break;
                }
            }
            System.out.println();
            System.out.print("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
        }while(sc.nextInt() == 1);
    }
}
