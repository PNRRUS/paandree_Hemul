package Lab10;

public class ComplexNumber {

    public double Re; //   вещественная часть
    public double Im; //   мнимая часть

    public ComplexNumber(double re, double im) {
        Re = re;
        Im = im;
    }

    public ComplexNumber() {

    }

    // сложение двух комплесных чисел (a+bi) + (c+di) = (a+c) + (b+d)i
    public static ComplexNumber addComplexNumber(ComplexNumber num1, ComplexNumber num2) {
        double reSum = num1.Re + num2.Re;
        double imSum = num1.Im + num2.Im;
        ComplexNumber Sum = new ComplexNumber(reSum, imSum);
        return Sum;
    }

    // умножение двух комплесных чисел (a+bi) * (c+di) = (ac-bd) + (bc+ad)i
    public static ComplexNumber multComplexNumber(ComplexNumber num1, ComplexNumber num2) {
        double reMult = num1.Re * num2.Re - num1.Im * num2.Im;
        double imMult = num1.Im * num2.Re + num1.Re * num2.Im;
        ComplexNumber Mult = new ComplexNumber(reMult, imMult);
        return Mult;
    }

    // печать на экране комплексного числа
    public static void PrintComplexNumber(ComplexNumber num1) {
        System.out.print("Re= " + num1.Re + " ");
        System.out.println("Im= " + num1.Im);

    }
}
