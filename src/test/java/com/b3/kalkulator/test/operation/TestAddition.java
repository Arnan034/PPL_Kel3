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
    public void testAdditionZeroAndZero() {
        // (1) Setup (arrage, build)
        Integer angka1 = 0;
        Integer angka2 = 0;
        double actual;
        
        // (2) Excercise (act, operate)
        actual = addition.calculate(angka1, angka2);
        
        // (3) Verify (assert, check
        double expected = 0.00;
        assertEquals(expected, actual, "0 + 0 should equal 0");
    }
}
