package ru.x5.hw2;

public class Task_8 {
    public static void main(String[] args) {
        int [] arr = {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
        int max = arr [0];
        int sumPos = 0;
        int sumNeg = 0;
        int countPos = 0;
        int countNeg =0;
        int sumNegEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] > 0){
                sumPos += arr[i];
                countPos++;
            } else if(arr[i] < 0){
                if(arr[i] % 2 == 0){
                    sumNegEven += arr[i];
                }
                sumNeg += arr[i];
                countNeg++;
            }
        }
        System.out.println("Максимальное значение: " + max);
        System.out.println("Cумма положительных элементов: " + sumPos);
        System.out.println("Cумма четных отрицательных элементов: " + sumNegEven);
        System.out.println("Количество положительных элементов: " + countPos);
        System.out.println("Cреднее арифметическое отрицательных элементов: " + ((double)sumNeg / countNeg));
    }
}
