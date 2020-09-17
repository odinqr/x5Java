package Lesson2;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {

        int[] arr = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};

        int a = arr.length - 1;

        for (int i = a; i >= 0; i--) {
            if (arr[i] == 0) {
                for (int j = i; j < a; j++) {
                    if (arr[j+1] == 0 || j == a) {
                        break;
                    }
                    else {
                        int b = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = b;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
