package com.skypro.calculatorTest.ServiceCalculator;

import com.skypro.calculatorTest.exeptions.DivideNotNull;
import org.springframework.stereotype.Service;

@Service
public class ServiceCalculator implements CalculatorInterface {

    @Override
    public String welcomeCalculator() {
        return "Добро пожаловать в калькулятор!";
    }

    @Override
    public Integer plus(int value1, int value2) {
        return value1+value2;
    }

    @Override
    public Integer minus(int value1, int value2) {
        return value1-value2;
    }

    @Override
    public Integer multiple(int value1, int value2) {
        return value1*value2;
    }

    @Override
    public Integer divide(int value1, int value2) {
        if (value2 == 0){
            throw new DivideNotNull("Делить на ноль нельзя");
        }
        return value1/value2;
    }
}
