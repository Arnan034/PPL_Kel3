package com.b3.kalkulator.test.validate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.b3.kalkulator.validate.FormatInput;

import io.qameta.allure.*;

@Epic("Kalkulator")
@Feature("Validasi Input Format")
@Tag("Validation")
public class FormatInputTest {
    private FormatInput formatInput;

    @BeforeEach
    public void setUp() {
        formatInput = new FormatInput();
    }

    // ========================= VALID INPUT =========================
    @Test
    @Story("Validasi format input penjumlahan")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi format input penjumlahan yang valid")
    public void testValidInputSimpleAdditionShouldPass(){
        // (1) Setup (arrage, build)
        String input = "3 + 4";
        
        // (2) Excercise (act, operate)
        
        // (3) Verify (assert, check)
        assertDoesNotThrow(() -> {
            formatInput.isValidFormat(input);
        }, "Format '3 + 4' seharusnya valid dan tidak melempar exception");
    }

    @Test
    @Story("Validasi format input pengurangan")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi format input pengurangan yang valid")
    public void testValidInputSimpleSubtractionShouldPass(){
        // (1) Setup (arrage, build)
        String input = "100 - 50";
        
        // (2) Excercise (act, operate)
        
        // (3) Verify (assert, check)
        assertDoesNotThrow(() -> {
            formatInput.isValidFormat(input);
        }, "Format '100 - 50' seharusnya valid dan tidak melempar exception");
    }

    @Test
    @Story("Validasi format input perkalian")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi format input perkalian yang valid")
    public void testValidInputLargeNumberMultiplicationShouldPass(){
        // (1) Setup (arrage, build)
        String input = "32768 * -32768";
        
        // (2) Excercise (act, operate)
        
        // (3) Verify (assert, check)
        assertDoesNotThrow(() -> {
            formatInput.isValidFormat(input);
        }, "Format '32768 * -32768' seharusnya valid dan tidak melempar exception");
    }

    @Test
    @Story("Validasi format input pembagian")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi format input pembagian yang valid")
    public void testValidInputNegativeDivisionShouldPass(){
        // (1) Setup (arrage, build)
        String input = "-200 / 2";
        
        // (2) Excercise (act, operate)
        
        // (3) Verify (assert, check)
        assertDoesNotThrow(() -> {
            formatInput.isValidFormat(input);
        }, "Format '-200 / 2' seharusnya valid dan tidak melempar exception");
    }

    @Test
    @Story("Validasi format input penjumlahan dengan angka nol")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi format input penjumlahan dengan angka nol")
    public void testValidInputZeroAdditionShouldPass(){
        // (1) Setup (arrage, build)
        String input = "0 + 0";
        
        // (2) Excercise (act, operate)
        
        // (3) Verify (assert, check)
        assertDoesNotThrow(() -> {
            formatInput.isValidFormat(input);
        }, "Format '0 + 0' seharusnya valid dan tidak melempar exception");
    }

