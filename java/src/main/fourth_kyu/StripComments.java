package main.fourth_kyu;

import java.util.Arrays;

//  kata/51c8e37cee245da6b40000bd
public class StripComments {
  public static String stripComments(String text, String[] commentSymbols) {
    String[] lines = text.split("\\n");

    String[] res = new String[lines.length];

    for (int i = 0; i < lines.length; i++) {
      if (Arrays.stream(commentSymbols).anyMatch(lines[i]::contains)) {
        res[i] = lines[i].substring(0,
                lines[i].indexOf(Arrays.stream(commentSymbols).filter(lines[i]::contains).findFirst().get())).stripTrailing();
      } else {
        res[i] = lines[i].stripTrailing();
      }
    }
    return String.join("\n", res);
  }
}
