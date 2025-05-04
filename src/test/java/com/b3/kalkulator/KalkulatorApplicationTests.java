package com.b3.kalkulator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = KalkulatorApplication.class)
class KalkulatorApplicationTests {

    @Test
    void contextLoads() {
        assertTrue(true, "Application context should load");
    }
    
    // Remove the manual test call as it's not the proper way to run tests
    // JUnit will automatically discover and run AdditionTest
}
