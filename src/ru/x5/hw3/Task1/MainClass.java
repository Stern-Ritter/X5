package ru.x5.hw3.Task1;

public class MainClass {
    public static void main(String[] args) {
        Phone [] phones = {new Phone(4444444, "A", 400), new Phone(7777777, "B", 350),
                new Phone(9999999, "C", 450)};
        for (Phone ph : phones) {
            ph.receiveCall("Евгений");
        }
        for (Phone ph : phones) {
            System.out.println(ph.getNumber());
        }
        for (Phone ph : phones) {
            ph.receiveCall("Евгений", 2222222);
        }

        int number = 1111111;
        int [] numbers = {2222222, 3333333, 4444444, 5555555, 7777777};
        phones[0].sendMessage(number);
        phones[0].sendMessage(numbers);
    }
}