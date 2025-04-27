package com.b3.kalkulator.validate;

public class RangeNumber {
    public boolean validateRange(int number) {
        if (number < -32768 || number > 32767) {
            return false;
        }
        return true;
    }
}
