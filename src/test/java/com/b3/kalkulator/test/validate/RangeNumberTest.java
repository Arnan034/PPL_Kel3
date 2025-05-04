package com.b3.kalkulator.test.validate;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;

import com.b3.kalkulator.validate.RangeNumber;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("Kalkulator")
@Feature("Validasi Range Angka")
@Tag("221524063 | Zahran Anugerah Rizqullah")
@Story("Validasi range angka antara -32768 dan 32767")
public class RangeNumberTest {
    private RangeNumber rangeNumber;

    @BeforeEach
    public void setUp() {
        rangeNumber = new RangeNumber();
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Story("Validasi angka dalam rentang yang valid")
    @Description("Memverifikasi angka dalam rentang -32768 hingga 32767")
    public void validateRange_numberInRange() {
        // (1) Setup (arrange, build)
        int number = 1000;

        // (2) Exercise (act, operate)
        boolean actual = rangeNumber.validateRange(number);

        // (3) Verify (assert, check)
        assertTrue(actual, "Angka dalam rentang yang valid");
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Story("Validasi angka pada batas bawah yang valid")
    @Description("Memverifikasi angka pada batas bawah -32768")
    public void validateRange_numberAtLowerBound() {
        // (1) Setup (arrange, build)
        int number = -32768;

        // (2) Exercise (act, operate)
        boolean actual = rangeNumber.validateRange(number);

        // (3) Verify (assert, check)
        assertTrue(actual, "Angka pada batas bawah yang valid");
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Story("Validasi angka pada batas atas yang valid")
    @Description("Memverifikasi angka pada batas atas 32767")
    public void validateRange_numberAtUpperBound() {
        // (1) Setup (arrange, build)
        int number = 32767;

        // (2) Exercise (act, operate)
        boolean actual = rangeNumber.validateRange(number);

        // (3) Verify (assert, check)
        assertTrue(actual, "Angka pada batas atas yang valid");
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Story("Validasi angka pada batas bawah yang tidak valid")
    @Description("Memverifikasi angka -32769 yang berada di bawah batas bawah -32768")
    public void validateRange_numberBelowLowerBound() {
        // (1) Setup (arrange, build)
        int number = -32769;

        // (2) Exercise (act, operate)
        boolean actual = rangeNumber.validateRange(number);

        // (3) Verify (assert, check)
        assertFalse(actual, "Angka di bawah batas bawah yang tidak valid");
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Story("Validasi angka di atas batas atas yang tidak valid")
    @Description("Memverifikasi angka 32768 yang berada di atas batas atas 32767")
    public void validateRange_numberAboveUpperBound() {
        // (1) Setup (arrange, build)
        int number = 32768;

        // (2) Exercise (act, operate)
        boolean actual = rangeNumber.validateRange(number);

        // (3) Verify (assert, check)
        assertFalse(actual, "Angka di atas batas atas yang tidak valid");
    }
}
