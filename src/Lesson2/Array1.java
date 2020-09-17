package Lesson2;

public class Array1 {

   public static int maxValue() {
        int[] arr = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int sumPosValues() {
        int[] arr = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }

    public static int sumNegValues() {
        int[] arr = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 & arr[i] % 2 != 0) {
                sum1 = sum1 + arr[i];
            }
        }
        return sum1;
    }

    public static int quantityPosValues() {
        int[] arr = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public static float ariphmeticAverageNegValues() {
        int[] arr = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        float sumNegative = 0;
        float count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                sumNegative = sumNegative + arr[i];
                count++;
            }
        }
        float ariphmAverage = sumNegative / count;
        return ariphmAverage;
    }

    public static void main(String[] args) {

     System.out.println("Максимальное значение в массиве: " + maxValue());
     System.out.println("Сумма всех положительных элементов массива: " + sumPosValues());
     System.out.println("Сумма четных отрицательных элементов массива: " + sumNegValues());
     System.out.println("Количество положительных элементов в массиве: " + quantityPosValues());
     System.out.println("Среднее арифметическое отрицательных значений массива: " + ariphmeticAverageNegValues());

    }
}
