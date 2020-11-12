package Lesson6.ArrayList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        String str1 = "One";
        String str2 = "Two";
        String str3 = "Three";
        String str4 = "Four";
        String str5 = "Five";
        String str = "Ten";

        LinkedList<String> nums = new LinkedList<>();
        nums.add(str1);
        nums.add(str2);
        nums.add(str3);
        nums.add(str4);
        nums.add(str5);

        System.out.println(nums);

        //Размер коллекции
        System.out.println(nums.size());

        //Добавление элемента
        nums.add(2, str);
        System.out.println(nums);

        //Удаление элемента по индексу
        nums.remove(3);
        System.out.println(nums);

        //Удаление элемента
        nums.remove(str5);
        System.out.println(nums);

        //Получение элемента по индексу
        System.out.println(nums.get(0));

        //Очистка коллекции
        nums.clear();
        System.out.println(nums);




    }
}
