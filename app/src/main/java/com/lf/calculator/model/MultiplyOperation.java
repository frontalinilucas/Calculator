package com.lf.calculator.model;

public class MultiplyOperation implements Operation {

    @Override
    public Double operation(Double number, Double number2) {
        return number * number2;
    }

}
