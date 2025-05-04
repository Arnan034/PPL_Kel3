package com.b3.kalkulator.test.validate;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;

import com.b3.kalkulator.validate.DivisionValidate;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("Kalkulator")
@Feature("Validasi Pembagian")
@Tag("221524063 | Zahran Anugerah Rizqullah")
public class ValidateDivisionTest {
    private DivisionValidate divisionValidate;

    @BeforeEach
    public void setUp() {
        divisionValidate = new DivisionValidate();
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Story("Validasi pembagian dengan angka 0")
    @Description("Memverifikasi pembagian dengan angka 0 tidak valid")
    public void validateDivision_zero() {
        // (1) Setup (arrange, build)
        int number = 0;

        // (2) Exercise (act, operate)
        boolean actual = divisionValidate.validateDivision(number);

        // (3) Verify (assert, check)
        assertFalse(actual, "Pembagian dengan angka 0 tidak valid");
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Story("Validasi pembagian dengan angka bukan 0")
    @Description("Memverifikasi pembagian dengan angka bukan 0 valid")
    public void validateDivision_notZero() {
        // (1) Setup (arrange, build)
        int number = 5;

        // (2) Exercise (act, operate)
        boolean actual = divisionValidate.validateDivision(number);

        // (3) Verify (assert, check)
        assertTrue(actual, "Pembagian dengan angka bukan 0 valid");
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Story("Validasi pembagian dengan angka negatif")
    @Description("Memverifikasi pembagian dengan angka negatif valid")
    public void validateDivision_negative() {
        // (1) Setup (arrange, build)
        int number = -5;

        // (2) Exercise (act, operate)
        boolean actual = divisionValidate.validateDivision(number);

        // (3) Verify (assert, check)
        assertTrue(actual, "Pembagian dengan angka negatif valid");
    }
}
