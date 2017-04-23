package com.lf.calculator.model;

import com.lf.calculator.utils.Constants;
import com.lf.calculator.utils.Utils;

import java.io.Serializable;

public class Calculator implements Serializable{

    private Operation mOperation;
    private String mAccumulator;
    private String mAuxiliar;
    private String mDisplay;

    private Boolean mFlagRestartDisplay;

    public Calculator(){
        mFlagRestartDisplay = false;
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
        if(mFlagRestartDisplay)
            restartDisplay();
        String numberWithoutComma = Utils.replaceComma(mDisplay.concat(number));
        setDisplay(Utils.isNumber(numberWithoutComma)
                ? numberWithoutComma
                : mDisplay);
        mAuxiliar = mDisplay;
        mFlagRestartDisplay = false;
    }

    public void setOperation(Operation operation) {
        mFlagRestartDisplay = true;
        mAccumulator = mDisplay;
        mOperation = operation;
    }

    public void operation(){
        setDisplay(String.valueOf(mOperation.operation(Double.parseDouble(mAccumulator), Double.parseDouble(mAuxiliar))));
        mAccumulator = mDisplay;
    }
}
