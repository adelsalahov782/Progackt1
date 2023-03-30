package lesson_1;

import java.util.Scanner;

public class Operation_7_5 {
    public static void main(String[] args) {

        // Exp.5.
        Scanner sca = new Scanner(System.in);
        int years = sca.nextInt();
        int days1 = 366;
        int dayse = 365;

        if ( (years % 400 == 0) || (years % 4 == 0) && (years % 100 != 0)) {
            System.out.println("количество дней в году: 366");
        } else {
            System.out.println("количество дней в году: 365");
        }

        // Exp.7.

        float time = sca.nextFloat();
        float x = time % 5;
        if (x < 3)
            System.out.println("зелёный");
        if (3 <= x && x < 4)
            System.out.println("жёлтый");
        if (4 <= x && x < 5)
            System.out.println("красный");

    }
}
