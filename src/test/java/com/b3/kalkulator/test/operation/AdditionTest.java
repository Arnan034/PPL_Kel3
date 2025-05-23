package com.b3.kalkulator.test.operation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import static org.junit.jupiter.api.Assertions.*;

// import java.io.Serial;

import com.b3.kalkulator.operation.Addition;
import io.qameta.allure.*;

@Epic("Kalkulator")
@Feature("Penjumlahan")
@Tag("221524034 | Arnanda Prasatya")
public class AdditionTest {
    private Addition addition;

    @BeforeEach
    public void setUp() {
        addition = new Addition();
    }

    @Test
    @Story("Penjumlahan dua angka zero")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Menambahkan 0 + 0 dan memverifikasi hasilnya")
    public void testAdditionZeroAndZero() {
        // (1) Setup (arrage, build)
        Integer angka1 = 0;
        Integer angka2 = 0;
        
        // (2) Excercise (act, operate)
        double actual;
        actual = addition.calculate(angka1, angka2);
        
        // (3) Verify (assert, check)
        double expected = 0.00;
        assertEquals(expected, actual, "0 + 0 = 0");
    }

    @Test
    @Story("Penjumlahan dua angka positif")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Menambahkan 12345 + 6789 dan memverifikasi hasilnya")
    public void testAdditionPositivePositive() {
        // (1) Setup (arrange, build)
        Integer angka1 = 12345;
        Integer angka2 = 6789;

        // (2) Exercise (act, operate)
        double actual = addition.calculate(angka1, angka2);

        // (3) Verify (assert, check)
        double expected = 19134.00;
        assertEquals(expected, actual, "12345 + 6789 = 19134");
    }

    @Test
    @Story("Penjumlahan dua angka negatif")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Menambahkan -12345 + -6789 dan memverifikasi hasilnya")
    public void testAdditionNegativeNegative() {
        // (1) Setup
        Integer angka1 = -12345;
        Integer angka2 = -6789;

        // (2) Exercise
        double actual = addition.calculate(angka1, angka2);

        // (3) Verify
        double expected = -19134.00;
        assertEquals(expected, actual, "-12345 + -6789 = -19134");
    }

    @Test
    @Story("Penjumlahan satu angka positif dan satu angka negatif")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Menambahkan -12345 + 6789 dan memverifikasi hasilnya")
    public void testAdditionNegativePositive() {
        // (1) Setup
        Integer angka1 = -12345;
        Integer angka2 = 6789;

        // (2) Exercise
        double actual = addition.calculate(angka1, angka2);

        // (3) Verify
        double expected = -5556.00;
        assertEquals(expected, actual, "-12345 + 6789 = -5556");
    }

    @Test
    @Story("Penjumlahan satu angka positif dan satu angka negatif")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Menambahkan 12345 + -6789 dan memverifikasi hasilnya")
    public void testAdditionPositiveNegative() {
        // (1) Setup
        Integer angka1 = 12345;
        Integer angka2 = -6789;

        // (2) Exercise
        double actual = addition.calculate(angka1, angka2);

        // (3) Verify
        double expected = 5556.00;
        assertEquals(expected, actual, "12345 + -6789 = 5556");
    }

    @Test
    @Story("Penjumlahan satu angka max positif dan satu angka negatif")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Menambahkan 32768 + 0 dan memverifikasi hasilnya")
    public void testAdditionMaxAndZero() {
        // (1) Setup
        Integer angka1 = 32768;
        Integer angka2 = 0;

        // (2) Exercise
        double actual = addition.calculate(angka1, angka2);

        // (3) Verify
        double expected = 32768.00;
        assertEquals(expected, actual, "32768 + 0 = 32768");
    }

    @Test
    @Story("Penjumlahan satu angka max negatif dan satu angka positif")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Menambahkan -32768 + 0 dan memverifikasi hasilnya")
    public void testAdditionMinAndZero() {
        // (1) Setup
        Integer angka1 = -32768;
        Integer angka2 = 0;

        // (2) Exercise
        double actual = addition.calculate(angka1, angka2);

        // (3) Verify
        double expected = -32768.00;
        assertEquals(expected, actual, "-32768 + 0 = -32768");
    }

