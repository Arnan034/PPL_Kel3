package com.b3.kalkulator;

import com.b3.kalkulator.validate.*;

public class Calculator {
    public void start() {
        // Get input from InputScanner
        String input = new InputScanner().getInput();
        
        // jika ingin keluar
        if (input.equals("keluar")) {
            return;
        }

        String[] parts;
        try {
            parts = new Validation().validateInput(input);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        Integer angka1 = Integer.parseInt(parts[0]);
        String operasi = parts[1];
        Integer angka2 = Integer.parseInt(parts[2]);

        double hasil = new PerformCalculation().performCalculation(angka1, angka2, operasi);
        System.out.printf("%d %s %d = %.2f%n", angka1, operasi, angka2, hasil);
    }
}