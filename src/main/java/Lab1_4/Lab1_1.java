public class Lab1_1 {
    public static void main(String[] args) {

             //Задание_1 добавлено % - остаток от деления на число в переменной result
       /*
      //  1) Объявите целочисленные переменные x, y, c, d
//        Проинициализируете каждую переменную с помощью генератора псевдослучайных чисел (см. ниже)
//        Например: int a = ??? Math.round(Math.random()*9)
//        Обратите внимание, что Math.round(Math.random()*9) возвращает тип long.
//        Подумаете какую операцию нужно осуществить, что бы проинициализировать целочисленную переменную c помощью генератора
//        Напишите условие (выражение, результат которого – boolean),
//        которое истинно, если x делится на 2 и y делится на 4, либо с делится на 3, а d не делится на 3.

        //boolean result = ...
 */

        int x = (int) Math.round(Math.random() * 9);
        int y = (int) Math.round(Math.random() * 9);
        int c = (int) Math.round(Math.random() * 9);
        int d = (int) Math.round(Math.random() * 9);
        boolean result = ((x % 2 == 0) && (y % 4 == 0)) || ((c % 3 == 0) && (d % 3 != 0));

        // Задание_2
        /*
Используя тернарный оператор (конструкция ?:), сравнивая x и y из задачи выше, выведите на консоль текст: "Переменная x больше чем y"

        // System.out.println(...);
 */

        System.out.println(x > y ? "Переменная х больше, чем у" : "");

        // Задание_3 добавлен switch
        //        3) По номеру времени года выведите его название. Например, для 0 – вывести «зима», для 3 – «лето».
//        Для вывода используете System.out.println("ТЕКСТ ДЛЯ ВЫВОДА");

        int number_of_season = (int) Math.round(Math.random() * 3);
        switch (number_of_season) {
            case 0:
                System.out.println("зима");
                break;
            case 1:
                System.out.println("весна");
                break;
            case 2:
                System.out.println("лето");
                break;
            case 3:
                System.out.println("осень");
                break;
        }

        // Задание_4
        //        4*) Объявите целочисленую переменную, проинцициализурете с помощью генератора псевдослучайных числе (как в первом задании)
//        Вывведите на консоль факториал этой переменной (произведение всех чисел, от 1 и до числа. Например, факториал 5 = 1 * 2 * 3 * 4 * 5)

        int factorial = 1;
        int f = (int) Math.round(Math.random() * 9);
        if (f != 0) {
            for (int i = 1; i <= f; i++) {
                factorial = factorial * i;
            }
            System.out.println("факториал " + f + " = " + factorial);
        } else System.out.println("факториал 0 = 1");

        // Задание_5 println запускается 1 раз, используется string - как результат switch-условий
        //        5) Используя генератор псевдослучайных чисел (long rand = Math.round(Math.random() * макс_число)),
//        который генерирует целые числа от 0 до макс_число, написать генератор супергеройских имен.
//        Для этого сгенерировать два числа, и, пользуюсь таблицей, вывести получившееся имя с эпитетом. Примерная таблица:
//        Эпитет:
//        0 - РАДИОАКТИВНЫЙ, 1 - ГРЕЧНЕВЫЙ, 2 - ДЕМОНИЧЕСКИЙ,  3 - ПРИЗРАЧНЫЙ, 4 - ОЗОРНОЙ 5 - ПРИЗРАЧНЫЙ 6 - КОСМИЧЕСКИЙ 7 - ЗВЕЗДНЫЙ 8 - СЕКСУАЛЬНЫЙ 9 - НЕПОБЕДИМЫЙ
//
//        Имя:
//        0 - КАПИТАН, 1 - ЭЛЬФ, 2 - ПИНГВИН, 3 - ИНДЕЕЦ, 4 - ГНОМ, 5 - УПЫРЬ, 6 - БОРОДАЧ, 7 - БОБЕР, 8 - КОРОЛЬ, 9 - ТОЛСТОПУЗ, 10 - КИЛЛЕР
//
//        Например, выпало 6 и 9, имя - Космический Толстопуз. Можно использовать свои таблицы.
//         Выведите минимум 10 комбинаций (используя цикл)

        int index1, index2;
        String str1 = "";
        for (int i = 1; i <= 10; i++) {
            index1 = (int) Math.round(Math.random() * 9);
            index2 = (int) Math.round(Math.random() * 9);
            switch (index1) {
                case 0:
                    str1 = "РАДИОАКТИВНЫЙ";
                    break;
                case 1:
                    str1 = "ГРЕЧНЕВЫЙ";
                    break;
                case 2:
                    str1 = "ДЕМОНИЧЕСКИЙ";
                    break;
                case 3:
                    str1 = "ПРИЗРАЧНЫЙ";
                    break;
                case 4:
                    str1 = "ОЗОРНОЙ";
                    break;
                case 5:
                    str1 = "КОСМИЧЕСКИЙ";
                    break;
                case 6:
                    str1 = "ЗВЕЗДНЫЙ";
                    break;
                case 7:
                    str1 = "СЕКСУАЛЬНЫЙ";
                    break;
                case 8:
                    str1 = "НЕПОБЕДИМЫЙ";
                    break;
                case 9:
                    str1 = "ИНТЕРЕСНЫЙ";
                    break;
            }
            switch (index2) {
                case 0:
                    str1 = str1 + " КАПИТАН";
                    break;
                case 1:
                    str1 = str1 + " ЭЛЬФ";
                    break;
                case 2:
                    str1 = str1 + " ПИНГВИН";
                    break;
                case 3:
                    str1 = str1 + " ИНДЕЕЦ";
                    break;
                case 4:
                    str1 = str1 + " ГНОМ";
                    break;
                case 5:
                    str1 = str1 + " УПЫРЬ";
                    break;
                case 6:
                    str1 = str1 + " БОРОДАЧ";
                    break;
                case 7:
                    str1 = str1 + " БОБЕР";
                    break;
                case 8:
                    str1 = str1 + " КОРОЛЬ";
                    break;
                case 9:
                    str1 = str1 + " ТОЛСТОПУЗ";
                    break;
            }
            System.out.println(str1);
        }
    }
}
