package Lesson2;

public class Array2 {
    public static void main(String[] args) {

        int[] arr = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};

        //Функция реверсирования массива

        int a = 0; //
        int b = arr.length - 1;
        int c;

        while (a < b) {
            c = arr[a];
            arr[a] = arr[b];
            arr[b] = c;
            a++;
            b--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
