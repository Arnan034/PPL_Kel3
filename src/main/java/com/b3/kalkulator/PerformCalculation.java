package com.b3.kalkulator;
import com.b3.kalkulator.operation.*;

public class PerformCalculation {
    private Addition pertambahan = new Addition();
    private Subtraction pengurangan = new Subtraction();
    private Multiplication perkalian = new Multiplication();
    private Division pembagian = new Division();
    
    public PerformCalculation(){
        this.pertambahan = new Addition();
        this.pengurangan = new Subtraction();
        this.perkalian = new Multiplication();
        this.pembagian = new Division();
    }

    public double performCalculation(Integer angka1, Integer angka2, String operasi){
        switch (operasi) {
            case "+":
                return pertambahan.calculate(angka1, angka2);
            case "-":
                return pengurangan.calculate(angka1, angka2);
            case "*":
                return perkalian.calculate(angka1, angka2);
            case "/":
                return pembagian.calculate(angka1, angka2);
            default:
                return 0.0;
        }
    }
}