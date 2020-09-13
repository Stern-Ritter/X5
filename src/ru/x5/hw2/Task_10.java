package ru.x5.hw2;

public class Task_10 {
    public static void main(String[] args) {
        int[] arr = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        nullShift(arr);
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void nullShift(int[] arr){
        int tale = arr.length - 1;
        for (int i = 0; i < arr.length && tale - i > 1; i++) {
            if (arr[i] == 0) {
                for (int j = tale; j > 0; j--, tale--) {
                    if (arr[j] != 0) {
                        swap(arr, i, j);
                        break;
                    }
                }
            }
        }
    }
}