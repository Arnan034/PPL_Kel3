package com.b3.kalkulator.validate;

public class FormatInput {
    public void isValidFormat(String input) {
        if (input.isEmpty()) {
            throw new IllegalArgumentException("Input tidak boleh kosong!");
        }
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            throw new IllegalArgumentException( 
                "Format input tidak valid! Harus ada 3 bagian: <angka1> <operasi> <angka2>"
                );
        }

        try {
            Integer.parseInt(parts[0]);
            Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException( "Input harus berupa angka integer!");
        }
    }
}
