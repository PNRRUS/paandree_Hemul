package lib_Lab_5;

import stub.Simulator;
import test.*;


public class Environment {
    /*I вариант:

            LAB_5
            Задание 1
            1. Создайте новый класс Environment и метод public static void main(String[] args) в нем
            2. Загрузите в Ваш проект TestFactory.jar используя инструкцию со слайда 8
            3. Импортируйте в него все содержимое класс Simulator из пакета stub и все содержимое пакета test
            4. Используя вывод на экран (System.out.println(…);) «запустите» тест кейс, цепочку и симулятор
Задание 2
            1. Создайте пакет animal. Создайте в этом пакете классы Cat и Dog. Поскольку наши животные очень
            воспитанные создайте для каждого из классов метод public static void sayHello(), который выводит
            на экране приветствие
            2. Создайте пакет robot. Создайте в этом пакете класс Terminator. Наши роботы, тоже, очень воспитанные,
            поэтому им тоже нужен метод sayHello()
            3. В классе Environment в методе main попросите классы из п.1,2 поприветствовать мир.
            Для этого используйте полный путь пакет.класс.метод или импортируйте пакеты animal и robot
            4. Подумайте о том, что теперь у вас в одном классе запускаются тест кейсы, симуляторы, кошки и терминаторы
*/
    public static void main(String[] args) {

        System.out.println(TestCase.startTestCase());
        System.out.println(TestChain.startTestChain());
        System.out.println(Simulator.startSimulator());

        animal.Cat.sayHello();
        animal.Dog.sayHello();
        robot.Terminator.sayHello();

    }
}
