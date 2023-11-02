package test.eighth_kyu;

import main.eighth_kyu.CenturyFromYear;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CenturyFromYearTest {
    @Test
    public void FixedTests() {
        assertEquals(18, CenturyFromYear.century(1705));
        assertEquals(19, CenturyFromYear.century(1900));
        assertEquals(17, CenturyFromYear.century(1601));
        assertEquals(20, CenturyFromYear.century(2000));
        assertEquals(1,  CenturyFromYear.century(89));
    }
}