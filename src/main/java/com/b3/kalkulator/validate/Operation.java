package com.b3.kalkulator.validate;

public class Operation {
    public Boolean validateOperation(String operation) {
        switch (operation) {
            case "+":
                return true;
            case "-":
                return true;
            case "*":
                return true;
            case "/":
                return true;
            default:
                return false;
        }
    }
}
