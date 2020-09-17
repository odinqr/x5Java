package Lesson2;

import java.util.Scanner;

public class PricePhoneCall {

    public static void main(String[] args) {

        float priceMoscowCall = 4.15F;
        float priceRostovCall = 1.98F;
        float priceKrasnodarCall = 2.69F;
        float priceKirovCall = 5F;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа выводит стоимость десятиминутного разговора для Москвы (905), Ростова (194), Краснодара (491), Кирова (800).");
        System.out.print("Введите код города: ");
        int a = scanner.nextInt();

        System.out.print("Введите продолжительность разговора: ");
        int b = scanner.nextInt();


        switch (a) {
            case 905:
                System.out.println("Москва. Стоимость разговора: " + b * priceMoscowCall);
                break;
            case 194:
                System.out.println("Ростов. Стоимость разговора: " + b * priceRostovCall);
                break;
            case 491:
                System.out.println("Краснодар. Стоимость разговора: " + b * priceKrasnodarCall);
                break;
            case 800:
                System.out.println("Киров. Стоимость разговора: " + b * priceKirovCall);
                break;
            default:
                System.out.println("Введенный код города не найден.");
        }
    }
}
