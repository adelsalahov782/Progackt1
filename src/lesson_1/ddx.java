package lesson_1;

public class ddx {
    public static void main(String[] args) {
        byte x = 1;
        byte y = 1;
        System.out.println("4) Таблица умножения 10x10:");
        while (x <= 10) {
            while (y <= 10) {
                System.out.print(x * y + " ");
                y++;
            }
            y = 1;
            x++;
            System.out.println();
        }
    }
}
