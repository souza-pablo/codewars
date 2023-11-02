package test.eighth_kyu;

import main.eighth_kyu.Multiply;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyTest {

    @Test
    void testSomething() {
        Double multiply = Multiply.multiply(1d, 5d);
        assertEquals(5d, multiply);
    }
}