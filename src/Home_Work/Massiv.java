package Home_Work;

import java.util.Scanner;

public class Massiv {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Exp.1.");
        // exp.1.

        String[] word = new String[10];
        System.out.println(" Введите 8 строк: ");
        for (int i = 0; i < 8; i++) {
            word[i] = sca.nextLine();
        }
        System.out.println(" Содержимое массива в обратном порядке: ");
        for (int i = word.length - 1; i >= 0; i--) {
            System.out.println(word[i]);

        }
        System.out.println("-------------");
        System.out.println("Exp.2.");

        // exp.2.

        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        System.out.println("Введите 10 чисел: ");

        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
        }

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)

                max = array[i];
        }
        System.out.println("Максимальное число: " + max);

        //
    }
}


