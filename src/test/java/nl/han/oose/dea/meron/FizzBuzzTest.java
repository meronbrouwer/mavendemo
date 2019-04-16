package nl.han.oose.dea.meron;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    private FizzBuzz sut;

    @BeforeEach
    void setup() {
        sut = new FizzBuzz();
    }

    @Test
    void testIfOneReturnOne() {
        // Setup

        // Test
        String returnNumber = sut.doFizzBuzz(1);

        // Verify
        Assertions.assertEquals("1", returnNumber);
    }

    @Test
    void testIfTwoReturnTwo() {
        // Setup

        // Test
        String returnNumber = sut.doFizzBuzz(2);

        // Verify
        Assertions.assertEquals("2", returnNumber);
    }
}
