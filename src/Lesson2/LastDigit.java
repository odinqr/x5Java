package Lesson2;

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Эта программа выводит на экран последнюю цифру введенного числа.");
        System.out.print("Введите любое число: ");

        int a = scanner.nextInt();

        if (a >= 0) {
            System.out.println("Последняя цифра этого числа: " + a % 10);
        }

        else {
            System.out.println("Последняя цифра этого числа: " + (-a) % 10);
        }

    }
}
