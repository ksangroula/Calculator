package com.krishna.calculator;

import org.junit.Test;

import static org.junit.Assert.*;


public class CalculatorUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void substraction_isCorrect() {
        assertEquals(3, 5 - 2);
    }

    @Test
    public void multiply_isCorrect() {
        assertEquals(16, 8 * 2);
    }

    @Test
    public void divide_isCorrect() {
        assertEquals(4, 20 / 5);
    }
}