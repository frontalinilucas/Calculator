package com.lf.calculator.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lf.calculator.R;
import com.lf.calculator.databinding.ActivityCalculatorBinding;
import com.lf.calculator.presenter.CalculatorPresenter;

public class CalculatorActivity extends AppCompatActivity {

    private static final String KEY_CALCULATOR = "KEY_CALCULATOR";

    private CalculatorPresenter mCalculatorPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCalculatorBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_calculator);
        if(savedInstanceState != null && savedInstanceState.containsKey(KEY_CALCULATOR))
            mCalculatorPresenter = (CalculatorPresenter) savedInstanceState.getSerializable(KEY_CALCULATOR);
        else
            mCalculatorPresenter = new CalculatorPresenter();
        binding.setCalculator(mCalculatorPresenter);

    }

    protected void onSaveInstanceState(Bundle outState) {
        outState.putSerializable(KEY_CALCULATOR, mCalculatorPresenter);
    }
}
