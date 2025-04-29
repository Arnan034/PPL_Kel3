package com.b3.kalkulator;

import com.b3.kalkulator.operation.*;
import com.b3.kalkulator.validate.*;

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