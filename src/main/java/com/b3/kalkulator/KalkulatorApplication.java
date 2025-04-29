// Project: kalkulator PPL Praktikum
// Created by: b3 (Arnanda, Hanif, Zahran)

package com.b3.kalkulator;
// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KalkulatorApplication {
    public static void main(String[] args) {
        Calculator kalkulator = new Calculator();
        kalkulator.start();
    }
}
