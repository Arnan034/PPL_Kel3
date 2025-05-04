package com.b3.kalkulator.test.operation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import static org.junit.jupiter.api.Assertions.*;

import com.b3.kalkulator.operation.Subtraction;
import io.qameta.allure.*;

@Epic("Kalkulator")
@Feature("Pengurangan")
@Tag("221524050 | Muhammad Hanif")
public class SubtractionTest {
    private Subtraction subtraction;

    @BeforeEach
    public void setUp() {
        subtraction = new Subtraction();
    }

    @Test
    @Story("Pengurangan dua angka nol")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Mengurangi 0 - 0 dan memverifikasi hasilnya")
    public void testSubtractionZeroAndZero() {
        // (1) Setup (arrage, build)
        Integer angka1 = 0;
        Integer angka2 = 0;

        // (2) Excercise (act, operate)
        double actual;
        actual = subtraction.calculate(angka1, angka2);

        // (3) Verify (assert, check)
        double expected = 0.00;
        assertEquals(expected, actual, "0 - 0 = 0");
    }

    @Test
    @Story("Pengurangan dua angka positif")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Mengurangi 100 - 50 dan memverifikasi hasilnya")
    public void testSubtractionPositivePositive() {
        // (1) Setup (arrange, build)
        Integer angka1 = 100;
        Integer angka2 = 50;

        // (2) Exercise (act, operate)
        double actual;
        actual = subtraction.calculate(angka1, angka2);

        // (3) Verify (assert, check)
        double expected = 50.00;
        assertEquals(expected, actual, "100 - 50 = 50");
    }

    @Test
    @Story("Pengurangan satu angka max negatif dan satu angka positif")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Mengurangi -32768 - 1 dan memverifikasi hasilnya")
    public void testSubtractionMaxNegative() {
        // (1) Setup (arrange, build)
        Integer angka1 = -32768;
        Integer angka2 = 1;

        // (2) Exercise (act, operate)
        double actual;
        actual = subtraction.calculate(angka1, angka2);

        // (3) Verify (assert, check)
        double expected = -32769.00;
        assertEquals(expected, actual, "-32768 - 1 = -32769");
    }

    @Test
    @Story("Pengurangan dua mx angka positif")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Mengurangi 32768 - 32768 dan memverifikasi hasilnya")
    public void testSubtractionPositiveNegative() {
        // (1) Setup (arrange, build)
        Integer angka1 = 32768;
        Integer angka2 = 32768;

        // (2) Exercise (act, operate)
        double actual; 
        actual = subtraction.calculate(angka1, angka2);

        // (3) Verify (assert, check)
        double expected = 0.00;
        assertEquals(expected, actual, "32768 - 32768 = 0");
    }

    @Test
    @Story("Pengurangan dua angka positif")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Mengurangi 999 - 111 dan memverifikasi hasilnya")
    public void testSubtractionTwoPositive() {
        // (1) Setup (arrange, build)
        Integer angka1 = 999;
        Integer angka2 = 111;

        // (2) Exercise (act, operate)
        double actual;
        actual = subtraction.calculate(angka1, angka2);

        // (3) Verify (assert, check)
        double expected = 888.00;
        assertEquals(expected, actual, "999 - 111 = 888");
    }

    @Test
    @Story("Pengurangan dua angka positif")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Mengurangi 100 - 1000 dan memverifikasi hasilnya")
    public void testSubtractionPositive() {
        // (1) Setup (arrange, build)
        Integer angka1 = 100;
        Integer angka2 = 1000;

        // (2) Exercise (act, operate)
        double actual;
        actual = subtraction.calculate(angka1, angka2);

        // (3) Verify (assert, check)
        double expected = -900.00;
        assertEquals(expected, actual, "100 - 1000 = -900");
    }


    @Test
    @Story("Pengurangan dua angka positif yang bukan max")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Mengurangi 8888 - 1000 dan memverifikasi hasilnya")
    public void testSubtractionPositiveNotMax() {
        // (1) Setup (arrange, build)
        Integer angka1 = 8888;
        Integer angka2 = 1000;

        // (2) Exercise (act, operate)
        double actual;
        actual = subtraction.calculate(angka1, angka2);

        // (3) Verify (assert, check)
        double expected = 7888.00;
        assertEquals(expected, actual, "8888 - 1000 = 7888");
    }

    @Test
    @Story("Pengurangan satu angka negatif dan satu angka positif")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Mengurangi -22222 - 22222 dan memverifikasi hasilnya")
    public void testSubtractionPositiveNegativee() {
        // (1) Setup (arrange, build)
        Integer angka1 = -22222;
        Integer angka2 = 22222;

        // (2) Exercise (act, operate)
        double actual;
        actual = subtraction.calculate(angka1, angka2);

        // (3) Verify (assert, check)
        double expected = -44444.00;
        assertEquals(expected, actual, "-22222 - 22222 = -44444");
    }
}