    @Test
    @Story("Penjumlahan satu angka max positif dan satu angka max negatif")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Menambahkan 32768 + -32768 dan memverifikasi hasilnya")
    public void testAdditionMaxAndMin() {
        // (1) Setup
        Integer angka1 = 32768;
        Integer angka2 = -32768;

        // (2) Exercise
        double actual = addition.calculate(angka1, angka2);

        // (3) Verify
        double expected = 0.00;
        assertEquals(expected, actual, "32768 + -32768 = 0");
    }

    @Test
    @Story("Penjumlahan satu angka max positif dan satu angka max positif")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Menambahkan 32768 + 32768 dan memverifikasi hasilnya")
    public void testAdditionMaxAndMax() {
        // (1) Setup
        Integer angka1 = 32768;
        Integer angka2 = 32768;

        // (2) Exercise
        double actual = addition.calculate(angka1, angka2);

        // (3) Verify
        double expected = 65536.00;
        assertEquals(expected, actual, "32768 + 32768 = 65536");
    }

    @Test
    @Story("Penjumlahan satu angka max negatif dan satu angka max negatif")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Menambahkan -32768 + -32768 dan memverifikasi hasilnya")
    public void testAdditionMinAndMin() {
        // (1) Setup
        Integer angka1 = -32768;
        Integer angka2 = -32768;

        // (2) Exercise
        double actual = addition.calculate(angka1, angka2);

        // (3) Verify
        double expected = -65536.00;
        assertEquals(expected, actual, "-32768 + -32768 = -65536");
    }

    @Test
    @Story("Penjumlahan satu angka max positif dan satu angka max negatif")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Menambahkan 32768 + -32768 dan memverifikasi hasilnya")
    public void testAdditionZeroAndMax() {
        // (1) Setup
        Integer angka1 = 0;
        Integer angka2 = 32768;

        // (2) Exercise
        double actual = addition.calculate(angka1, angka2);

        // (3) Verify
        double expected = 32768.00;
        assertEquals(expected, actual, "0 + 32768 = 32768");
    }

    @Test
    @Story("Penjumlahan satu angka zero dan satu angka max positif")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Menambahkan 0 + -32768 dan memverifikasi hasilnya")
    public void testAdditionZeroAndMin() {
        // (1) Setup
        Integer angka1 = 0;
        Integer angka2 = -32768;

        // (2) Exercise
        double actual = addition.calculate(angka1, angka2);

        // (3) Verify
        double expected = -32768.00;
        assertEquals(expected, actual, "0 + -32768 = -32768");
    }

    @Test
    @Story("Penjumlahan satu angka positif dan satu angka negatif")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Menambahkan 1 + -1 dan memverifikasi hasilnya")
    public void testAdditionOneAndNegativeOne() {
        // (1) Setup
        Integer angka1 = 1;
        Integer angka2 = -1;

        // (2) Exercise
        double actual = addition.calculate(angka1, angka2);

        // (3) Verify
        double expected = 0.00;
        assertEquals(expected, actual, "1 + -1 = 0");
    }

    @Test
    @Story("Penjumlahan satu angka max positif dan satu angka negatif")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Menambahkan 32767 + 1 dan memverifikasi hasilnya")
    public void testAdditionMaxMinusOneAndOne() {
        // (1) Setup
        Integer angka1 = 32767;
        Integer angka2 = 1;

        // (2) Exercise
        double actual = addition.calculate(angka1, angka2);

        // (3) Verify
        double expected = 32768.00;
        assertEquals(expected, actual, "32767 + 1 = 32768");
    }

    @Test
    @Story("Penjumlahan satu angka max negatif dan satu angka negatif")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Menambahkan -32767 + -1 dan memverifikasi hasilnya")
    public void testAdditionNegativeMaxMinusOneAndMinusOne() {
        // (1) Setup
        Integer angka1 = -32767;
        Integer angka2 = -1;

        // (2) Exercise
        double actual = addition.calculate(angka1, angka2);

        // (3) Verify
        double expected = -32768.00;
        assertEquals(expected, actual, "-32767 + -1 = -32768");
    }
}
