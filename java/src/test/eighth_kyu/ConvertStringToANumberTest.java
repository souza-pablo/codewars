package test.eighth_kyu;

import main.eighth_kyu.ConvertStringToANumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertStringToANumberTest {
    @Test
    public void test1() {
        assertEquals(1234, ConvertStringToANumber.stringToNumber("1234"));
    }

    @Test
    public void test2() {
        assertEquals(605, ConvertStringToANumber.stringToNumber("605"));
    }

    @Test
    public void test3() {
        assertEquals(1405, ConvertStringToANumber.stringToNumber("1405"));
    }

    @Test
    public void test4() {
        assertEquals(-7, ConvertStringToANumber.stringToNumber("-7"));
    }
}