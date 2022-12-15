package org.example;

import java.util.Scanner;

public class Main {
//    ООП:
//    Напишите интерфейс Converter для конвертации из градусов по Цельсию в
//    Кельвины, Фаренгейты. У классов наследников необходимо переопределить
//    метод интерфейса, для валидного перевода величин. Метод для конвертации
//    назовите "convertValue".
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру: ");
        double a = scanner.nextInt();
        scanner.close();
        Converter kelvin = new convertKelvin1();
        Converter fahrenheit = new convertFahrenheit1();

        System.out.println("Temperature Celsius =  " + a);
        System.out.println("Temperature Kelvin =  " + kelvin.convertValue(a));
        System.out.println("Temperature Fahrenheit =  " + fahrenheit.convertValue(a));
    }
}