    // ========================= INVALID INPUT =========================
    @Test
    @Story("Validasi format input string kosong")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi format input string kosong")
    public void testInvalidInputEmpty(){
        // (1) Setup (arrage, build)
        String input = "";

        // (2) Act & Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            formatInput.isValidFormat(input);
        });

        // (3) Assert (verifikasi pesan error-nya juga)
        assertEquals("Input tidak boleh kosong!", exception.getMessage());
    }

    @Test
    @Story("Validasi format input dengan angka kedua tidak ada")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi format input dengan angka kedua tidak ada")
    public void testInvalidFormatMissingSecondOperand(){
        // (1) Setup (arrage, build)
        String input = "12 +";
        String expectedMessage = "Format input tidak valid! Harus ada 3 bagian: <angka1> <operasi> <angka2>";

        // (2) Excercise (act, operate)
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            formatInput.isValidFormat(input);
        });

        // (3) Verify (assert, check)
        assertEquals(expectedMessage, exception.getMessage(), "Format '12 +' seharusnya tidak valid dan melempar exception");
    }

    @Test
    @Story("Validasi format input hanya operator")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi format input hanya operator")
    public void testInvalidFormatOnlyOperator() {
        // (1) Setup (arrage, build)
        String input = "+";

        // (2) Excercise (act, operate)
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            formatInput.isValidFormat(input);
        });

        // (3) Verify (assert, check)
        assertEquals("Format input tidak valid! Harus ada 3 bagian: <angka1> <operasi> <angka2>", exception.getMessage());
    }

    @Test
    @Story("Validasi format input hanya angka")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi format input hanya angka")
    public void testInvalidFormatOnlyFirstOperand() {
        // (1) Setup (arrage, build)
        String input = "123";

        // (2) Excercise (act, operate)
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            formatInput.isValidFormat(input);
        });

        // (3) Verify (assert, check)
        assertEquals("Format input tidak valid! Harus ada 3 bagian: <angka1> <operasi> <angka2>", exception.getMessage());
    }

    @Test
    @Story("Validasi format input dengan terlalu banyak bagian")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi format input dengan terlalu banyak bagian")
    public void testInvalidFormatTooManyParts() {
        // (1) Setup (arrage, build)
        String input = "1 + 2 3";

        // (2) Excercise (act, operate)
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            formatInput.isValidFormat(input);
        });

        // (3) Verify (assert, check)
        assertEquals("Format input tidak valid! Harus ada 3 bagian: <angka1> <operasi> <angka2>", exception.getMessage());
    }

    @Test
    @Story("Validasi format input tanpa operator")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi format input tanpa operator")
    public void testInvalidFormatMissingOperator() {
        // (1) Setup (arrage, build)
        String input = "1 2";

        // (2) Excercise (act, operate)
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            formatInput.isValidFormat(input);
        });

        // (3) Verify (assert, check)
        assertEquals("Format input tidak valid! Harus ada 3 bagian: <angka1> <operasi> <angka2>", exception.getMessage());
    }

    @Test
    @Story("Validasi format input dengan angka pertama huruf")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi format input dengan angka pertama huruf")
    public void testInvalidFirstNumberNonNumericWord() {
        // (1) Setup (arrage, build)
        String input = "abc + 3";

        // (2) Excercise (act, operate)
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            formatInput.isValidFormat(input);
        });

        // (3) Verify (assert, check)
        assertEquals("Input harus berupa angka integer!", exception.getMessage());
    }

    @Test
    @Story("Validasi format input dengan angka pertama huruf literal")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi format input dengan angka pertama huruf literal")
    public void testInvalidFirstNumberLiteralWord() {
        // (1) Setup (arrage, build)
        String input = "one + 5";

        // (2) Excercise (act, operate)
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            formatInput.isValidFormat(input);
        });

        // (3) Verify (assert, check)
        assertEquals("Input harus berupa angka integer!", exception.getMessage());
    }

    @Test
    @Story("Validasi format input dengan angka pertama simbol")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi format input dengan angka pertama simbol")
    public void testInvalidFirstNumberSpecialCharacter() {
        // (1) Setup (arrage, build)
        String input = "!@# + 7";

        // (2) Excercise (act, operate)
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            formatInput.isValidFormat(input);
        });

        // (3) Verify (assert, check)
        assertEquals("Input harus berupa angka integer!", exception.getMessage());
    }

    @Test
    @Story("Validasi format input dengan angka pertama desimal")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi format input dengan angka pertama desimal")
    public void testInvalidFirstNumberDecimalNumber() {
        // (1) Setup (arrage, build)
        String input = "3.5 + 2";

        // (2) Excercise (act, operate)
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            formatInput.isValidFormat(input);
        });

        // (3) Verify (assert, check)
        assertEquals("Input harus berupa angka integer!", exception.getMessage());
    }

    @Test
    @Story("Validasi format input dengan angka kedua huruf")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi format input dengan angka kedua huruf")
    public void testInvalidSecondNumberNonNumericWord() {
        // (1) Setup (arrage, build)
        String input = "3 + abc";

        // (2) Excercise (act, operate)
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            formatInput.isValidFormat(input);
        });

        // (3) Verify (assert, check)
        assertEquals("Input harus berupa angka integer!", exception.getMessage());
    }

    @Test
    @Story("Validasi format input dengan angka kedua huruf literal")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi format input dengan angka kedua huruf literal")
    public void testInvalidSecondNumberLiteralWord() {
        // (1) Setup (arrage, build)
        String input = "5 + one";

        // (2) Excercise (act, operate)
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            formatInput.isValidFormat(input);
        });

        // (3) Verify (assert, check)
        assertEquals("Input harus berupa angka integer!", exception.getMessage());
    }

    @Test
    @Story("Validasi format input dengan angka kedua simbol")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi format input dengan angka kedua simbol")
    public void testInvalidSecondNumberSpecialCharacter() {
        // (1) Setup (arrage, build)
        String input = "7 + !@#";

        // (2) Excercise (act, operate)
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            formatInput.isValidFormat(input);
        });

        // (3) Verify (assert, check)
        assertEquals("Input harus berupa angka integer!", exception.getMessage());
    }

    @Test
    @Story("Validasi format input dengan angka kedua desimal")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi format input dengan angka kedua desimal")
    public void testInvalidSecondNumberDecimalNumber() {
        // (1) Setup (arrage, build)
        String input = "2 + 4.5";

        // (2) Excercise (act, operate)
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            formatInput.isValidFormat(input);
        });

        // (3) Verify (assert, check)
        assertEquals("Input harus berupa angka integer!", exception.getMessage());
    }
}