package com.b3.kalkulator.test.operation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import static org.junit.jupiter.api.Assertions.*;

import com.b3.kalkulator.operation.Multiplication;
import io.qameta.allure.*;

@Epic("Kalkulator")
@Feature("Perkalian")
@Tag("221524050 | Muhammad Hanif")
public class MultiplicationTest {
    private Multiplication multiplication;

    @BeforeEach
    public void setUp() {
        multiplication = new Multiplication();
    }

    @Test
    @Story("Perkalian dua angka zero")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Mengalikan 0 * 0 dan memverifikasi hasilnya")
    public void testMultiplicationZeroAndZero() {
        // (1) Setup (arrage, build)
        Integer angka1 = 0;
        Integer angka2 = 0;
        
        // (2) Excercise (act, operate)
        double actual;
        actual = multiplication.calculate(angka1, angka2);
        
        // (3) Verify (assert, check)
        double expected = 0.00;
        assertEquals(expected, actual, "0 * 0 = 0");
    }

    @Test
    @Story("Perkalian dua angka positif")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Mengalikan 123 * 123 dan memverifikasi hasilnya")
    public void testMultiplicationPositivePositive() {
        // (1) Setup (arrange, build)
        Integer angka1 = 123;
        Integer angka2 = 123;

        // (2) Exercise (act, operate)
        double actual;
        actual = multiplication.calculate(angka1, angka2);

        // (3) Verify (assert, check)
        double expected = 15129.00;
        assertEquals(expected, actual, "123 * 123 = 15129");
    }

    @Test
    @Story("Perkalian satu angka negatif dan satu angka positif")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Mengalikan -1 * 0 dan memverifikasi hasilnya")
    public void testMultiplicationNegativeAndPositive() {
        // (1) Setup (arrange, build)
        Integer angka1 = -1;
        Integer angka2 = 1;

        // (2) Exercise (act, operate)
        double actual;
        actual = multiplication.calculate(angka1, angka2);

        // (3) Verify (assert, check)
        double expected = -1.00;
        assertEquals(expected, actual, "-1 * 1 = -1");
    }

    @Test
    @Story("Perkalian dua angka max positif")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Mengalikan 32768 * 32768 dan memverifikasi hasilnya")
    public void testMultiplicationMaxPositive() {
        // (1) Setup (arrange, build)
        Integer angka1 = 32768;
        Integer angka2 = 32768;

        // (2) Exercise (act, operate)
        double actual;
        actual = multiplication.calculate(angka1, angka2);

        // (3) Verify (assert, check)
        double expected = 1073741824.00;
        assertEquals(expected, actual, "123 * -456 = 1073741824");
    }

    @Test
    @Story("Perkalian satu angka negatif dan satu max angka positif")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Mengalikan -123 * 32768 dan memverifikasi hasilnya")
    public void testMultiplicationNegativeMaxPositive() {
        // (1) Setup (arrange, build)
        Integer angka1 = -123;
        Integer angka2 = 32768;

        // (2) Exercise (act, operate)
        double actual;
        actual = multiplication.calculate(angka1, angka2);

        // (3) Verify (assert, check)
        double expected = -4030464.00;
        assertEquals(expected, actual, "-123 * 32768 = -4030464");
    }

    @Test
    @Story("Perkalian duang angka positif")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Mengalikan 55 * 55 dan memverifikasi hasilnya")
    public void testMultiplicationTwoPositive() {
        // (1) Setup (arrange, build)
        Integer angka1 = 55;
        Integer angka2 = 55;

        // (2) Exercise (act, operate)
        double actual;
        actual = multiplication.calculate(angka1, angka2);

        // (3) Verify (assert, check)
        double expected = 3025.00;
        assertEquals(expected, actual, "55 * 55 = 3025");
    }

    @Test
    @Story("Perkalian dua angka negatif")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Mengalikan 99 * 99 dan memverifikasi hasilnya")
    public void testMultiplicationNegativeNegative() {
        // (1) Setup (arrange, build)
        Integer angka1 = -99;
        Integer angka2 = -99;

        // (2) Exercise (act, operate)
        double actual;
        actual = multiplication.calculate(angka1, angka2);

        // (3) Verify (assert, check)
        double expected = 9801.00;
        assertEquals(expected, actual, "-99 * 99 = 9801");
    }

}