package main.eighth_kyu;

import java.util.Arrays;

//  kata/5715eaedb436cf5606000381
public class SumOfPositive {
    public static int sum(int[] arr) {
        return Arrays.stream(arr).filter(value -> value > 0).sum();
    }
}
