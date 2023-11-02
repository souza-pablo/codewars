package main.sixth_kyu;

import java.util.Objects;

//  kata/5277c8a221e209d3f6000b56
public class BraceChecker {
  public boolean isValid(String braces) {
    if (Objects.equals(braces, "")) return false;

    while (true) {
      if (braces.contains("{}")) {
        braces = braces.replace("{}", "");
        continue;
      }

      if (braces.contains("[]")) {
        braces = braces.replace("[]", "");
        continue;
      }

      if (braces.contains("()")) {
        braces = braces.replace("()", "");
        continue;
      }

      return Objects.equals(braces, "");
    }
  }
}
