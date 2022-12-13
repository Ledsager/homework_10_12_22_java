package org.example;

import java.util.Scanner;

public class MainTask2 {
    public static void main(String[] args) {
        // Дана последовательность целых чисел,
        // оканчивающаяся нулем. Найти сумму положительных чисел,
        // после которых следует отрицательное число.
        int sum = 0, numA, numB;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number of elements");
        System.out.println("input elements");
        numA = scanner.nextInt();
        while ((numB = scanner.nextInt()) != 0) {
            if ((numA > 0) && (numB < 0)) {
                sum++;
            }
            numA = numB;
        }
        scanner.close();
        System.out.println(sum);
    }
}

