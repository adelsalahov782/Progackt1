package Home_Work;
import java.util.Scanner;

public class cycle {

    public static void main(String[] args) {
        int m = 2;
        int n = 4;
        for (int i = 0; i < m; i++) {
            for (int y = 0; y < n; y++) {
                System.out.print("8");
            }
            int y = 0;
            System.out.println("");
        }


        for (int i = 0; i < 10; i++) {
            int t = 1 + i;
            for (int r = 0; r < t; r++)
                System.out.print("8");
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);


        String name = scanner.nextLine();

            System.out.println("Меня зовут: " + name + "");



    }
}
