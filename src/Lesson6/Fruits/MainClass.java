package Lesson6.Fruits;

import java.util.Collections;
import java.util.ArrayList;


public class MainClass {
    public static void main(String[] args) {

        //Создаем коробки для фруктов
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox1 = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();

        //Заполняем созданные коробки фруктами
        appleBox.addFruit(new Apple(), 25);
        appleBox1.addFruit(new Apple(), 30);
        orangeBox.addFruit(new Orange(), 15);
        orangeBox1.addFruit(new Orange(), 13);

        //Вычисляем вес коробок с фруктами
        System.out.println("Вес первой коробки с апельсинами: " + orangeBox.getWeight());
        System.out.println("Вес второй коробки с апельсинами: " + orangeBox1.getWeight());
        System.out.println("Вес второй коробки с яблоками: " + appleBox1.getWeight());
        System.out.println("Вес первой коробки с яблоками: " + appleBox.getWeight());

        //Сравниваем коробки с фруктами по весу
        System.out.println("Вес первой коробки с яблоками равен весу первой коробки с апельсинами: " + appleBox.compare(orangeBox));
        System.out.println("Вес первой коробки с апельсинами равен весу второй коробки с апельсинами: " + orangeBox.compare(orangeBox1));

        //Пересыпаем фрукты из одной коробки в другую
        appleBox.pourToBox(appleBox1);
        orangeBox1.pourToBox(orangeBox);
        System.out.println(appleBox1.getWeight());
        System.out.println(orangeBox.getWeight());


    }
}
