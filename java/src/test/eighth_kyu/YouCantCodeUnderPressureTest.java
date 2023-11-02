package test.eighth_kyu;

import main.eighth_kyu.YouCantCodeUnderPressure;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YouCantCodeUnderPressureTest {
    @Test
    public final void test_all() {
        assertEquals(4, YouCantCodeUnderPressure.doubleInteger(2));
    }
}