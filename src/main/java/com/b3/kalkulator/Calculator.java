package com.b3.kalkulator;

import com.b3.kalkulator.operation.*;
import com.b3.kalkulator.validate.*;
import java.util.Scanner;

public class Calculator {
    private Addition pertambahan;
    private Subtraction pengurangan;
    private Multiplication perkalian;
    private Division pembagian;

    public Calculator() {
        this.pertambahan = new Addition();
        this.pengurangan = new Subtraction();
        this.perkalian = new Multiplication();
        this.pembagian = new Division();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nKalkulator Dasar");
        System.out.println("Format: <angka1> <operasi> <angka2>");
        System.out.println("Operasi: + - * /");
        System.out.println("Contoh: 10 + 5");
        System.out.println("Ketik 'keluar' untuk mengakhiri");
        
        System.out.print("\nMasukkan perhitungan: ");
        String input = scanner.nextLine().trim();
        scanner.close();
        
        // Melakukan keluar kalkulator
        if (input.equalsIgnoreCase("keluar")) {
            System.out.println("=====> EXIT <=====");
            return;
        }

        // Melakukan validasi format input
        String checkFormatInput = new FormatInput().isValidFormat(input);
        if(!checkFormatInput.equals("Format Benar!")) {
            System.out.println(checkFormatInput);
            return;
        }

        // memproses input menjadi operasi kalkulator
        String[] parts = input.split(" ");
        Integer angka1 = Integer.parseInt(parts[0]);
        String operasi = parts[1];
        Integer angka2 = Integer.parseInt(parts[2]);

        // Melakukan validasi range angka
        Boolean isValidRange = new RangeNumber().validateRange(angka1) && new RangeNumber().validateRange(angka2);
        if (!isValidRange) {
            System.out.println("Angka harus dalam rentang -32768 hingga 32767!");
            return;
        }

        // Melakukan validasi operasi
        Boolean isValidOperation = new Operation().validateOperation(operasi);
        if (!isValidOperation) {
            System.out.println("Operasi tidak valid! Gunakan +, -, *, atau /");
            return;
        }

        // Melakukan validasi pembagian dengan angka 0
        Boolean isValidDivition = new Divition().validateDivition(angka2);
        if (!isValidDivition) {
            System.out.println("Pembagian dengan angka 0 tidak valid!");
            return;
        }

        double hasil = 0;
        switch (operasi) {
            case "+":
                hasil = pertambahan.calculate(angka1, angka2);
                break;
            case "-":
                hasil = pengurangan.calculate(angka1, angka2);
                break;
            case "*":
                hasil = perkalian.calculate(angka1, angka2);
                break;
            case "/":
                hasil = pembagian.calculate(angka1, angka2);
                break;
        }
        System.out.printf("%d %s %d = %.2f%n", angka1, operasi, angka2, hasil);
    }
}