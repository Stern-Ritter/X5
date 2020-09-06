package ru.x5.hw2;

public class Task_9 {
    public static void main(String[] args) {
        int [] arr = {15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};
        int [] arrRev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrRev[arr.length - 1 - i] = arr[i];
        }
        for (int i = 0; i < arrRev.length; i++) {
            System.out.print(arrRev[i] + " ");
        }
    }
}
