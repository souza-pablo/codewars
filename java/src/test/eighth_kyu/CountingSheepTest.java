package test.eighth_kyu;

import main.eighth_kyu.CountingSheep;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingSheepTest {
    Boolean[] array1 = {true,  true,  true,  false,
            true,  true,  true,  true ,
            true,  false, true,  false,
            true,  false, false, true ,
            true,  true,  true,  true ,
            false, false, true,  true };

    @Test
    public void test() {
        assertEquals(17, new CountingSheep().countSheeps(array1));
    }
}