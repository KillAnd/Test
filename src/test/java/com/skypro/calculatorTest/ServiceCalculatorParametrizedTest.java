package com.skypro.calculatorTest;

import com.skypro.calculatorTest.ServiceCalculator.ServiceCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ServiceCalculatorParametrizedTest {

    ServiceCalculator serviceCalculator = new ServiceCalculator();

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(10,38),
                Arguments.of(0,6),
                Arguments.of(150,5),
                Arguments.of(100,3)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    public void CheckingTheCalculatorForAddition(Integer value1, Integer value2) {
        int answer = value1 + value2;

        Integer result = serviceCalculator.plus(value1,value2);

        Assertions.assertEquals(answer,result);
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    public void CheckingTheCalculatorForSubtraction(Integer value1, Integer value2) {
        int answer = value1 - value2;

        Integer result = serviceCalculator.minus(value1,value2);

        Assertions.assertEquals(answer,result);
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    public void CheckingTheCalculatorForMultiply(Integer value1, Integer value2) {
        int answer = value1 * value2;

        Integer result = serviceCalculator.multiple(value1,value2);

        Assertions.assertEquals(answer,result);
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    public void CheckingTheCalculatorForDivide(Integer value1, Integer value2) {
        int answer = value1 / value2;

        Integer result = serviceCalculator.divide(value1,value2);

        Assertions.assertEquals(answer,result);
    }

}
