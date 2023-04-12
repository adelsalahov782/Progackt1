package Home_Work;

import java.util.Scanner;

public class Massiv {
    public static void main(String[] args) {
//        Scanner sca = new Scanner(System.in);
//        System.out.println("Exp.1.");
//        // exp.1.
//
//        String[] word = new String[10];
//        System.out.println(" Введите 8 строк: ");
//        for (int i = 0; i < 8; i++) {
//            word[i] = sca.nextLine();
//        }
//        System.out.println(" Содержимое массива в обратном порядке: ");
//        for (int i = word.length - 1; i >= 0; i--) {
//            System.out.println(word[i]);
//
//        }
//        System.out.println("-------------");
//        System.out.println("Exp.2.");
//
//        // exp.2.
//
//        Scanner sc = new Scanner(System.in);
//        int array[] = new int[10];
//        System.out.println("Введите 10 чисел: ");
//
//        for (int i = 0; i < 10; i++) {
//            array[i] = sc.nextInt();
//        }
//
//        int max = array[0];
//
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > max)
//
//                max = array[i];
//        }
//        System.out.println("Максимальное число: " + max);
//        System.out.println("-------------");
//        System.out.println("Exp.3.");
//
//        // exp.3.
//        Scanner numbers = new Scanner(System.in);
//        int[] number = new int[10];
//        String[] str = new String[10];
//        System.out.println("Введите 10 строк:");
//        for (int i = 0; i < str.length; i++) {
//            String st = numbers.nextLine();
//            str[i] = st;
//        }
//        System.out.println("Вывести содержимое массива чисел:");
//        for (int i = 0; i < number.length; i++) {
//            number[i] = str[i].length();
//        }
//        for (int j: number) {
//            System.out.println(j);
//        }
//        System.out.println("-------------");
//        System.out.println("Exp.4.");

        // exp.4.

        Scanner numb = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Введите 10 чисел: ");
        for (int i = 0; i < arr.length; i ++) {
            arr[i] = numb.nextInt();
        }

        System.out.println("Массивы в обратном порядке:");
        for (int i = arr.length - 1; i >= 0; i --) {
            System.out.println(arr[i]);
        }
        System.out.println("-------------");
        System.out.println("Exp.5.");

        // exp.5.

//        Scanner scanner = new Scanner(System.in);
//        int [] array1 = new int[20];
//        System.out.println ("Введите 20 чисел: ");
//        int [] array2 = new int[10];
//        int [] array3 = new int[10];
//
//        Scanner scanner1  =  new Scanner(System.in);
//        for (int i = 0; i < array1.length; i++) {
//            array1[i] = scanner1.nextInt();
//        }
//        System.out.println ("Вывести второй маленький массив на экран: ");
//
//        for (int i = 0; i < array2.length; i++) {
//            array2 [i] = array1[i];
//            array3 [i] = array1[i + 10];
//            System.out.println(array3[i]);
//        }
//        System.out.println("-------------");
//        System.out.println("Exp.6.");
//        // exp.6.
//
//        Scanner array5 = new Scanner(System.in);
//        int[] list10 = new int[20];
//        System.out.println("Введите 20 чисел: ");
//
//        for (int i = 0; i < list10.length; i++) {
//            list10[i] = array5.nextInt();
//        }
//        int max1 = list10[0];
//        for (int j : list10) {
//            if (max1 < j)
//                max1 = j;
//        }
//        int min1 = max1;
//        for (int j : list10) {
//            if (min1 > j)
//                min1 = j;
//        }
//        System.out.println("Максимальное и минимальное числа:");
//        System.out.print(max1 + " " + min1);
//
//        System.out.println("-------------");
//        System.out.println("Exp.7.");
//        // exp.7.
//        Scanner number1 = new Scanner(System.in);
//        int[] array4 = new int[20];
//        System.out.println("Введите 20 чисел: ");
//        for (int i = 0; i < array4.length; i++) {
//            array4[i] = number1.nextInt();
//        }
//        int sort;
//        System.out.println("Вывод чисел в убывающем порядке:");
//        for (int i = 0; i < array4.length - 1; i++) {
//            for (int w = 1; w < array4.length - i; w++) {
//                if (array4[w - 1] > array4[w]) {
//                    sort = array4[w];
//                    array4[w] = array4[w - 1];
//                    array4[w - 1] = sort;
//                }
//            }
//        }
//        for (int i = array4.length - 1; i >= 0; i--) {
//            System.out.println(array[i] + " ");
//        }
    }
}


