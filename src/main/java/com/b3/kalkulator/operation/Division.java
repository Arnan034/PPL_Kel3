package com.b3.kalkulator.operation;
import com.b3.kalkulator.validate.Divition;

public class Division {
    public double calculate(Integer a, Integer b) {
        Boolean isValidDivition = new Divition().validateDivition(b);
        if (!isValidDivition) {
            throw new IllegalArgumentException("Pembagi tidak boleh 0!");
        }
        return a / b;
    }
}