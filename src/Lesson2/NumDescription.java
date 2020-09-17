package Lesson2;

import java.util.Scanner;

public class NumDescription {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Эта программа выводит описание введенного числа.");
        System.out.print("Введите любое число: ");

        int a = scanner.nextInt();

        if (a > 0) {
            if ((a % 2) == 0) {
                System.out.println("Вы ввели положительное четное число.");
            } if ((a % 2) != 0) {
                System.out.println("Вы ввели положительное нечетное число.");
            }
        }
        if (a < 0) {
            if ((a % 2) == 0) {
                System.out.println("Вы ввели отрицательное четное число.");
            } if ((a % 2) != 0) {
                System.out.println("Вы ввели отрицательное нечетное число.");
            }
        }
        else {
            System.out.println("Вы ввели нулевое число.");
        }
    }
}
