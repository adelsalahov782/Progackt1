package Home_Work;

public class Home1 {
    public static void main(String[] args) {
        // Задача 1. Дано: Хитрый бухгалтер разделил 5 рублей на 2 кассы. Сколько рублей лежит в каждой кассе?
        double ruble = 5;
        double boxoffice = 2;
        double twoboxoffice = ruble / boxoffice;
        System.out.println("Finish " + twoboxoffice);

        // Задача 2. Дано: Стороны квадрата a = 50, b = 20. Найти площадь.
        int a = 50;
        int b = 20;
        int s = a * b;
        System.out.println("Square " + s);

        // Задача 3.  Голодный Вася съедает за 9 минут 3 банана, а сытый за 15 минут,
        //насколько быстрее голодный Вася съедает один банан?
        byte bananas = 3;
        byte hungry = 9;
        byte full = 15;
        int MinutesHungry = hungry / bananas;
        int MinutesFull = full / bananas;
        int minutes = MinutesFull - MinutesHungry;

        System.out.println("FullBananas " + minutes);
    }
}
