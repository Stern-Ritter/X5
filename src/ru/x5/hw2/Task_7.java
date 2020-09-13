package ru.x5.hw2;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String moscow = "Москва";
        String rostov = "Ростов";
        String krasnodar = "Краснодар";
        String kirov = "Киров";
        double moscowCost = 4.15;
        double rostovCost = 1.98;
        double krasnodarCost = 2.69;
        double kirovCost = 5.00;
        double minutes = 10d;

        switch (number){
            case 905:
                System.out.println(moscow + ". Стоимость разговора: " + moscowCost * minutes);
                break;
            case 194:
                System.out.println(rostov + ". Стоимость разговора: " + rostovCost * minutes);
                break;
            case 491:
                System.out.println(krasnodar + ". Стоимость разговора: " + krasnodarCost * minutes);
                break;
            case 800:
                System.out.println(kirov + ". Стоимость разговора: " + kirovCost * minutes);
                break;
            default:
                System.out.println("Некорректный код города.");
        }
    }
}
