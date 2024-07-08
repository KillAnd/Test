package com.skypro.calculatorTest.exeptions;

public class DivideNotNull extends IllegalArgumentException {

    public DivideNotNull(String s) {
        super(s);
    }
}
