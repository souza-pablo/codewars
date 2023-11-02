package main.eighth_kyu;

import java.util.Arrays;

//  kata/515e271a311df0350d00000f
public class SquareSum {
    public static int squareSum(int[] n) {
        return Arrays.stream(n).map(operand -> (int) Math.pow(operand, 2)).sum();
    }
}
