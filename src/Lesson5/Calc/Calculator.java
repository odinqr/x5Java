package Lesson5.Calc;

import java.util.Scanner;
import java.util.logging.Logger;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Программа вычисляет значение выражения.");
        System.out.println("Введите выражение, или " + "exit" + " для выхода.");
        Scanner scanner = new Scanner(System.in);

        double one = 0;
        double two = 0;
        String op = "";

        do {
            String input = scanner.next();
            String str = input.replaceAll("\\s", " ");
            if (str.equals("exit")) {
                break;
            }

            String[] strings = str.split("\\W");
            String[] operator = str.split("\\w");

            try {
                one = Double.parseDouble(strings[0]);
                two = Double.parseDouble(strings[1]);
                op = operator[operator.length - 1];
                System.out.println("Результат: " + operation(one, two, op));
            }
            catch (Exception e) {
                System.out.println("Ошибка. Введите выражение заново.");
            }
        }
        while (true);

        LoggerFactory factory = new LoggerFactory();

        Logger сonsoleLogger = factory.getLogger(LoggerType.ConsoleLogger);
        Logger dbLogger = factory.getLogger(LoggerType.DbLogger);
        Logger fileLogger = factory.getLogger(LoggerType.FileLogger);

    }

    private static double operation (double one, double two, String op) {

        switch (op) {
            case "*":
                return one * two;
            case "+":
                return one + two;
            case "-":
                return one - two;
            case "/":
                return one / two;
            default:
                return 0.0;
        }
    }

}

