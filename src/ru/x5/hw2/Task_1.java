package ru.x5.hw2;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        // 1. Ввести целое число в консоли и вывести на экран последнюю цифру введенного числа.
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(number % 10);
    }
}
