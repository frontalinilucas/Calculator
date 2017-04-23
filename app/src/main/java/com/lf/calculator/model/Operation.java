package com.lf.calculator.model;

import java.io.Serializable;

public interface Operation extends Serializable {

    Double operation(Double number, Double number2);

}
