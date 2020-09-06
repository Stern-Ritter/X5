package ru.x5.hw2;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
       //5. Ввести три целых числа с консоли. Вывести на экран наименьшее из них.
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        if(first <= second && first <= third){
            System.out.println(first);
        } else if (second <= third){
            System.out.println(second);
        } else {
            System.out.println(third);
        }
    }
}
