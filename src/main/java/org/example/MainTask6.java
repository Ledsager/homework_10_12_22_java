package org.example;

import java.util.Scanner;

public class MainTask6 {
    public static void main(String[] args) {
//        Дан массив целых чисел. Заменить отрицательные элементы
//        на сумму индексов двузначных элементов массива.
        int sum = 0, n, countDouble = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input size");
        n = scanner.nextInt();
        int[] mass = new int[n];
        System.out.println("input elements");
        for (int i = 0; i < n; i++) {
            mass[i] = scanner.nextInt();
            if (((mass[i] / 100) == 0) && (((mass[i] >= 10) && (mass[i] <= 99)) || ((mass[i] <= -10) && (mass[i] >= -99)))) {
                countDouble += i;
                System.out.println(countDouble);
            }
        }
        scanner.close();
        for (int i = 0; i < n; i++) {
            if (mass[i] < 0) {
                mass[i] = countDouble;
            }
            System.out.println(mass[i]);
        }
    }
}
