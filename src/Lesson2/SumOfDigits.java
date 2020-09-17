package Lesson2;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Эта программа вычисляет сумму цифр числа.");
        System.out.print("Введите число: ");

        int x = scanner.nextInt();

        int sum = 0;

        while (Math.abs(x) > 10) {
            sum = sum + x % 10;
            x = x/10;
        }

        System.out.println(Math.abs(sum));
    }
}
