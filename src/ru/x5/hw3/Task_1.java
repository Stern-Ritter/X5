package ru.x5.hw3;


public class Task_1 {
    public static void main(String[] args) {
        Phone firstPhone = new Phone(4444444, "A", 400);
        Phone secondPhone = new Phone(7777777, "B", 350);
        Phone thirdPhone = new Phone(9999999, "C", 450);

        firstPhone.receiveCall("Евгений");
        secondPhone.receiveCall("Артём");
        thirdPhone.receiveCall("Дмитрий");
        System.out.println(firstPhone.getNumber());
        System.out.println(secondPhone.getNumber());
        System.out.println(thirdPhone.getNumber());

        firstPhone.receiveCall("Евгений", 2222222);
        secondPhone.receiveCall("Артём", 3333333);
        thirdPhone.receiveCall("Дмитрий", 5555555);

        int number = 1111111;
        int [] numbers = {2222222, 3333333, 4444444, 5555555, 7777777};
        firstPhone.sendMessage(number);
        firstPhone.sendMessage(numbers);
    }
}

    class Phone {
        private int number;
        private String model;
        private double weight;

        public int getNumber() {
            return number;
        }

        public String getModel() {
            return model;
        }

        public double getWeight() {
            return weight;
        }

        public Phone(int number, String model, double weight) {
            this(number, model);
            this.weight = weight;
        }

        public Phone(int number, String model) {
            this.number = number;
            this.model = model;
        }

        public Phone() {
        }

        public void receiveCall(String nameCall) {
            System.out.printf("Звонит %s.\n", nameCall);
        }

        public void receiveCall(String nameCall, int numberCall) {
            System.out.printf("Звонит Имя: %s, Номер: %s.\n", nameCall, numberCall);
        }

        public void sendMessage(int... arr) {
            for (int number : arr) {
                System.out.println(number);
            }
        }
    }



