package org.example;

import java.util.Scanner;

public class MainTask5 {
    public static void main(String[] args) {
//        Дан массив целых чисел. Найти сумму элементов,
//        у которых последняя и предпоследняя цифры равны.
        int sum = 0, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input size");
        n = scanner.nextInt();
        int[] mass = new int[n];
        System.out.println("input elements");
        for (int i = 0; i < n; i++) {
            mass[i] = scanner.nextInt();
        }
        scanner.close();
        for (int i = 0; i < n; i++) {
            if ((mass[i] % 10) == ((mass[i] / 10) % 10)) {
                sum += mass[i];
            }
        }
        System.out.println(sum);
    }
}
