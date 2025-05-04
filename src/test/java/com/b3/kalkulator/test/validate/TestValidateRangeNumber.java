// package com.b3.kalkulator.test.validate;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;

// import com.b3.kalkulator.validate.RangeNumber;

// public class TestValidateRangeNumber {
//     private RangeNumber rangeNumber;

//     @BeforeEach
//     public void setUp() {
//         rangeNumber = new RangeNumber();
//     }

//     @Test
//     public void testValidateRangeNumberValid() {
//         // (1) Setup (arrage, build)
//         Integer angka = -32768;
//         boolean actual;
        
//         // (2) Excercise (act, operate)
//         actual = rangeNumber.validateRange(angka);
        
//         // (3) Verify (assert, check
//         boolean expected = true;
//         assertEquals(expected, actual, "-32768 is within the valid range");
//     }
// }
