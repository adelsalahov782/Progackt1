package Lesson_3;

import java.util.Scanner;

public class Lesso_6 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
       // String w = "rock";
       // char [] str = {'d', 'f', 'r'};
        /*length() - возвращает длину строки

         concat(): объединяет строки / +=

         equals(): сравнивает строки с учетом регистра

         equalsIgnoreCase(): сравнивает строки без учета регистра

         startsWith(): определяет, начинается ли строка с подстроки

         endsWith(): определяет, заканчивается ли строка на определенную подстроку

         String replace(char oldChar, char newChar)
         Возвращает новую строку, в результате, заменив все вхождения oldChar в этой строке на newChar.

         String[] split(String regex)
         Разделяет эту строку, окружая данным регулярным выражением.

         trim(): удаляет начальные и конечные пробелы

         toLowerCase(): переводит все символы строки в нижний регистр

         toUpperCase(): переводит все символы строки в верхний регистр
         **/

        String st = "Hello word";
        //System.out.println(st.Lenght());
        String st1 = st.concat( "!!!!!!!!!!"); // добавление - concat
        st1 += "&&&&&";
        System.out.println(st1);

        String stt = "Hello wordd";
        System.out.println(st.equals(stt)); //сравнение - st.equals(stt)

        String stringForExample; // Camel case
        String string_for_example; //Snipe case

        String stringForExamplecase = "dabl";
        String stringForExamplecase1 ="dabl";
        System.out.println(stringForExamplecase1.equals(stringForExamplecase));

        System.out.println(stt.startsWith("Hello"));
        System.out.println(st1.endsWith("!")); // Ставит знаки куда указано
        String newSt1 = st1.replace("!" , "?"); // Замена знаков
        System.out.println(newSt1);
        String st3 = "Hello World";
        String trim = st3.trim();
        System.out.println(trim);


        String sttt = stringForExamplecase.toUpperCase();





    }
}
