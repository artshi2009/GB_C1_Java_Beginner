package ru.spaces.artshi2009.lesson4;

import java.util.Scanner;

public class TicTacToe2 {
    public static char[][] gameField;

    public static final Scanner sc = new Scanner(System.in);

    public static final int SIZE_FIELD = 5;
    public static final int DOTS_TO_WIN = 4;

    public static final char COORD_X = 'X';
    public static final char COORD_O = 'O';
    public static final char COORD_EMPTY = '*';



    public static void main(String[] args) {
        initField();
        printField();

        while (true) {
            moveHuman();
            printField();
            if (checkWin(COORD_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (checkFieldOfEmptyCoord()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printField();
            if (checkWin(COORD_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (checkFieldOfEmptyCoord()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static void initField(){
        gameField = new char[SIZE_FIELD][SIZE_FIELD];
        for (int i = 0; i < SIZE_FIELD; i++){
            for (int j = 0; j < SIZE_FIELD; j++){
                gameField[i][j] = COORD_EMPTY;
            }
        }
    }

    public static void printField(){
        System.out.print("  | ");

        for (int i = 0; i < SIZE_FIELD; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println("|");

        for(int x = 0; x < SIZE_FIELD + 2; x++){
            System.out.print("- ");
        }
        System.out.print("|");
        System.out.println();

        for (int i = 0; i < SIZE_FIELD; i++) {
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < SIZE_FIELD; j++){
                System.out.print(gameField[i][j] + " ");
        }
            System.out.println("|");
        }

        for(int x = 0; x < SIZE_FIELD + 2; x++){
            System.out.print("- ");
        }
        System.out.print("┙");
        System.out.println();
    }

    public static void moveHuman(){
        int x;
        int y;
        do{
            System.out.print("Введите координату, в которую разместите X (вводится через пробел) ");

            try {
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
            }
            catch (Exception exp){
                x = -1;
                y = -1;
                System.out.println("Введите координаты от " + 1 + " до " + SIZE_FIELD);
            }
        }while (!isCellValid(x, y));
        gameField[y][x] = COORD_X;
    }

    public static void aiTurn() {
        try {
            System.out.println("Так... Если 111001010101... То... 1011001001");
            Thread.sleep(1500);
        } catch (Exception ignored) {}
        int x, y;
        do {
            x = (int)(Math.random()*SIZE_FIELD);
            y = (int)(Math.random()*SIZE_FIELD);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер поставил " + COORD_O + " в точку " + (x + 1) + " " + (y + 1));
        gameField[y][x] = COORD_O;
    }

    public static boolean checkFieldOfEmptyCoord(){
        for(int i = 0; i < SIZE_FIELD; i++){
            for (int j = 0; j < SIZE_FIELD; j++){
                if (gameField[i][j] == COORD_EMPTY) return false;
            }
        }
        return true;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE_FIELD || y < 0 || y >= SIZE_FIELD) return false;
        return gameField[y][x] == COORD_EMPTY;
    }
/*2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4.*/

    public static boolean checkWin(char symbol) {
        int sumDiagB = 0;
        int sumDiagS = 0;
        for (int i = 0; i < SIZE_FIELD; i++) {
            int sumRow = 0;
            int sumCol = 0;
            for (int j = 0; j < SIZE_FIELD; j++) {
                sumRow += (gameField[i][j] == symbol) ? 1 : -1;
                sumCol += (gameField[j][i] == symbol) ? 1 : -1;
                if (j == i) {
                    sumDiagB += (gameField[i][i] == symbol) ? 1 : -1;
                    sumDiagS += (gameField[i][SIZE_FIELD - 1 - i] == symbol) ? 1 : -1;
                }
                if (sumRow >= DOTS_TO_WIN || sumCol >= DOTS_TO_WIN) return true;
                if (sumRow < 0) sumRow = 0;
                if (sumCol < 0) sumCol = 0;
            }
            if (sumDiagB >= DOTS_TO_WIN || sumDiagS >= DOTS_TO_WIN) return true;
            if (sumDiagB < 0) sumDiagB = 0;
            if (sumDiagS < 0) sumDiagS = 0;
        }
        return false;
    }
}
