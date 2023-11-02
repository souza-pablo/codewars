package test.sixth_kyu;

import main.sixth_kyu.PangramChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PangramCheckerTest {
  @Test
  public void test1() {
    String pangram1 = "The quick brown fox jumps over the lazy dog.";
    PangramChecker pc = new PangramChecker();
    assertTrue(pc.check(pangram1));
  }
  @Test
  public void test2() {
    String pangram2 = "You shall not pass!";
    PangramChecker pc = new PangramChecker();
    assertFalse(pc.check(pangram2));
  }
}