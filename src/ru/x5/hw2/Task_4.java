package ru.x5.hw2;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        /* 4. Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1; если отрицательным,
        то вычесть из него 2; если нулевым, то заменить его на 10. Вывести полученное число. */
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if ( number > 0){
            number++;
        } else if (number < 0){
            number -= 2;
        } else {
            number = 10;
        }
        System.out.println(number);
    }
}
