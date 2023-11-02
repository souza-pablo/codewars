package test.eighth_kyu;

import main.eighth_kyu.ConvertNumberToAString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertNumberToAStringTest {
    @Test
    public void tests() {
        assertEquals("67", ConvertNumberToAString.numberToString(67));
        assertEquals("123", ConvertNumberToAString.numberToString(123));
        assertEquals("999", ConvertNumberToAString.numberToString(999));
    }
}