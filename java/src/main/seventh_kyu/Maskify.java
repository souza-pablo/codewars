package main.seventh_kyu;

//  kata/5412509bd436bd33920011bc
public class Maskify {
  public static String maskify(String str) {
    String res = str;
    if (str.length() > 4) {
      res = "#".repeat(str.substring(0, str.length() - 4).length()) + str.substring(str.length() - 4);
    }
    return res;
  }
}
