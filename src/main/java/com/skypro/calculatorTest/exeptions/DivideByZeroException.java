package com.skypro.calculatorTest.exeptions;

public class DivideByZeroException extends IllegalArgumentException {

    public DivideByZeroException(String s) {
        super(s);
    }
}
