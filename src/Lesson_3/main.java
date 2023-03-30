package Lesson_3;

public class main {
    public static void main(String[] args) {
        // 1 - Primitive type
        // 2 - Linked types written JDK
        // 3 - Linken Selfwritten type

        /**Арифметические операторы
         +  Складывает значения по обе стороны от оператора
         -  Вычитает правый операнд из левого операнда
         *  Умножает значения по обе стороны от оператора
         /  Оператор деления делит левый операнд на правый операнд
         %  Делит левый операнд на правый операнд и возвращает остаток
         ++  Инкремент - увеличивает значение операнда на 1 х++ постфиксная, ++х префиксная
         --  Декремент - уменьшает значение операнда на 1  х-- постфиксная, --х префиксная
         **/

        int d = 10 % 2; // 10 = (9 / 3) + 1
        System.out.println(d);


        int c = 7;

        c = 20;

        c++;
        System.out.println(c);

        /**Операторы сравнения

         ==  Проверяет, равны или нет значения двух операндов, если да,
         то условие становится истинным  (A == B) – не верны

         !=  Проверяет, равны или нет значения двух операндов,
         если значения не равны, то условие становится истинным  (A != B) – значение истинна

         >  Проверяет, является ли значение левого операнда больше,
         чем значение правого операнда, если да, то условие становится истинным  (A > B) – не верны

         <  Проверяет, является ли значение левого операнда меньше,
         чем значение правого операнда, если да, то условие становится истинным  (A < B) – значение истинна

         >=  Проверяет, является ли значение левого операнда больше или равно значению правого операнда,
         если да, то условие становится истинным  (A >= B) – значение не верны

         <=  Проверяет, если значение левого операнда меньше или равно значению правого операнда,
         если да, то условие становится истинным  (A <= B) – значение истинна
         */

        boolean bool = 5 == 5;
        System.out.println(bool);

        /**Логические операторы

         &&  Называется логический оператор «И». Если оба операнда являются не равны нулю, то условие становится истинным
         ||  Называется логический оператор «ИЛИ». Если любой из двух операндов не равен нулю, то условие становится истинным
         !  Называется логический оператор «НЕ». Использование меняет логическое состояние своего операнда.
         Если условие имеет значение true, то оператор логического «НЕ» будет делать false
         */

        boolean bool2 = 10 == 5 && 10 > 6;
        System.out.println(bool2);

        boolean bool3 = 10 == 5 || 10 > 6;
        System.out.println(bool3);

        boolean bool4 = 10 == 5 || 10 > 6;
        System.out.println(!bool4);


        // операторы присвоения
        // += c инкремитированием
        // *+ c инкремитированием
        // /= c инкремитированием
        // -= c инкремитированием

        int f = 10;


        System.out.println(f);


        /**if (условие) {
         //действие(-я), которые выполняются, если условие истинно;
         }
         else if (условие) {
         //действие(-я), которые выполняются, если условие истинно;
         }
         else if (условие) {
         //действие(-я), которые выполняются, если условие истинно;
         }
         else {
         //действие(-я), которые выполняются, если условие истинно;
         }
         */

        int age = 10;

        if (age > 13) {
            System.out.println(" Your age is ok");
        } else if (age < 13) {
            System.out.println(" Your age is no");


            /**switch (ВыражениеДляВыбора) {
             case  (Значение1):
             Код1;
             break;
             case (Значение2):
             Код2;
             break;
             ...
             case (ЗначениеN):
             КодN;
             break;
             default:
             КодВыбораПоУмолчанию;
             break;
             }
             */

            int matRate = 5;
            switch (matRate) {
                case 5 :
                    System.out.println();


            }


















        }


    }


}
