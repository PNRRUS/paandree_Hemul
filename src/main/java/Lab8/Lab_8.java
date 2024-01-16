package Lab8;

import java.io.*;


public class Lab_8 {

    public static void main(String[] args) {


        //1) Реализовать программу(класс), корректно записывающую в файл out.txt строки “Это” “Файл” “Записанный”
        // “Программой на JAVA!”
        fileWrite f = new fileWrite("Это", " - файл", ", записанный ", "программой на Java!");
        f.Write();

        //2) Написать программу(класс), которая может копировать файлы в текстовом формате
        // (создает другой файл с тем же содержимым, что и указанный, считывая указанный файл и записывая его в другой)

        fileCopy f1 = new fileCopy("C:\\Users\\A79169599\\Downloads\\out.txt",
                "C:\\Users\\A79169599\\Downloads\\out1.txt");
        f1.Copy();


        //3) Создать класс Counter, который внутри хранит поле типа int.
        // Реализовать методы get, getAndIncrement (увеличивает значение на 1, потом возвращает его),
        // getAndDecrement(уменьшает значение на 1, потом возвращает его). У объекта Counter также должна быть переменная,
        // описывающая его состояние в зависимости от текущего значения. Возможные значения: NEGATIVE, ZERO, POSITIVE

        Counter c = new Counter();
        System.out.println(c.get() + " " + c.getStatus()); //0 ZERO
        System.out.println(c.getAndIncrement() + " " + c.getStatus()); //1 POSITIVE
        System.out.println(c.getAndIncrement() + " " + c.getStatus()); //2 POSITIVE
        System.out.println(c.getAndDecrement() + " " + c.getStatus()); //1 POSITIVE
        System.out.println(c.getAndDecrement() + " " + c.getStatus()); //0 ZERO
        System.out.println(c.getAndDecrement() + " " + c.getStatus()); //-1 NEGATIVE
        System.out.println(c.getAndDecrement() + " " + c.getStatus()); //-2 NEGATIVE
    }
}
