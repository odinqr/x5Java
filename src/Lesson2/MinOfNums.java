package Lesson2;

import java.util.Scanner;

public class MinOfNums {

    public static int minNums() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Эта программа находит минимальное из трех чисел.");
        System.out.print("Введите три числа: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int min = a;

        if (b < min) {
            return b;
        }
        else if (c < min) {
            return c;
        }
        else {
            return  min;
        }
    }

    public static void main(String[] args) {

        System.out.println("Минимальное число: " + minNums());

    }
}
