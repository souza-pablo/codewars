package test.eighth_kyu;

import main.eighth_kyu.OppositeNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OppositeNumberTest {
    @Test
    public void tests() {
        assertEquals(-1, OppositeNumber.opposite(1));
    }
}