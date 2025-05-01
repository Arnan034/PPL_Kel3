package com.b3.kalkulator.test;

import org.junit.jupiter.api.Test;
import com.b3.kalkulator.InputScanner;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;


public class InputScannerTest {

    private void testInput(String simulatedInput, String expectedOutput, String message) {
        // (1) Setup
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream((simulatedInput + "\n").getBytes()));
        InputScanner scanner = new InputScanner();

        // (2) Exercise
        String actual = scanner.getInput();

        // (3) Verify
        assertEquals(expectedOutput, actual, message);

        System.setIn(originalIn);
    }

    @Test
    public void testTextStringInput() {
        testInput("hello world", "hello world", "Harus membaca input berupa teks");
    }

    @Test
    public void testSymbolInput() {
        testInput("!@# $%^ &*()", "!@# $%^ &*()", "Harus membaca simbol dengan benar");
    }
    
    @Test
    public void testMixedCharacterInput() {
        testInput("123abc + xyz", "123abc + xyz", "Harus membaca input campuran");
    }

    @Test
    public void testSpacesOnlyInput() {
        testInput("    ", "", "Input hanya spasi akan dikembalikan sebagai string kosong");
    }

    @Test
    public void testAdditionInput() {
        testInput("10 + 5", "10 + 5", "Harus membaca penjumlahan sederhana");
    }

    @Test
    public void testNegativeSubtractionInput() {
        testInput("-3 - -7", "-3 - -7", "Harus membaca input dengan angka negatif");
    }

    @Test
    public void testInputZeroMultiplication(){
        testInput("0 * 123", "0 * 123", "Harus membaca input dengan angka nol");
    }

    @Test
    public void testInputBoundaryDivision() {
        testInput("32768 / 2", "32768 / 2", "Harus membaca input dengan pembagi nol");
    }

    @Test
    public void testInputBoundaryAddition() {
        testInput("-32768 + 32768", "-32768 + 32768", "Harus membaca input dengan angka maksimum");
    }

    @Test
    public void testKeluarCommand() {
        testInput("keluar", "keluar", "Input 'keluar' harus dikembalikan sebagai perintah keluar");
    }

}
