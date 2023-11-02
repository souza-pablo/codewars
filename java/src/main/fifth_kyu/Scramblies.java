package main.fifth_kyu;

import java.util.Arrays;
import java.util.List;

//  kata/55c04b4cc56a697bb0000048
public class Scramblies {
  public static boolean scramble(String str1, String str2) {
    String[] strings1 = str1.split("");
    String[] strings2 = str2.split("");

    List<String> list = new java.util.ArrayList<>(Arrays.stream(strings1).filter(str2::contains).toList());
    List<String> list2 = new java.util.ArrayList<>(Arrays.stream(strings2).toList());

    for (int i = 0; i < list2.size(); i++) {
      if (list.contains(list2.get(i))) {
        list.remove(list2.get(i));
        list2.remove(list2.get(i));
        i--;
      }
    }

    return list2.size() == 0;
  }
}
