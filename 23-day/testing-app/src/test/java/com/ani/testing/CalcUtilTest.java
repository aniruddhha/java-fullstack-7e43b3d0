package com.ani.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.ani.testing.util.CalcUtil;

public class CalcUtilTest {
    
    @Test
    public void checkForSimpleInput() {

        int num1 = 10;
        int num2 = 10;
        int expectedOp = 20;

        CalcUtil cu = new CalcUtil();
        int actualOp = cu.calc(num1, num2);

        Assertions.assertEquals(expectedOp, actualOp);
    }

    @Test
    public void checkCalcInCorrect() {
        int num1 = 10;
        int num2 = 10;
        int expectedOp = 30;

        CalcUtil cu = new CalcUtil();
        int actualOp = cu.calc(num1, num2);
        Assertions.assertNotEquals(expectedOp, actualOp);
    }

    @Test
    public void checkCalcBL1() {
        int num1 = 10;
        int num2 = 200;
        int expectedOp = 210;

        CalcUtil cu = new CalcUtil();
        int actualOp = cu.calc(num1, num2);

        Assertions.assertEquals(expectedOp, actualOp);
    }

    @Test
    public void checkCalcBL2() {
        Assertions.assertThrows(RuntimeException.class, () -> {

            int num1 = 1001;
            int num2 = 200;
    
            CalcUtil cu = new CalcUtil();
            cu.calc(num1, num2);
        });
    }
}
