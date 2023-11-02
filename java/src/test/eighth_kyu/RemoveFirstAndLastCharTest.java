package test.eighth_kyu;

import main.eighth_kyu.RemoveFirstAndLastChar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveFirstAndLastCharTest {
    @Test
    public void testRemoval() {
        assertEquals("loquen", RemoveFirstAndLastChar.remove("eloquent"));
        assertEquals("ountr", RemoveFirstAndLastChar.remove("country"));
        assertEquals("erso", RemoveFirstAndLastChar.remove("person"));
        assertEquals("lac", RemoveFirstAndLastChar.remove("place"));
    }
}