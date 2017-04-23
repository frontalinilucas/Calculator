package com.lf.calculator.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lf.calculator.R;
import com.lf.calculator.databinding.ActivityCalculatorBinding;
import com.lf.calculator.presenter.CalculatorPresenter;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCalculatorBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_calculator);
        CalculatorPresenter calculatorPresenter = new CalculatorPresenter();
        binding.setCalculator(calculatorPresenter);

    }
    //TODO: Saveinstancestate??
}
