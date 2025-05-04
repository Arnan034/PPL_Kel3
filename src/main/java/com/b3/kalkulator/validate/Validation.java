package com.b3.kalkulator.validate;

public class Validation {
    private FormatInput formatInput;
    private RangeNumber rangeNumber;
    private Operation operation;
    private DivisionValidate divisionValidate;

    public Validation() {
        this.formatInput = new FormatInput();
        this.rangeNumber = new RangeNumber();
        this.operation = new Operation();
        this.divisionValidate = new DivisionValidate();
    }

    public String[] validateInput(String input) throws IllegalArgumentException {
        // Melakukan validasi format input
        try {
            formatInput.isValidFormat(input);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage());
        }

        // Memproses input menjadi operasi kalkulator
        String[] parts = input.split(" ");
        Integer angka1 = Integer.parseInt(parts[0]);
        String operasi = parts[1];
        Integer angka2 = Integer.parseInt(parts[2]);

        // Melakukan validasi range angka
        Boolean isValidRange = rangeNumber.validateRange(angka1) && rangeNumber.validateRange(angka2);
        if (!isValidRange) {
            throw new IllegalArgumentException("Angka harus dalam rentang -32768 hingga 32767!");
        }

        // Melakukan validasi operasi
        Boolean isValidOperation = operation.validateOperation(operasi);
        if (!isValidOperation) {
            throw new IllegalArgumentException("Operasi tidak valid! Gunakan +, -, *, atau /");
        }

        // Melakukan validasi pembagian dengan angka 0
        if (operasi.equals("/")) {
            Boolean isValidDivition = divisionValidate.validateDivision(angka2);
            if (!isValidDivition) {
                throw new IllegalArgumentException("Pembagian dengan angka 0 tidak valid!");
            }
        }
            
        return parts;
    }
}
