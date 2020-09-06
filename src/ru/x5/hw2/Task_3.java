package ru.x5.hw2;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
       /*3.Ввести целое число в консоли.  Если оно является положительным, то прибавить к нему 1, в противном
       случае не изменять его. Вывести полученное число. */
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number > 0){
            number++;
        }
        System.out.println(number);

    }
}
