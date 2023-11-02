package main.sixth_kyu;

//  kata/545cedaa9943f7fe7b000048
public class PangramChecker {
  public boolean check(String sentence) {
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    for (int i = 0; i < alphabet.length(); i++) {
      if (!sentence.toLowerCase().contains(alphabet.substring(i, i + 1))) {
        return false;
      }
    }
    return true;
  }
}
