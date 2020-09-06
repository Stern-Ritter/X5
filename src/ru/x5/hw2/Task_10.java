package ru.x5.hw2;

public class Task_10 {
    public static void main(String[] args) {
        int [] arr = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
        int tale = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                for (int j = tale; j > 0 ; j--, tale --) {
                    if(arr[j] != 0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            }

            if (tale - i == 1){
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
