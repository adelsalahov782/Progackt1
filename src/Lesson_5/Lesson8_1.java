package Lesson_5;

import java.util.Scanner;

public class Lesson8_1 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int array[] = new int[]{10, 11, 88, 2, 12, 120, 24, 67, 57, 345};

        // Вызов метода getMax () для получения максимального значения
        int max = getMax(array);
        System.out.println("Maximum Value is: " + max);
    }

    private static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i=1; i < inputArray.length; i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }
}

