package com.b3.kalkulator.test.operation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.b3.kalkulator.operation.Addition;

public class TestAddition {
    private Addition addition;

    @BeforeEach
    public void setUp() {
        addition = new Addition();
    }

    @Test
    public void testAdditionPositiveAndPositive() {
        assertEquals(5, addition.calculate(2, 3), "2 + 3 should equal 5");
        assertEquals(10, addition.calculate(7, 3), "7 + 3 should equal 10");
    }

    @Test
    public void testAdditionPositiveAndNegative() {
        assertEquals(0, addition.calculate(3, -3), "3 + (-3) should equal 0");
        assertEquals(4, addition.calculate(7, -3), "7 + (-3) should equal 4");
    }

    @Test
    public void testAdditionNegativeAndPositive() {
        assertEquals(0, addition.calculate(-3, 3), "-3 + 3 should equal 0");
        assertEquals(2, addition.calculate(-3, 5), "-3 + 5 should equal 2");
    }

    @Test
    public void testAdditionNegativeAndNegative() {
        assertEquals(-6, addition.calculate(-3, -3), "-3 + (-3) should equal -6");
        assertEquals(-8, addition.calculate(-5, -3), "-5 + (-3) should equal -8");
    }

    @Test
    public void testAdditionZeroAndZero() {
        assertEquals(0, addition.calculate(0, 0), "0 + 0 should equal 0");
    }

    @Test
    public void testAdditionPositiveAndZero() {
        assertEquals(3, addition.calculate(3, 0), "3 + 0 should equal 3");
        assertEquals(5, addition.calculate(5, 0), "5 + 0 should equal 5");
    }

    @Test
    public void testAdditionNegativeAndZero() {
        assertEquals(-3, addition.calculate(-3, 0), "-3 + 0 should equal -3");
        assertEquals(-5, addition.calculate(-5, 0), "-5 + 0 should equal -5");
    }

    @Test
    public void testAdditionMaxValueAndMinValue() {
        assertEquals(0, addition.calculate(32767, -32767), "32767 + (-32767) should equal 0");
    }
}
