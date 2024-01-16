package Lab10;
/*
Сделать класс для описания комплексных чисел, ComplexNumber
Если вы не знаете, что такое комплексное число: это число, которое состоит из двух чисел,
одно из которых называется вещественной частью, а второе мнимой. В вашем классе, соответственно,
будет два поля типа double

Создать нестатические методы add и multiplicate, правила сложения и умножения можно
посмотреть на википедии:
https://ru.wikipedia.org/wiki/%D0%9A%D0%BE%D0%BC%D0%BF%D0%BB%D0%B5%D0%BA%D1%81%D0%BD%D0%BE%D0%B5_%D1%87%D0%B8%D1%81%D0%BB%D0%BE
Написать юнит-тесты, можно после того, как готов класс, но лучше до.
В отдельном пакете и забываем про метод main

 */
public class Lab_10 {
    public static void main(String[] args) {
        ComplexNumber ComplNum1 = new ComplexNumber(10, 4);
        ComplexNumber ComplNum2 = new ComplexNumber(2, -5);

        ComplNum1.PrintComplexNumber(ComplNum1);
        ComplNum2.PrintComplexNumber(ComplNum2);
        ComplexNumber.PrintComplexNumber(ComplexNumber.addComplexNumber(ComplNum1, ComplNum2));
        ComplexNumber.PrintComplexNumber(ComplexNumber.multComplexNumber(ComplNum1, ComplNum2));


    }
}
