package ru.x5.hw2;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
       //5. Ввести три целых числа с консоли. Вывести на экран наименьшее из них.
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        int [] arr = {first, second, third};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
