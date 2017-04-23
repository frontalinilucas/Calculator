package com.lf.calculator.presenter;

import android.databinding.BaseObservable;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

import com.lf.calculator.BR;
import com.lf.calculator.model.AddOperation;
import com.lf.calculator.model.Calculator;
import com.lf.calculator.model.DivideOperation;
import com.lf.calculator.model.MultiplyOperation;
import com.lf.calculator.model.SubtractOperation;

public class CalculatorPresenter extends BaseObservable {

    private Calculator mCalculator;

    public CalculatorPresenter(){
        restart();
    }

    public String getResult() {
        return mCalculator.getDisplay();
    }

    public void addNumber(View view){
        mCalculator.concat(((AppCompatButton)view).getText().toString());
        notifyPropertyChanged(BR._all);
    }

    public void restart(){
        mCalculator = new Calculator();
        notifyPropertyChanged(BR._all);
    }

    public void equal(){
        mCalculator.operation();
        notifyPropertyChanged(BR._all);
    }

    public void add(){
        mCalculator.setOperation(new AddOperation());
    }

    public void subtract(){
        mCalculator.setOperation(new SubtractOperation());
    }

    public void multiply(){
        mCalculator.setOperation(new MultiplyOperation());
    }

    public void divide(){
        mCalculator.setOperation(new DivideOperation());
    }

}
