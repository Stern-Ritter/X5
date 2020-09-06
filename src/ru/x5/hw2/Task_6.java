package ru.x5.hw2;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String zero = "нулевое число";
        String even = "";
        String pos = "";
        if (number == 0){
            System.out.println(zero);
        } else {
            if (number < 0) {
                pos = "отрицательное";
            } else {
                pos = "положительное";
            }
            if (number % 2 == 0){
                even = "четное";
            } else {
                even = "нечетное";
            }
            System.out.println(pos + " " + even + " число");
        }
    }
}
