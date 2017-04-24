package com.lf.calculator;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.v7.widget.AppCompatEditText;

import com.lf.calculator.ui.CalculatorActivity;
import com.lf.calculator.utils.Constants;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withResourceName;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class InstrumentedTest {

    private static final Integer MIN_SUBSTRING = 0;
    private static final Integer MAX_SUBSTRING = 15;

    @Rule
    public ActivityTestRule<CalculatorActivity> mActivity = new ActivityTestRule<>(CalculatorActivity.class);

    @Test
    public void multipleZero() throws Exception {
        for (int i = 0; i < 10; i ++){
            onView(withId(R.id.buttonZero)).perform(click());
        }
        onView(withId(R.id.result)).check(matches(withText(Constants.ZERO)));
    }

    private void isEqual(String operation){
        onView(withId(R.id.buttonEqual)).perform(click());
        onView(withId(R.id.result))
                .check(matches(withText(operation.substring(MIN_SUBSTRING,
                        //Compara con lo que se muestra en pantalla, y son solo 15 caracteres
                        (operation.length() > MAX_SUBSTRING ? MAX_SUBSTRING : operation.length())
                ))));
    }

    @Test
    public void concatOperation() throws Exception {
        Double operation = ((((((((0000.0000D + 255D) * 875D) + 170D) / 54.12D) * 0.0D) - 87D) + 921D) * 78D);
        onView(withId(R.id.buttonZero)).perform(click())
                .perform(click())
                .perform(click())
                .perform(click());
        onView(withId(R.id.buttonComma)).perform(click());
        onView(withId(R.id.buttonZero)).perform(click())
                .perform(click())
                .perform(click())
                .perform(click());

        onView(withId(R.id.buttonAdd)).perform(click());

        onView(withId(R.id.buttonTwo)).perform(click());
        onView(withId(R.id.buttonFive)).perform(click())
                .perform(click());

        onView(withId(R.id.buttonEqual)).perform(click());
        onView(withId(R.id.buttonMultiply)).perform(click());

        onView(withId(R.id.buttonEight)).perform(click());
        onView(withId(R.id.buttonSeven)).perform(click());
        onView(withId(R.id.buttonFive)).perform(click());

        onView(withId(R.id.buttonEqual)).perform(click());
        onView(withId(R.id.buttonAdd)).perform(click());

        onView(withId(R.id.buttonOne)).perform(click());
        onView(withId(R.id.buttonSeven)).perform(click());
        onView(withId(R.id.buttonZero)).perform(click());

        onView(withId(R.id.buttonEqual)).perform(click());
        onView(withId(R.id.buttonDivide)).perform(click());

        onView(withId(R.id.buttonFive)).perform(click());
        onView(withId(R.id.buttonFour)).perform(click());
        onView(withId(R.id.buttonComma)).perform(click());
        onView(withId(R.id.buttonOne)).perform(click());
        onView(withId(R.id.buttonTwo)).perform(click());

        onView(withId(R.id.buttonEqual)).perform(click());
        onView(withId(R.id.buttonMultiply)).perform(click());

        onView(withId(R.id.buttonZero)).perform(click());
        onView(withId(R.id.buttonComma)).perform(click());
        onView(withId(R.id.buttonZero)).perform(click());

        onView(withId(R.id.buttonEqual)).perform(click());
        onView(withId(R.id.buttonSubtract)).perform(click());

        onView(withId(R.id.buttonEight)).perform(click());
        onView(withId(R.id.buttonSeven)).perform(click());

        onView(withId(R.id.buttonEqual)).perform(click());
        onView(withId(R.id.buttonAdd)).perform(click());

        onView(withId(R.id.buttonNine)).perform(click());
        onView(withId(R.id.buttonTwo)).perform(click());
        onView(withId(R.id.buttonOne)).perform(click());

        onView(withId(R.id.buttonEqual)).perform(click());
        onView(withId(R.id.buttonMultiply)).perform(click());

        onView(withId(R.id.buttonSeven)).perform(click());
        onView(withId(R.id.buttonEight)).perform(click());

        isEqual(String.valueOf(operation));
    }

    /**
     * AddOperation
     */
    @Test
    public void zeroAdd() throws Exception {
        Double operation = 0000.0000D + 255D;
        onView(withId(R.id.buttonZero)).perform(click())
                .perform(click())
                .perform(click())
                .perform(click());
        onView(withId(R.id.buttonComma)).perform(click());
        onView(withId(R.id.buttonZero)).perform(click())
                .perform(click())
                .perform(click())
                .perform(click());

        onView(withId(R.id.buttonAdd)).perform(click());

        onView(withId(R.id.buttonTwo)).perform(click());
        onView(withId(R.id.buttonFive)).perform(click())
                .perform(click());

        isEqual(String.valueOf(operation));
    }

    @Test
    public void hardIntegerAdd() throws Exception {
        Double operation = 150987612345D + (-283D);
        onView(withId(R.id.buttonOne)).perform(click());
        onView(withId(R.id.buttonFive)).perform(click());
        onView(withId(R.id.buttonZero)).perform(click());
        onView(withId(R.id.buttonNine)).perform(click());
        onView(withId(R.id.buttonEight)).perform(click());
        onView(withId(R.id.buttonSeven)).perform(click());
        onView(withId(R.id.buttonSix)).perform(click());
        onView(withId(R.id.buttonOne)).perform(click());
        onView(withId(R.id.buttonTwo)).perform(click());
        onView(withId(R.id.buttonThree)).perform(click());
        onView(withId(R.id.buttonFour)).perform(click());
        onView(withId(R.id.buttonFive)).perform(click());

        onView(withId(R.id.buttonAdd)).perform(click());

        onView(withId(R.id.buttonSubtract)).perform(click());
        onView(withId(R.id.buttonTwo)).perform(click());
        onView(withId(R.id.buttonEight)).perform(click());
        onView(withId(R.id.buttonThree)).perform(click());

        isEqual(String.valueOf(operation));
    }

    @Test
    public void hardRealAdd() throws Exception {
        Double operation = 50.30087691D + (-459.8001234087D);

        onView(withId(R.id.buttonFive)).perform(click());
        onView(withId(R.id.buttonZero)).perform(click());
        onView(withId(R.id.buttonComma)).perform(click());
        onView(withId(R.id.buttonThree)).perform(click());
        onView(withId(R.id.buttonZero)).perform(click())
                .perform(click());
        onView(withId(R.id.buttonEight)).perform(click());
        onView(withId(R.id.buttonSeven)).perform(click());
        onView(withId(R.id.buttonSix)).perform(click());
        onView(withId(R.id.buttonNine)).perform(click());
        onView(withId(R.id.buttonOne)).perform(click());

        onView(withId(R.id.buttonAdd)).perform(click());

        onView(withId(R.id.buttonSubtract)).perform(click());
        onView(withId(R.id.buttonFour)).perform(click());
        onView(withId(R.id.buttonFive)).perform(click());
        onView(withId(R.id.buttonNine)).perform(click());
        onView(withId(R.id.buttonComma)).perform(click());
        onView(withId(R.id.buttonEight)).perform(click());
        onView(withId(R.id.buttonZero)).perform(click())
                .perform(click());
        onView(withId(R.id.buttonOne)).perform(click());
        onView(withId(R.id.buttonTwo)).perform(click());
        onView(withId(R.id.buttonThree)).perform(click());
        onView(withId(R.id.buttonFour)).perform(click());
        onView(withId(R.id.buttonZero)).perform(click());
        onView(withId(R.id.buttonEight)).perform(click());
        onView(withId(R.id.buttonSeven)).perform(click());

        isEqual(String.valueOf(operation));
    }

    /**
     * SubtractOperation
     */
    @Test
    public void zeroSubtract() throws Exception {
        Double operation = 0000.00D - 383D;
        onView(withId(R.id.buttonZero)).perform(click())
                .perform(click())
                .perform(click())
                .perform(click());
        onView(withId(R.id.buttonComma)).perform(click());
        onView(withId(R.id.buttonZero)).perform(click())
                .perform(click());

        onView(withId(R.id.buttonSubtract)).perform(click());

        onView(withId(R.id.buttonThree)).perform(click());
        onView(withId(R.id.buttonEight)).perform(click());
        onView(withId(R.id.buttonThree)).perform(click());

        isEqual(String.valueOf(operation));
    }

    @Test
    public void hardIntegerSubtract() throws Exception {
        Double operation = 152987632345D - 478854D;
        onView(withId(R.id.buttonOne)).perform(click());
        onView(withId(R.id.buttonFive)).perform(click());
        onView(withId(R.id.buttonTwo)).perform(click());
        onView(withId(R.id.buttonNine)).perform(click());
        onView(withId(R.id.buttonEight)).perform(click());
        onView(withId(R.id.buttonSeven)).perform(click());
        onView(withId(R.id.buttonSix)).perform(click());
        onView(withId(R.id.buttonThree)).perform(click());
        onView(withId(R.id.buttonTwo)).perform(click());
        onView(withId(R.id.buttonThree)).perform(click());
        onView(withId(R.id.buttonFour)).perform(click());
        onView(withId(R.id.buttonFive)).perform(click());

        onView(withId(R.id.buttonSubtract)).perform(click());

        onView(withId(R.id.buttonFour)).perform(click());
        onView(withId(R.id.buttonSeven)).perform(click());
        onView(withId(R.id.buttonEight)).perform(click())
                .perform(click());
        onView(withId(R.id.buttonFive)).perform(click());
        onView(withId(R.id.buttonFour)).perform(click());

        isEqual(String.valueOf(operation));
    }

    @Test
    public void hardRealSubtract() throws Exception {
        Double operation = 152987.632345D - 4788.54D;
        onView(withId(R.id.buttonOne)).perform(click());
        onView(withId(R.id.buttonFive)).perform(click());
        onView(withId(R.id.buttonTwo)).perform(click());
        onView(withId(R.id.buttonNine)).perform(click());
        onView(withId(R.id.buttonEight)).perform(click());
        onView(withId(R.id.buttonSeven)).perform(click());
        onView(withId(R.id.buttonComma)).perform(click());
        onView(withId(R.id.buttonSix)).perform(click());
        onView(withId(R.id.buttonThree)).perform(click());
        onView(withId(R.id.buttonTwo)).perform(click());
        onView(withId(R.id.buttonThree)).perform(click());
        onView(withId(R.id.buttonFour)).perform(click());
        onView(withId(R.id.buttonFive)).perform(click());

        onView(withId(R.id.buttonSubtract)).perform(click());

        onView(withId(R.id.buttonFour)).perform(click());
        onView(withId(R.id.buttonSeven)).perform(click());
        onView(withId(R.id.buttonEight)).perform(click())
                .perform(click());
        onView(withId(R.id.buttonComma)).perform(click());
        onView(withId(R.id.buttonFive)).perform(click());
        onView(withId(R.id.buttonFour)).perform(click());

        isEqual(String.valueOf(operation));
    }

    /**
     * MultiplyOperation
     */
    @Test
    public void zeroMultiply() throws Exception {
        Double operation = 0000.00D * 2147D;
        onView(withId(R.id.buttonZero)).perform(click())
                .perform(click())
                .perform(click())
                .perform(click());
        onView(withId(R.id.buttonComma)).perform(click());
        onView(withId(R.id.buttonZero)).perform(click())
                .perform(click());

        onView(withId(R.id.buttonMultiply)).perform(click());

        onView(withId(R.id.buttonTwo)).perform(click());
        onView(withId(R.id.buttonOne)).perform(click());
        onView(withId(R.id.buttonFour)).perform(click());
        onView(withId(R.id.buttonSeven)).perform(click());

        isEqual(String.valueOf(operation));
    }

    @Test
    public void doubleZeroMultiply() throws Exception {
        Double operation = 0000.00D * 0D;
        onView(withId(R.id.buttonZero)).perform(click())
                .perform(click())
                .perform(click())
                .perform(click());
        onView(withId(R.id.buttonComma)).perform(click());
        onView(withId(R.id.buttonZero)).perform(click())
                .perform(click());

        onView(withId(R.id.buttonMultiply)).perform(click());

        onView(withId(R.id.buttonZero)).perform(click());

        isEqual(String.valueOf(operation));
    }

    @Test
    public void hardIntegerMultiply() throws Exception {
        Double operation = 87632345D * 885459D;
        onView(withId(R.id.buttonEight)).perform(click());
        onView(withId(R.id.buttonSeven)).perform(click());
        onView(withId(R.id.buttonSix)).perform(click());
        onView(withId(R.id.buttonThree)).perform(click());
        onView(withId(R.id.buttonTwo)).perform(click());
        onView(withId(R.id.buttonThree)).perform(click());
        onView(withId(R.id.buttonFour)).perform(click());
        onView(withId(R.id.buttonFive)).perform(click());

        onView(withId(R.id.buttonMultiply)).perform(click());

        onView(withId(R.id.buttonEight)).perform(click())
                .perform(click());
        onView(withId(R.id.buttonFive)).perform(click());
        onView(withId(R.id.buttonFour)).perform(click());
        onView(withId(R.id.buttonFive)).perform(click());
        onView(withId(R.id.buttonNine)).perform(click());

        isEqual(String.valueOf(operation));
    }

    @Test
    public void hardRealMultiply() throws Exception {
        Double operation = 392987.3234D * 47.54873D;
        onView(withId(R.id.buttonThree)).perform(click());
        onView(withId(R.id.buttonNine)).perform(click());
        onView(withId(R.id.buttonTwo)).perform(click());
        onView(withId(R.id.buttonNine)).perform(click());
        onView(withId(R.id.buttonEight)).perform(click());
        onView(withId(R.id.buttonSeven)).perform(click());
        onView(withId(R.id.buttonComma)).perform(click());
        onView(withId(R.id.buttonThree)).perform(click());
        onView(withId(R.id.buttonTwo)).perform(click());
        onView(withId(R.id.buttonThree)).perform(click());
        onView(withId(R.id.buttonFour)).perform(click());

        onView(withId(R.id.buttonMultiply)).perform(click());

        onView(withId(R.id.buttonFour)).perform(click());
        onView(withId(R.id.buttonSeven)).perform(click());
        onView(withId(R.id.buttonComma)).perform(click());
        onView(withId(R.id.buttonFive)).perform(click());
        onView(withId(R.id.buttonFour)).perform(click());
        onView(withId(R.id.buttonEight)).perform(click());
        onView(withId(R.id.buttonSeven)).perform(click());
        onView(withId(R.id.buttonThree)).perform(click());

        isEqual(String.valueOf(operation));
    }

    /**
     * DivideOperation
     */
    @Test
    public void zeroDivide() throws Exception {
        Double operation = 000.00D / 384D;
        onView(withId(R.id.buttonZero)).perform(click())
                .perform(click())
                .perform(click());
        onView(withId(R.id.buttonComma)).perform(click());
        onView(withId(R.id.buttonZero)).perform(click())
                .perform(click());

        onView(withId(R.id.buttonDivide)).perform(click());

        onView(withId(R.id.buttonThree)).perform(click());
        onView(withId(R.id.buttonEight)).perform(click());
        onView(withId(R.id.buttonFour)).perform(click());

        isEqual(String.valueOf(operation));
    }

    @Test
    public void conflictZeroDivide() throws Exception {
        Double operation = 345D / 0D;
        onView(withId(R.id.buttonThree)).perform(click());
        onView(withId(R.id.buttonFour)).perform(click());
        onView(withId(R.id.buttonFive)).perform(click());

        onView(withId(R.id.buttonDivide)).perform(click());

        onView(withId(R.id.buttonZero)).perform(click());

        isEqual(String.valueOf(operation));
    }

    @Test
    public void hardIntegerDivide() throws Exception {
        Double operation = 7638745D / 815459D;
        onView(withId(R.id.buttonSeven)).perform(click());
        onView(withId(R.id.buttonSix)).perform(click());
        onView(withId(R.id.buttonThree)).perform(click());
        onView(withId(R.id.buttonEight)).perform(click());
        onView(withId(R.id.buttonSeven)).perform(click());
        onView(withId(R.id.buttonFour)).perform(click());
        onView(withId(R.id.buttonFive)).perform(click());

        onView(withId(R.id.buttonDivide)).perform(click());

        onView(withId(R.id.buttonEight)).perform(click());
        onView(withId(R.id.buttonOne)).perform(click());
        onView(withId(R.id.buttonFive)).perform(click());
        onView(withId(R.id.buttonFour)).perform(click());
        onView(withId(R.id.buttonFive)).perform(click());
        onView(withId(R.id.buttonNine)).perform(click());

        isEqual(String.valueOf(operation));
    }

    @Test
    public void hardRealDivide() throws Exception {
        Double operation = 540987.3234D / 47.87354D;
        onView(withId(R.id.buttonFive)).perform(click());
        onView(withId(R.id.buttonFour)).perform(click());
        onView(withId(R.id.buttonZero)).perform(click());
        onView(withId(R.id.buttonNine)).perform(click());
        onView(withId(R.id.buttonEight)).perform(click());
        onView(withId(R.id.buttonSeven)).perform(click());
        onView(withId(R.id.buttonComma)).perform(click());
        onView(withId(R.id.buttonThree)).perform(click());
        onView(withId(R.id.buttonTwo)).perform(click());
        onView(withId(R.id.buttonThree)).perform(click());
        onView(withId(R.id.buttonFour)).perform(click());

        onView(withId(R.id.buttonDivide)).perform(click());

        onView(withId(R.id.buttonFour)).perform(click());
        onView(withId(R.id.buttonSeven)).perform(click());
        onView(withId(R.id.buttonComma)).perform(click());
        onView(withId(R.id.buttonEight)).perform(click());
        onView(withId(R.id.buttonSeven)).perform(click());
        onView(withId(R.id.buttonThree)).perform(click());
        onView(withId(R.id.buttonFive)).perform(click());
        onView(withId(R.id.buttonFour)).perform(click());

        isEqual(String.valueOf(operation));
    }
}
