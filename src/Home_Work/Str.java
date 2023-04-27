package Home_Work;

import java.util.Objects;
import java.util.Scanner;

public class Str {
    // Д/з от 7.04.2023
    public static void main(String[] args) {
        System.out.println("Exp.1.");
        Scanner scanner10 = new Scanner(System.in);
        String[] srings = new String[100];
        String array;
        int g = 0;
        System.out.println("Введите строки: (пустая строка - конец ввода):");
        do {
            srings[g] = scanner10.nextLine();
            srings[g] = srings[g].toUpperCase();
            array = srings[g];
            if (srings[g].length() % 2 == 1) {
                srings[g] = srings[g].concat(array);
            }
            srings[g] = srings[g].concat(array);
            g++;
        } while (!Objects.equals(srings[g - 1], "") && g < 50);
        System.out.println("Полученные слова:");
        for (int j = 0; j < g; j++) {
            System.out.println(srings[j]);
        }
        System.out.println("Exp.2.");
        System.out.println("-------");

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 5 строк:");
        String[] input = new String[5];
        for (int i = 0; i < input.length; i++) {
            input[i] = scan.nextLine();
        }
        String minLine = input[0];
        String maxLine = input[0];
        for (int j = 1; j < input.length; j++) {
            if (minLine.length() > input[j].length()) {
                minLine = input[j];
            }
            if (maxLine.length() < input[j].length()) {
                maxLine = input[j];
            }
        }
        System.out.println("Максимальная строка - " + maxLine +  " - длина - " + maxLine.length());
        System.out.println("Минимальная строка  - " + minLine +  " - длина - " + minLine.length());

        System.out.println("--------");
        System.out.println("Exp.3.");
        Scanner sca = new Scanner(System.in);

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
        System.out.println("Exp.4.");
        Scanner numbers = new Scanner(System.in);
        int[] number = new int[10];
        String[] str = new String[10];
        System.out.println("Введите 10 строк:");
        for (int i = 0; i < str.length; i++) {
            str[i] = numbers.nextLine();
        }
        System.out.println("Вывести содержимое массива чисел:");
        for (int i = 0; i < number.length; i++) {
            number[i] = str[i].length();
            System.out.println(number[i]);
        }

        System.out.println("-------------");
        System.out.println("Exp.5.");

        String[] strings = new String[6];
        System.out.println("Введите 6 строк: ");
        Scanner scanner = new Scanner(System.in);
        for (int v = 0; v < strings.length; v++) {
            strings[v] = scanner.nextLine();
        }
        for (int v = strings.length - 1; v >= 0; v--) {
            for (int l = 0; l < strings.length; l++) {
                if (v != l && strings[v] != null) {
                    if (strings[v].equals(strings[l])) {
                        strings[v] = null;
                    }
                }
            }
        }
        System.out.println("Массив без повторяющихся строк:");
        for (String string : strings) {
            System.out.println(string);
        }

    }
}

