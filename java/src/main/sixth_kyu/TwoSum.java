package main.sixth_kyu;

import java.util.HashMap;
import java.util.Map;

//  kata/52c31f8e6605bcc646000082
public class TwoSum {
  public static int[] twoSum(int[] numbers, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    int complement;
    for (int i = 0; i < numbers.length; i++) {
      complement = target - numbers[i];

      if (map.containsKey(complement)) {
        return new int[]{map.get(complement), i};
      }

      map.put(numbers[i], i);
    }

    return null;
  }
}
