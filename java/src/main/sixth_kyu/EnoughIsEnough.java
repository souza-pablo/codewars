package main.sixth_kyu;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

//  kata/554ca54ffa7d91b236000023
public class EnoughIsEnough {
  public static int[] deleteNth(int[] elements, int maxOccurrences) {
    List<Integer> list = new java.util.ArrayList<>(Arrays.stream(elements).boxed().toList());
    for (int i = 0; i < elements.length; i++) {
      int finalI = i;
      int count =
              (int) list.subList(0, i).stream().filter(Objects::nonNull
              ).filter(integer -> integer.equals(list.get(finalI))).count();
      if (count >= maxOccurrences) {
        list.set(i, null);
      }
    }
    return list.stream().filter(Objects::nonNull).mapToInt(value -> value).toArray();
  }
}
