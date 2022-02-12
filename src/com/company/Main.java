package com.company;

import java.util.Arrays;

public class Main {

    // Массив
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        // Задача 1
        int[] arr = generateRandomArray();
        int summaMonth = 0;
        for (int i : arr) {
            summaMonth += i;
        }
        System.out.println("Сумма трат за месяц составила " + summaMonth + " рублей");

        // Задача 2
        int maxSummaDay = 100_000;
        int minSummaDay = 200_000;
        for (int i : arr) {
            if (maxSummaDay < i) {
                maxSummaDay = i;
            }
            if (minSummaDay > i)
                minSummaDay = i;
        }
        System.out.println("Минимальная сумма трат за день составила " + minSummaDay + " рублей. Максимальная сумма трат за день составила " + maxSummaDay + " рублей");

        // Задача 3
        float averSpend;
        averSpend = summaMonth / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averSpend + " рублей");

        // Задача 4
        char[] reverseName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseName.length - 1; i >= 0; i--) {
            System.out.print(reverseName[i]);
        }
        System.out.println();

        // Задача 5
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - 1 - i] = 1;
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        // Задача 6
        int[] arr1 = {5, 4, 3, 2, 1};
        int[] arr1Copy = new int[5];
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i <= arr1.length - 1; i++)
            arr1Copy[i] = arr1[arr1.length - i - 1];
        System.out.println(Arrays.toString(arr1Copy));

        // Задача 7
        int[] arr2 = {5, 8, 2, 3, 9};
        int arr2Temp;
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i <= (arr2.length) / 2; i++) {
            arr2Temp = arr2[arr2.length - i - 1];
            arr2[arr2.length - i - 1] = arr2[i];
            arr2[i] = arr2Temp;
        }
        System.out.println(Arrays.toString(arr2));

        // Задача 8
        int[] arr3 = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int sum1 = -2;
        boolean exit = true;
        for (int j = 0; j <= (arr3.length) / 2; j++) {
            for (int i = arr3.length - 1; i >= (arr3.length) / 2; i--) {
                if (arr3[j] + arr3[i] == sum1) {
                    System.out.println(arr3[j] + " " + arr3[i]);
                    exit = false;
                }
                if (!exit) break;
            }
        }


        // Задача 9
        int[] arr4 = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int sum2 = -2;
        Arrays.sort(arr4);
        for (int y = 0; y <= (arr4.length) / 2; y++) {
            for (int g = arr4.length - 1; g >= (arr4.length) / 2; g--) {
                if (arr4[y] + arr4[g] == sum2)
                    System.out.println(arr4[y] + " " + arr4[g]);
            }
        }
    }
}
