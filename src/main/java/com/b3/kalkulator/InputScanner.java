package com.b3.kalkulator;

import java.util.Scanner;

public class InputScanner {
    private Scanner scanner;

    public InputScanner() {
        this.scanner = new Scanner(System.in);
    }

    public String getInput() {
        System.out.println("\nKalkulator Dasar");
        System.out.println("Format: <angka1> <operasi> <angka2>");                         
        System.out.println("Operasi: + - * /");
        System.out.println("Contoh: 10 + 5");
        System.out.println("Ketik 'keluar' untuk mengakhiri");
        
        System.out.print("\nMasukkan perhitungan: ");
        String input = scanner.nextLine().trim();

        if (input.equalsIgnoreCase("keluar")) {
            System.out.println("=====> EXIT <=====");
            return "keluar";
        }

        return input;
    }
}