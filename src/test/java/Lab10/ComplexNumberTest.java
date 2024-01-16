package Lab10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComplexNumberTest {

    @Test
    public void testGetSum_Multi()  {
         ComplexNumber ComplNum1 = new ComplexNumber(10, 4);
         ComplexNumber ComplNum2 = new ComplexNumber(2, -5);
         ComplexNumber ComplNum3 = new ComplexNumber(12, -1);
         ComplexNumber ComplNum4 = new ComplexNumber(40, -42);

        // сложение двух комплесных чисел (a+bi) + (c+di) = (a+c) + (b+d)i
        assertEquals(ComplNum3.Re, ComplexNumber.addComplexNumber(ComplNum1, ComplNum2).Re);
        assertEquals(ComplNum3.Im, ComplexNumber.addComplexNumber(ComplNum1, ComplNum2).Im);

        // умножение двух комплесных чисел (a+bi) * (c+di) = (ac-bd) + (bc+ad)i
        assertEquals(ComplNum4.Re, ComplexNumber.multComplexNumber(ComplNum1, ComplNum2).Re);
        assertEquals(ComplNum4.Im, ComplexNumber.multComplexNumber(ComplNum1, ComplNum2).Im);

        //проверка изменений по ДЗ_11 видны изменения

    }

}