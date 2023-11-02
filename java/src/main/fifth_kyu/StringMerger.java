package main.fifth_kyu;

//  kata/54c9fcad28ec4c6e680011aa not done yet
public class StringMerger {
  public static boolean isMerge(String s, String part1, String part2) {
    if (s.isEmpty()) return false;

    return part1.concat(part2).equals(s) || alternateLetters(s, part1, part2);
  }

  public static boolean alternateLetters(String s, String part1, String part2) {
    if (part2.length() > part1.length()) return false;

    StringBuilder stringBuilder = new StringBuilder();

    int count = 0;

    for (int i = 0; i < s.length(); i++) {
      if (i % 2 == 0) {
        try {
          stringBuilder.append(part1.charAt(count));
        } catch (IndexOutOfBoundsException e) {
          return false;
        }
      } else {
        try {
          stringBuilder.append(part2.charAt(count));
        } catch (IndexOutOfBoundsException e) {
          return false;
        }
        count++;
      }
    }

    return stringBuilder.toString().equals(s);
  }
}
