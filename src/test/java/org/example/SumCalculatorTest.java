package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    public static final int CORRECT_VALUE = 3;

    @Test
    void sumTest() {
        double result = SumCalculator.sum(1,2);

        Assertions.assertEquals(CORRECT_VALUE, result);
    }
}