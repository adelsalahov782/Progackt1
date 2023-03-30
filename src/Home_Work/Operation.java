package Home_Work;

import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {

        // Exp.1.

        int age = 7;
        if (age < 5) {
            System.out.println(" Число меньше 5 ");
        } else if (age > 5) {
            System.out.println(" Число больше 5 ");
        } else if (age == 5) {
            System.out.println("Чило равно 5");
        }


        //Exp.3.

        int seanson = 13;
        switch (seanson) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Нет такого времени года");
                break;


        }


        // Exp.6.
        int a = 1, b = 1, c = 1;
        int summ1 = a + b;
        int summ2 = a + c;
        int summ3 = b + c;
        if (summ1 > c && summ2 > b && summ3 > a) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }

        //Exp.2.
        int x = 77;
        {
            if (x >= 50 && x <= 100) {
                System.out.println("Число содержится в интервале.");
            } else {
                System.out.println("Число не содержится в интервале.");
            }
        }

        // Exp.7.
        int trafficlight = 44;
        int res = trafficlight % 5;
        if ( res < 3) {
            System.out.println("Зеленый");
        } else if (res < 3 && res < 4) {
            System.out.println("Желтый");
        } else if (res <= 4 && res <= 5) {
            System.out.println("Красный");
        } else if (res <= 5 && res <= 6) {
            System.out.println("Зеленый");
        }


        //Exp.4

        int number = -4;
        if (number >= 0) {
            number = number * 2;
            System.out.println(number);
        } else if (number <= 0) {
            number = number + 1;
            System.out.println(number);
        } else if (number == 0) {
            System.out.println(number);
        }


        //Exp.5.
        Scanner sca = new Scanner(System.in);
        int years = sca.nextInt();
        int days1 = 366;
        int dayse = 365;

        if ((years % 400 == 0) || ((years % 4 == 0) && (years % 100 != 0))) {
            System.out.println("количество дней в году: 366");
        } else {
            System.out.println("количество дней в году: 365");
        }

    }
}


