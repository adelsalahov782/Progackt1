package Home_Work;

import java.util.Scanner;

public class cycle {

    public static void main(String[] args) {


        // Exp.1.

        System.out.println("Прямоугольник");
        Scanner sca = new Scanner(System.in);
        int m = sca.nextInt();
        int n = sca.nextInt();
        for (int i = 0; i < m; i++) {
            for (int y = 0; y < n; y++) {
                System.out.print("8");
            }
            int y = 0;
            System.out.println("");
        }

        // Exp.2.
        System.out.println("----------------");
        System.out.println("Прямоугольный треугольник");
        for (int i = 0; i < 10; i++) {
            int t = 1 + i;
            for (int r = 0; r < t; r++)
                System.out.print("8");
            System.out.println();
        }

        // Exp.5.
        System.out.println("----------------");
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Введите имя: ");
        String name = scanner.nextLine();
        System.out.println(" Укажите вашу дату рождения (день, месяц, год)");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        {
            System.out.println("Меня зовут: " + name + "");
            System.out.println("Я родился/родилась: " + day + "." + month + "." + year + "");
        }
        System.out.println("----------------");

        // Exp.4.
        System.out.println(" Таблица умножения");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++)
                System.out.print(i * j + "  ");
            System.out.println();
        }
        System.out.println("-----------------");

        // Exp.3.
        System.out.println("Три числа");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if (num1 == num2 && num2 == num3) {
            System.out.println(num1);
        } else if (num1 == num2 && num2 != num3) {
            System.out.println(num1);
        } else if (num1 == num3 && num1 != num2) {
            System.out.println(num1);
        } else if (num2 == num3 && num2 != num1) {
            System.out.println(num2);
        } else if (num1 > num2 && num2 > num3) {
            System.out.println(num2);
        } else if (num3 > num2 && num2 > num1) {
            System.out.println(num2);
        } else if (num1 > num3 && num3 > num2) {
            System.out.println(num3);
        } else if (num2 > num3 && num3 > num1) {
            System.out.println(num3);
        } else if (num3 > num1 && num1 > num2) {
            System.out.println(num1);
        } else if (num2 > num1 && num1 > num3) {
            System.out.println(num1);
        }

    }
}
