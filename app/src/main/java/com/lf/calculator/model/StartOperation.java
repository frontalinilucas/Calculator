package com.lf.calculator.model;

import com.lf.calculator.interfaces.Operation;

public class StartOperation implements Operation {

    @Override
    public Double operation(Double number, Double number2) {
        return number2;
    }

}
