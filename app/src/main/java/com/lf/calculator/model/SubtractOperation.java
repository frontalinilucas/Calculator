package com.lf.calculator.model;


public class SubtractOperation implements Operation {

    @Override
    public Double operation(Double number, Double number2) {
        return number - number2;
    }

}
