package main.eighth_kyu;

import java.util.Arrays;

//  kata/55a2d7ebe362935a210000b2
public class SmallestIntegerArray {
    public static int findSmallestInt(int[] args) {
        return Arrays.stream(args).min().orElseThrow();
    }
}
