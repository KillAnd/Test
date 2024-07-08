package com.skypro.calculatorTest.Controller;

import com.skypro.calculatorTest.ServiceCalculator.CalculatorInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller {

    CalculatorInterface calculatorInterface;

    public Controller(CalculatorInterface calculatorInterface) {
        this.calculatorInterface = calculatorInterface;
    }

    @GetMapping
    public String welcomeCalculator(){
        return calculatorInterface.welcomeCalculator();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(required = false) Integer value1, @RequestParam(required = false) Integer value2){
        if (value1 == null || value2 == null){
            return "Оба значения должны быть введены";
        }
        Integer answer = calculatorInterface.plus(value1, value2);
        return value1 + " + " + value2 + " = " + answer;
    }

    @GetMapping("/minus")
    public String minus(@RequestParam Integer value1, @RequestParam Integer value2){
        if (value1 == null || value2 == null){
            return "Оба значения должны быть введены";
        }
        Integer answer = calculatorInterface.minus(value1, value2);
        return value1 + " - " + value2 + " = " + answer;
    }

    @GetMapping("/multiple")
    public String multiple(@RequestParam Integer value1, @RequestParam Integer value2){
        if (value1 == null || value2 == null){
            return "Оба значения должны быть введены";
        }
        Integer answer = calculatorInterface.multiple(value1, value2);
        return value1 + " * " + value2 + " = " + answer;
    }

    @GetMapping("/divide")
    public String divide(@RequestParam Integer value1, @RequestParam Integer value2){
        if (value1 == null || value2 == null){
            return "Оба значения должны быть введены";
        } else if (value2 == 0) {
            return "Делить на ноль нельзя!";
        }
        Integer answer = calculatorInterface.divide(value1, value2);
        return value1 + " / " + value2 + " = " + answer;
    }
}
