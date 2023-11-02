package test.eighth_kyu;

import main.eighth_kyu.ConvertABooleanToAString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertABooleanToAStringTest {
    @Test
    void testTrue(){
        assertEquals("true", ConvertABooleanToAString.convert(true));
    }

    @Test void testFalse(){
        assertEquals("false", ConvertABooleanToAString.convert(false));
    }
}