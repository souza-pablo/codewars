package test.eighth_kyu;

import main.eighth_kyu.ReversedStrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversedStringsTest {
    @Test
    public void sampleTests() {
        assertEquals("dlrow", ReversedStrings.solution("world"));
    }
}