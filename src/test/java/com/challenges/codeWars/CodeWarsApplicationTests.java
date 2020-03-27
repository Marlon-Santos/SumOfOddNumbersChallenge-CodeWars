package com.challenges.codeWars;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CodeWarsApplicationTests {
    @Test
    public void test1() {
        assertAll("testing pyramid",
                () -> assertEquals(1, CodeWarsApplication.rowSumOddNumbers(1)),
                () -> assertEquals(74088, CodeWarsApplication.rowSumOddNumbers(42))
        );
    }
}
