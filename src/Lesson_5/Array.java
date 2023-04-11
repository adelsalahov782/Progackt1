package Lesson_5;

public class Array {
    public static void main(String[] args) {
//        byte a = 5;
//        byte [] arr1 = new byte[7];
//        byte [] arr2 = {12, 14, 16, 21};
//        arr1 [0] = 5;
//        arr1 [1] = 56;
//        arr1 [2] = 12;
//        arr1 [3] = 15;
//        arr1 [4] = 35;
//        arr1 [5] = 54;
//        arr1 [6] = 25;
//        for (int i = 0; i <= 6 ; i++) {
//
//                System.out.println("On index: " + i + "; set value: " + arr1[i] + ".");
//
//        }
//
//        for (int  i = 0; i < arr1.length ; i++) {
//            if (i % 2 == 0) {
//                System.out.println(arr1 [i]);
//            }
//        }


        // Task 4.

        int [] array = new int[10];
        for (int i = 0; i < array.length ; i++) {
            array [i] = i;
        }
        System.out.println(array [7]);
    }
}
