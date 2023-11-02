package main.seventh_kyu;

//  kata/56747fd5cb988479af000028
public class GetTheMiddleCharacter {
  public static String getMiddle(String word) {
    double middle = (double) word.length() / 2;

    if (word.length() % 2 == 0) {
      int i = (int) middle;
      return word.substring(i - 1, i + 1);
    } else {
      int i = (int) Math.floor(middle);
      return word.substring(i, i + 1);
    }
  }
}
