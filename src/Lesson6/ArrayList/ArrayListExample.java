package Lesson6.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(15);
        arr.add(1);
        arr.add(88);
        arr.add(-15);
        arr.add(1340);
        arr.add(18);
        arr.add(-26);
        arr.add(-54);
        arr.add(1153);
        arr.add(29561);
        arr.add(3);
        arr.add(7);
        arr.add(-9);

        System.out.println("Размер коллекции: " + arr.size());

        Collections.sort(arr);
        System.out.println("Отсортированная коллекция: " + arr);

        arr.add(0, -183);
        Collections.sort(arr);
        System.out.println("Коллекция после добавления нового элемента: " + arr);

        arr.remove(9);
        System.out.println("Коллекция после удаления десятого элемента: " + arr);

        Iterator<Integer> i = arr.iterator();

        // удаление элемента по определенным условиям
        for ( ; i.hasNext();) {
            Integer element = i.next();
            if (element % 2 == 0) {
                i.remove();
            }
        }
        System.out.println("Коллекция после удаления всех четных элементов: " + arr);

        Integer el = arr.get(5);
        System.out.println("6 по счету элемент коллекции: " + el);

        arr.clear();
        System.out.println("Очищенная коллекция: " + arr);

    }
}
