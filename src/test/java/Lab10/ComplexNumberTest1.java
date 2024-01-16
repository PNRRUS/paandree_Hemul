package Lab10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexNumberTest1 {

    @Test
    void addComplexNumber() {
        ComplexNumber ComplNum1 = new ComplexNumber(10, 4);
        ComplexNumber ComplNum2 = new ComplexNumber(2, -5);
        ComplexNumber ComplNum3 = new ComplexNumber(12, -1);
        ComplexNumber ComplNum4 = new ComplexNumber(40, -42);

        // сложение двух комплесных чисел (a+bi) + (c+di) = (a+c) + (b+d)i
        assertEquals(ComplNum3, ComplexNumber.addComplexNumber(ComplNum1, ComplNum2));
    }

    @Test
    void multComplexNumber() {
    }
}