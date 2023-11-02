package test.eighth_kyu;

import main.eighth_kyu.SmallestIntegerArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestIntegerArrayTest {
    @Test
    public void example1(){
        int expected = 11;
        int actual = SmallestIntegerArray.findSmallestInt(new int[]{78,56,232,12,11,43});
        assertEquals(expected, actual);
    }


    @Test
    public void example2(){
        int expected = -33;
        int actual = SmallestIntegerArray.findSmallestInt(new int[]{78,56,-2,12,8,-33});
        assertEquals(expected, actual);
    }

    @Test
    public void example3(){
        int expected = Integer.MIN_VALUE;
        int actual = SmallestIntegerArray.findSmallestInt(new int[]{0,Integer.MIN_VALUE,Integer.MAX_VALUE});
        assertEquals(expected, actual);
    }
}