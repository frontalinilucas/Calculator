package com.lf.calculator;

import com.lf.calculator.interfaces.Operation;
import com.lf.calculator.model.AddOperation;
import com.lf.calculator.model.DivideOperation;
import com.lf.calculator.model.MultiplyOperation;
import com.lf.calculator.model.SubtractOperation;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTest {

    /**
     * AddOperation
     */
    @Test
    public void zeroAdd() throws Exception {
        Operation addOperation = new AddOperation();
        assertEquals(0000.000D + 255D, (Object)addOperation.operation(0000.000D, 255D));
    }

    @Test
    public void easyIntegerAdd() throws Exception {
        Operation addOperation = new AddOperation();
        assertEquals(150D + 255D, (Object)addOperation.operation(150D, 255D));
    }

    @Test
    public void mediumIntegerAdd() throws Exception {
        Operation addOperation = new AddOperation();
        assertEquals(150D + (-255D), (Object)addOperation.operation(150D, (-255D)));
    }

    @Test
    public void hardIntegerAdd() throws Exception {
        Operation addOperation = new AddOperation();
        assertEquals((-150987612345D) + (-255D), (Object)addOperation.operation((-150987612345D), (-255D)));
    }

    @Test
    public void easyRealAdd() throws Exception {
        Operation addOperation = new AddOperation();
        assertEquals(150.3D + 255.9D, (Object)addOperation.operation(150.3D, 255.9D));
    }

    @Test
    public void mediumRealAdd() throws Exception {
        Operation addOperation = new AddOperation();
        assertEquals(150.300000091D + 255.900000000008761D, (Object)addOperation.operation(150.300000091D, 255.900000000008761D));
    }

    @Test
    public void hardRealAdd() throws Exception {
        Operation addOperation = new AddOperation();
        assertEquals((-150.300000091D) + (-255.900000000008761D), (Object)addOperation.operation((-150.300000091D), (-255.900000000008761D)));
    }

    /**
     * SubtractOperation
     */
    @Test
    public void zeroSubtract() throws Exception {
        Operation subtractOperation = new SubtractOperation();
        assertEquals(0000.000D - 255D, (Object)subtractOperation.operation(0000.000D, 255D));
    }

    @Test
    public void easyIntegerSubtract() throws Exception {
        Operation subtractOperation = new SubtractOperation();
        assertEquals(150D - 255D, (Object)subtractOperation.operation(150D, 255D));
    }

    @Test
    public void mediumIntegerSubtract() throws Exception {
        Operation subtractOperation = new SubtractOperation();
        assertEquals(150D - (-255D), (Object)subtractOperation.operation(150D, (-255D)));
    }

    @Test
    public void hardIntegerSubtract() throws Exception {
        Operation subtractOperation = new SubtractOperation();
        assertEquals((-150987612345D) - (-255D), (Object)subtractOperation.operation((-150987612345D), (-255D)));
    }

    @Test
    public void easyRealSubtract() throws Exception {
        Operation subtractOperation = new SubtractOperation();
        assertEquals(150.3468D - 255.900001D, (Object)subtractOperation.operation(150.3468D, 255.900001D));
    }

    @Test
    public void mediumRealSubtract() throws Exception {
        Operation subtractOperation = new SubtractOperation();
        assertEquals(150.3468D - (-255.900001D), (Object)subtractOperation.operation(150.3468D, (-255.900001D)));
    }

    @Test
    public void hardRealSubtract() throws Exception {
        Operation subtractOperation = new SubtractOperation();
        assertEquals((-150.3468009192D) - (-255000.90000165281D), (Object)subtractOperation.operation((-150.3468009192D), (-255000.90000165281D)));
    }

    /**
     * MultiplyOperation
     */
    @Test
    public void zeroMultiply() throws Exception {
        Operation multiplyOperation = new MultiplyOperation();
        assertEquals(0000.000D * 255D, (Object)multiplyOperation.operation(0000.000D, 255D));
    }

    @Test
    public void easyIntegerMultiply() throws Exception {
        Operation multiplyOperation = new MultiplyOperation();
        assertEquals(150D * 255D, (Object)multiplyOperation.operation(150D, 255D));
    }

    @Test
    public void mediumIntegerMultiply() throws Exception {
        Operation multiplyOperation = new MultiplyOperation();
        assertEquals(150D * (-255D), (Object)multiplyOperation.operation(150D, (-255D)));
    }

    @Test
    public void hardIntegerMultiply() throws Exception {
        Operation multiplyOperation = new MultiplyOperation();
        assertEquals((-150987612345D) * (-255D), (Object)multiplyOperation.operation((-150987612345D), (-255D)));
    }

    @Test
    public void easyRealMultiply() throws Exception {
        Operation multiplyOperation = new MultiplyOperation();
        assertEquals(150.3468D * 255.900001D, (Object)multiplyOperation.operation(150.3468D, 255.900001D));
    }

    @Test
    public void mediumRealMultiply() throws Exception {
        Operation multiplyOperation = new MultiplyOperation();
        assertEquals(150.3468D * (-255.900001D), (Object)multiplyOperation.operation(150.3468D, (-255.900001D)));
    }

    @Test
    public void hardRealMultiply() throws Exception {
        Operation multiplyOperation = new MultiplyOperation();
        assertEquals((-150.3468009192D) * (-255000.90000165281D), (Object)multiplyOperation.operation((-150.3468009192D), (-255000.90000165281D)));
    }

    /**
     * DivideOperation
     */
    @Test
    public void zeroDivide() throws Exception {
        Operation divideOperation = new DivideOperation();
        assertEquals(0000.000D / 255D, (Object)divideOperation.operation(0000.000D, 255D));
    }

    @Test
    public void zeroConflictDivide() throws Exception {
        Operation divideOperation = new DivideOperation();
        assertEquals(255D / 0000.000D, (Object)divideOperation.operation(255D, 0000.000D));
    }

    @Test
    public void easyIntegerDivide() throws Exception {
        Operation divideOperation = new DivideOperation();
        assertEquals(150D / 255D, (Object)divideOperation.operation(150D, 255D));
    }

    @Test
    public void mediumIntegerDivide() throws Exception {
        Operation divideOperation = new DivideOperation();
        assertEquals(150D / (-255D), (Object)divideOperation.operation(150D, (-255D)));
    }

    @Test
    public void hardIntegerDivide() throws Exception {
        Operation divideOperation = new DivideOperation();
        assertEquals((-150987612345D) / (-255D), (Object)divideOperation.operation((-150987612345D), (-255D)));
    }

    @Test
    public void easyRealDivide() throws Exception {
        Operation divideOperation = new DivideOperation();
        assertEquals(150.3468D / 255.900001D, (Object)divideOperation.operation(150.3468D, 255.900001D));
    }

    @Test
    public void mediumRealDivide() throws Exception {
        Operation divideOperation = new DivideOperation();
        assertEquals(150.3468D / (-255.900001D), (Object)divideOperation.operation(150.3468D, (-255.900001D)));
    }

    @Test
    public void hardRealDivide() throws Exception {
        Operation divideOperation = new DivideOperation();
        assertEquals((-150.3468009192D) / (-255000.90000165281D), (Object)divideOperation.operation((-150.3468009192D), (-255000.90000165281D)));
    }

}