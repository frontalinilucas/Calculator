package com.lf.calculator.model;

import com.lf.calculator.utils.Constants;
import com.lf.calculator.utils.Utils;

//Todo eliminar IF
public class Calculator {

    private Operation mOperation;
    private String mAccumulator;
    private String mAuxiliar;
    private String mDisplay;

    //TODO: Ver flag
    private Boolean mFlag;

    public Calculator(){
        mFlag = false;
        restartAccumulator();
        restartDisplay();
        restartAuxiliar();
        mOperation = new StartOperation();
    }

    private void restartDisplay() {
        mDisplay = Constants.ZERO;
    }

    private void restartAccumulator() {
        mAccumulator = Constants.ZERO;
    }

    private void restartAuxiliar() {
        mAuxiliar = Constants.ZERO;
    }

    public String getDisplay() {
        return mDisplay;
    }

    public void setDisplay(String display){
        mDisplay = Utils.formatNumber(display);
    }

    public void concat(String number){
        if(mFlag)
            restartDisplay();
        String numberWithoutComma = Utils.replaceComma(mDisplay.concat(number));
        setDisplay(Utils.isNumber(numberWithoutComma)
                ? numberWithoutComma
                : mDisplay);
        mAuxiliar = mDisplay;
        mFlag = false;
    }

    public void setOperation(Operation operation) {
        mFlag = true;
        mAccumulator = mDisplay;
        mOperation = operation;
    }

    public void operation(){
        //TODO: Division por 0
        setDisplay(String.valueOf(mOperation.operation(Double.parseDouble(mAccumulator), Double.parseDouble(mAuxiliar))));
        mAccumulator = mDisplay;
    }
}
