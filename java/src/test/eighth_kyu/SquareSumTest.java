package test.eighth_kyu;

import main.eighth_kyu.SquareSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareSumTest {
    @Test
    public void testBasic() {
        assertEquals(9, SquareSum.squareSum(new int[]{1, 2, 2}));
        assertEquals(5, SquareSum.squareSum(new int[]{1, 2}));
        assertEquals(50, SquareSum.squareSum(new int[]{5, -3, 4}));
        assertEquals(0, SquareSum.squareSum(new int[]{}));
    }
}