package org.example;

import java.util.Scanner;

public class MainTask1 {
    public static void main(String[] args) {
        //Дана последовательность N целых чисел. Найти количество положительных чисел,
        // после которых следует отрицательное число.
        int sum = 0, n, numA, numB;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number of elements");
        n = scanner.nextInt();
        System.out.println("input elements");
        numA = scanner.nextInt();
        for (int i = 1; i <= n - 1; i++) {
            numB = scanner.nextInt();
            if ((numA > 0) && (numB < 0)) {
                sum++;

            }
            numA = numB;
        }
        scanner.close();
        System.out.println(sum);
    }
}
