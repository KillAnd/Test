package com.skypro.calculatorTest;

import com.skypro.calculatorTest.ServiceCalculator.ServiceCalculator;
import com.skypro.calculatorTest.exeptions.DivideByZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServiceCalculatorTest {

    ServiceCalculator serviceCalculator = new ServiceCalculator();

    @Test
    public void CheckingTheCalculatorForAddition() {
        int value1 = 10;
        int value2 = 15;
        int answer = 25;

        Integer result = serviceCalculator.plus(value1, value2);

        Assertions.assertEquals(answer,result);

    }

    @Test
    public void CheckingTheCalculatorForSubtraction() {
        int value1 = 10;
        int value2 = 15;
        int answer = -5;

        Integer result = serviceCalculator.minus(value1, value2);

        Assertions.assertEquals(answer,result);

    }

    @Test
    public void CheckingTheCalculatorForMultiplication() {
        int value1 = 10;
        int value2 = 15;
        int answer = 150;

        Integer result = serviceCalculator.multiple(value1, value2);

        Assertions.assertEquals(answer,result);

    }

    @Test
    public void CheckingTheCalculatorForDivide() {
        int value1 = 100;
        int value2 = 20;
        int answer = 5;

        Integer result = serviceCalculator.divide(value1, value2);

        Assertions.assertEquals(answer,result);

    }

    @Test
    public void CheckingTheCalculatorForExceptionNull() {
        int value1 = 100;
        int value2 = 0;

        Assertions.assertThrowsExactly(DivideByZeroException.class,
                () -> serviceCalculator.divide(value1,value2) );

    }

}
