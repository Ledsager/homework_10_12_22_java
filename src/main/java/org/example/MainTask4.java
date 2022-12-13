package org.example;

import java.util.Scanner;

public class MainTask4 {
    public static void main(String[] args) {
//        Дана последовательность из N целых чисел.
//        Верно ли, что последовательность является возрастающей.
        int n, numA, numB;
        boolean sequence = Boolean.TRUE;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number of elements");
        n = scanner.nextInt();
        System.out.println("input elements");
        numA = scanner.nextInt();
        for (int i = 1; i <= n - 1; i++) {
            numB = scanner.nextInt();
            if ((numB < numA)) {
                sequence = Boolean.FALSE;
            }
            numA = numB;
        }
        scanner.close();
        if (sequence) {
            System.out.println("the sequence increases");
        } else {
            System.out.println("the sequence is decreasing");
        }
    }
}
