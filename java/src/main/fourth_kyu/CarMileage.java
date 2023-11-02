package main.fourth_kyu;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//  kata/52c4dd683bfd3b434c000292 not done yet
public class CarMileage {
  public static final int[] ascSequence = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
  public static final int[] descSequence = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

  public static int isInteresting(int number, int[] awesomePhrases) {
    if (number <= 99) return 0;
    return 1;
  }

  public static boolean isFollowedByZeros(int number) {
    String n = String.valueOf(number);
    List<Integer> integerList =
            new ArrayList<>(Arrays.stream(n.split("")).mapToInt(Integer::parseInt).boxed().toList());
    integerList.remove(0);
    return integerList.stream().allMatch(integer -> integer.equals(0));
  }

  public static boolean isSameNumber(int number) {
    String n = String.valueOf(number);
    List<Integer> integerList =
            new ArrayList<>(Arrays.stream(n.split("")).mapToInt(Integer::parseInt).boxed().toList());
    return integerList.stream().distinct().count() == 1;
  }

  public static boolean isPalindrome(int number) {
    String n = String.valueOf(number);
    List<Integer> integerList =
            new ArrayList<>(Arrays.stream(n.split("")).mapToInt(Integer::parseInt).boxed().toList());

    return integerList == integerList.stream().sorted(Collections.reverseOrder()).toList();
  }

  public static boolean isAscSequence(int number) {
    String n = String.valueOf(number);
    List<Integer> integerList =
            new ArrayList<>(Arrays.stream(n.split("")).mapToInt(Integer::parseInt).boxed().toList());


    return false;
  }
}
