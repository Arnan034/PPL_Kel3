package com.b3.kalkulator.test.operation;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.b3.kalkulator.operation.Division;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;


@Epic("Kalkulator")
@Feature("Pembagian")
@Tag("221524063 | Zahran Anugerah Rizqullah")
public class DivisionTest {
    private Division division;

    @BeforeEach
    public void setUp() {
        division = new Division();
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Story("Pembagian dua angka positif")
    @Description("Membagi 10 / 2 dan memverifikasi hasilnya")
    public void calculate_twoPositiveNumbers() {
        // (1) Setup (arrange, build)
        Integer angka1 = 10;
        Integer angka2 = 2;

        // (2) Exercise (act, operate)
        double actual = division.calculate(angka1, angka2);

        // (3) Verify (assert, check)
        double expected = 5.00;
        assertEquals(expected, actual, "10 / 2 = 5");
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Story("Pembagian dua angka negatif")
    @Description("Membagi -10 / -2 dan memverifikasi hasilnya")
    public void calculate_twoNegativeNumbers() {
        // (1) Setup (arrange, build)
        Integer angka1 = -10;
        Integer angka2 = -2;

        // (2) Exercise (act, operate)
        double actual = division.calculate(angka1, angka2);

        // (3) Verify (assert, check)
        double expected = 5.00;
        assertEquals(expected, actual, "-10 / -2 = 5");
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Story("Pembagian angka positif dan negatif")
    @Description("Membagi 10 / -2 dan memverifikasi hasilnya")
    public void calculate_positiveDividedByNegative() {
        // (1) Setup (arrange, build)
        Integer angka1 = 10;
        Integer angka2 = -2;

        // (2) Exercise (act, operate)
        double actual = division.calculate(angka1, angka2);

        // (3) Verify (assert, check)
        double expected = -5.00;
        assertEquals(expected, actual, "10 / -2 = -5");
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Story("Pembagian angka negatif dan positif")
    @Description("Membagi -10 / 2 dan memverifikasi hasilnya")
    public void calculate_negativeDividedByPositive() {
        // (1) Setup (arrange, build)
        Integer angka1 = -10;
        Integer angka2 = 2;

        // (2) Exercise (act, operate)
        double actual = division.calculate(angka1, angka2);

        // (3) Verify (assert, check)
        double expected = -5.00;
        assertEquals(expected, actual, "-10 / 2 = -5");
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Story("Pembagian angka nol dan positif")
    @Description("Membagi 0 / 2 dan memverifikasi hasilnya")
    public void calculate_zeroDividedByPositive() {
        // (1) Setup (arrange, build)
        Integer angka1 = 0;
        Integer angka2 = 2;

        // (2) Exercise (act, operate)
        double actual = division.calculate(angka1, angka2);

        // (3) Verify (assert, check)
        double expected = 0.00;
        assertEquals(expected, actual, "0 / 2 = 0");
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Story("Pembagian angka nol dan negatif")
    @Description("Membagi 0 / -2 dan memverifikasi hasilnya")
    public void calculate_zeroDividedByNegative() {
        // (1) Setup (arrange, build)
        Integer angka1 = 0;
        Integer angka2 = -2;

        // (2) Exercise (act, operate)
        double actual = division.calculate(angka1, angka2);

        // (3) Verify (assert, check)
        double expected = 0.00;
        assertEquals(expected, actual, "0 / -2 = 0");
    }
}
