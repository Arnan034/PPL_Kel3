package com.b3.kalkulator.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import com.b3.kalkulator.InputScanner;

import io.qameta.allure.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;


@Epic("Kalkulator")
@Feature("Input Scanner")
@Tag("221524034 | Arnanda Prasatya")
public class InputScannerTest {

    private void testInput(String simulatedInput, String expectedOutput, String message) {
        // (1) Setup (arrage, build)
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream((simulatedInput + "\n").getBytes()));
        InputScanner scanner = new InputScanner();

        // (2) Excercise (act, operate)
        String actual = scanner.getInput();

        // (3) Verify (assert, check)
        assertEquals(expectedOutput, actual, message);

        System.setIn(originalIn);
    }

    @Test
    @Story("Input berupa huruf")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi input berupa huruf harus dibaca dengan benar")
    public void testTextStringInput() {
        testInput("hello world", "hello world", "Harus membaca input berupa teks");
    }

    @Test
    @Story("Input berupa simbol")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi input berupa simbol harus dibaca dengan benar")
    public void testSymbolInput() {
        testInput("!@# $%^ &*()", "!@# $%^ &*()", "Harus membaca simbol dengan benar");
    }
    
    @Test
    @Story("Input berupa huruf dan angka")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi input berupa huruf dan angka harus dibaca dengan benar")
    public void testMixedCharacterInput() {
        testInput("123abc + xyz", "123abc + xyz", "Harus membaca input campuran");
    }

    @Test
    @Story("Input berupa spasi")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi input berupa spasi harus dibaca dengan benar")
    public void testSpacesOnlyInput() {
        testInput("    ", "", "Input hanya spasi akan dikembalikan sebagai string kosong");
    }

    @Test
    @Story("Input berupa angka penjumlahan yang valid")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi input berupa angka penjumlahan yang valid harus dibaca dengan benar")
    public void testAdditionInput() {
        testInput("10 + 5", "10 + 5", "Harus membaca penjumlahan sederhana");
    }

    @Test
    @Story("Input berupa angka pengurangan yang valid")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi input berupa angka pengurangan yang valid harus dibaca dengan benar")
    public void testNegativeSubtractionInput() {
        testInput("-3 - -7", "-3 - -7", "Harus membaca input dengan angka negatif");
    }

    @Test
    @Story("Input berupa angka perkalian yang valid")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi input berupa angka perkalian yang valid harus dibaca dengan benar")
    public void testInputZeroMultiplication(){
        testInput("0 * 123", "0 * 123", "Harus membaca input dengan angka nol");
    }

    @Test
    @Story("Input berupa angka pembagian yang valid")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi input berupa angka pembagian yang valid harus dibaca dengan benar")
    public void testInputBoundaryDivision() {
        testInput("32768 / 2", "32768 / 2", "Harus membaca input dengan pembagi nol");
    }

    @Test
    @Story("Input berupa angka penjumlahan diambang batas yang valid")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi input berupa angka penjumlahan diambang batas yang valid harus dibaca dengan benar")
    public void testInputBoundaryAddition() {
        testInput("-32768 + 32768", "-32768 + 32768", "Harus membaca input dengan angka maksimum");
    }

    @Test
    @Story("Input berupa kata keluar")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Memverifikasi input berupa kata keluar harus dibaca dengan benar")
    public void testKeluarCommand() {
        testInput("keluar", "keluar", "Input 'keluar' harus dikembalikan sebagai perintah keluar");
    }

}