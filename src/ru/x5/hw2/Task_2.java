package ru.x5.hw2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        //2. Ввести целое трехзначное число в консоли и найти сумму цифр этого трехзначного числа
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        while(number / 10 != 0 || number % 10 != 0){
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
    }
}
