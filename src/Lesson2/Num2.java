package Lesson2;

import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");

        int a = scanner.nextInt();

        if (a > 0) {
            System.out.println(a + 1);
        } else if (a == 0) {
            System.out.println(10);
        } else {
            System.out.println(a - 2);
        }
    }
}
