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
        Temperature celsium = new Temperature(a);
//        double b=22.2;
//        b = celsium.temperCelsius(a);
        System.out.println("Temperature Celsius =  " + a);
        System.out.println("Temperature Kelvin =  " + celsium.tempKelvin(celsium));
        System.out.println("Temperature Fahrenheit =  " + celsium.tempFahrenheit(celsium));
    }
}