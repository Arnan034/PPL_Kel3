package com.b3.kalkulator.test.validate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import static org.junit.jupiter.api.Assertions.*;

import com.b3.kalkulator.validate.Operation;

import io.qameta.allure.*;

@Epic("Kalkulator")
@Feature("Validasi Operasi")
@Tag("221524050 | Muhammad Hanif")
public class OperationTest {
    private Operation operationValidator;

    @BeforeEach
    public void setUp() {
        // (1) Setup (arrange, build)
        operationValidator = new Operation();
    }

    // ========================= VALID OPERATIONS =========================
    @Test
    @Story("Validasi simbol operasi penjumlahan")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi simbol operasi '+' yang valid")
    public void testValidOperationAddition() {
        // (2) Exercise (act, operate)
        boolean result = operationValidator.validateOperation("+");

        // (3) Verify (assert, check)
        assertTrue(result, "Simbol '+' valid");
    }

    @Test
    @Story("Validasi simbol operasi pengurangan")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi simbol operasi '-' yang valid")
    public void testValidOperationSubtraction() {
        // (2) Exercise (act, operate)
        boolean result = operationValidator.validateOperation("-");

        // (3) Verify (assert, check)
        assertTrue(result, "Simbol '-' valid");
    }

    @Test
    @Story("Validasi simbol operasi perkalian")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi simbol operasi '*' yang valid")
    public void testValidOperationMultiplication() {
        // (2) Exercise (act, operate)
        boolean result = operationValidator.validateOperation("*");

        // (3) Verify (assert, check)
        assertTrue(result, "Simbol '*' valid");
    }

    @Test
    @Story("Validasi simbol operasi pembagian")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi simbol operasi '/' yang valid")
    public void testValidOperationDivision() {
        // (2) Exercise (act, operate)
        boolean result = operationValidator.validateOperation("/");

        // (3) Verify (assert, check)
        assertTrue(result, "Simbol '/' valid");
    }

    // ========================= INVALID OPERATIONS =========================
    @Test
    @Story("Validasi simbol operasi tidak valid")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi simbol operasi 'x' yang tidak valid")
    public void testInvalidOperationX() {
        // (2) Exercise (act, operate)
        boolean result = operationValidator.validateOperation("x");

        // (3) Verify (assert, check)
        assertFalse(result, "Simbol 'x' tidak valid");
    }
}