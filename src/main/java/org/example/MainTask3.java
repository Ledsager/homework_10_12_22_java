package org.example;

import java.util.Scanner;

public class MainTask3 {
    public static void main(String[] args) {
        // Дана последовательность N целых чисел. Найти сумму простых чисел.
        int sum = 0, n, numA, numB;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number of elements");
        n = scanner.nextInt();
        System.out.println("input elements");
        for (int i = 0; i < n; i++) {
            if (isPrime(numA = scanner.nextInt())) {
                sum += numA;
            }
        }
        scanner.close();
        System.out.println(sum);
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }
}
