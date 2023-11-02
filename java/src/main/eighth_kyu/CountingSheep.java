package main.eighth_kyu;

import java.util.Arrays;
import java.util.Collections;

//  kata/54edbc7200b811e956000556
public class CountingSheep {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        return Collections.frequency(Arrays.asList(arrayOfSheeps), true);
    }
}
