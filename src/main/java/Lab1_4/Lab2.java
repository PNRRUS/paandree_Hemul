public class Lab2 {
    /*
             !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
             Коллеги, прошу не списывать друг у друга и не подглядывать! для себя же учимся!
             если это читает кто-то, кроме Дани
             !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

            */
    public static void main(String[] args) {

        //__Task_1
        int[] array_int = new int[(int) Math.round(Math.random() * 9)];
        for (int i = 0; i < array_int.length; i++) {
            array_int[i] = (int) Math.round(Math.random() * 99);
        }
        System.out.println("Task_1");
        ArrayElements(array_int);

        //__Task_2
        double[] array_double = new double[(int) Math.round(Math.random() * 9)];
        for (int i = 0; i < array_double.length; i++) {
            array_double[i] = Math.round(Math.random() * 99);
        }
        System.out.println("Task_2");
        ArrayElements(array_double);

        //__Task_3
        System.out.println("Task_3");
        System.out.println("before reverse");
        ArrayElements(array_int);
        System.out.println("after reverse");
        ArrayElementsReverse(array_int);

        //__Task_4
        float[] array_float = new float[(int) Math.round(Math.random() * 9)];
        for (int i = 0; i < array_float.length; i++) {
            array_float[i] = (float) (Math.random() * 3.4 * (Math.pow(10,38)) - Math.random() * 3.4 * (Math.pow(10,38)));
        }
        System.out.println("Task_4");
        ArrayElementsFloat(array_float);

        //__Task_5
        System.out.println("Task_5");
        String Name = "Pavel";
        System.out.println (politeMethod(Name));

        //__Task_7
        System.out.println("Task_7");
        System.out.println(firstHalf(Name));

        //__Task_8
        System.out.println("Task_8");
        System.out.println(secondHalf(Name));

        //__Task_9
        System.out.println("Task_9");
        System.out.println(Name + " " + endsOod(Name));
        String Name1 = "Pavelood";
        System.out.println(Name1 + " " + endsOod(Name1));

        //__Task_10
        System.out.println("Task_10");
        char symbol = 'o';
        System.out.println(Name + " " + charCounter(Name1, symbol));

        //__Task_11
        System.out.println("Task_11");
        double d = 1.23945;
        System.out.println(d + " " + oddLength(d));

        //__Task_12
        String s1 = "Java programmers love Java", s2 = "Java";
        System.out.println(s1 + " " + s2 + " " +stringCounter(s1, s2));


    }
    // 1) Напишите метод, который выводит на экран все элементы массива типа int
    public static void ArrayElements(int[] a) {
        for (int i1 : a) System.out.println(i1);
    }
    // 2) Напишите метод с тем же именем как в задании 1, но только для массива типа double
    public static void ArrayElements(double[] a) {
        for (double i1 : a) System.out.println(i1);
    }
    /* 3) Напишите метод принимающий на вход массив типа int и выполняющий его реверсирование
     (первый элемент становится последним, последний - первым и т.д).
     Выведите элементы первоначального массива и после выполнения реверсирования с помощью метода из предыдущих заданий*/
    public static void ArrayElementsReverse(int[] a) {
        int[] array_reverse = new int[a.length];
        for (int i = (a.length - 1); i >= 0; i--) {
            array_reverse[i] = a[Math.abs(i + 1 - a.length)];
        }
        ArrayElements(array_reverse);
    }
    /* 4) Объявите и проинициализируете массив, содержащий положительные и отрицательные числа с плавающей точкой,
     выведите этот массив на экран с помощью метода созданного ранее
     Напишите метод вычисляющий сумму только положительных элементов.*/
    public static void ArrayElementsFloat(float[] a) {
        float sum = 0;
        for (int i = 0; i < a.length; i++)  {
            if (a [i] > 0) {
                sum += a[i];
            }
        }
        for (float i1 : a) System.out.println(i1);
        System.out.println("sum of float positives " + sum);
    }
    // 5) Напишите вежливую функцию, которая возвращает именнованное приветствие (например "Hello Alice!")
    public static String politeMethod(String name) {
        return "Hello " + name + "!";
    }

    // 7) Напишите функцию, которая возвращает первую половину строки (например firstHalf(abcd) вернет ab)
    public static String firstHalf(String s){
        String local_string = "";
        for (int i = 0; i < s.length()/2; i++) {
            local_string += s.charAt(i);
        }
        return local_string;
    }
    // 8) Напишите функцию, которая возвращает вторую половину строки (например secondHalf(abcd) вернет cd)
    public static String secondHalf(String s){
        String local_string = "";
        for (int i = (s.length()/2); i <= (s.length()- 1); i++) {
            local_string += s.charAt(i);
        }
        return local_string;
    }

    //9) Верните true, если строка оканчивается на "ood"
    public static boolean endsOod(String s){
                    return s.endsWith("ood");
    }
    //10) Верните количество вхождений заданного символа в заданную строку
    public static int charCounter(String s, char c) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) sum++;
        }
        return sum;
    }

    //11) Преобразуйте число в строку и верните true, если количество символов в строке нечетное
    public static boolean oddLength(double d){
        String str = String.valueOf(d);
        return str.length() % 2 == 0;
    }

    //12) Верните количество вхождений искомой строки в строке для поиска (игнорируя регистр)
    public static int stringCounter(String s, String searchString){
       return (s.length() - s.replace(searchString, "").length()) / searchString.length();
    }


}







//6) "Оберните" слово word в "обертку" wrap
// Примеры вызова функции:

// makeWrapWord("Hello", "(())") -> ((Hello))
// makeWrapWord("Crabs", "}}{{") -> }}Crabs{{
//длина wrap = 4 всегда
//    public static String makeWrapWord(String word, String wrap){
//
//    }




