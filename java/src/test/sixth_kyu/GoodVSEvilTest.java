package test.sixth_kyu;

import main.sixth_kyu.GoodVSEvil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodVSEvilTest {
  @Test
  public void testEvilWin() {
    assertEquals("Battle Result: Evil eradicates all trace of Good",
            GoodVSEvil.battle("1 1 1 1 1 1", "1 1 1 1 1 1 1"));
  }

  @Test
  public void testGoodWin() {
    assertEquals("Battle Result: Good triumphs over Evil",
            GoodVSEvil.battle("0 0 0 0 0 10", "0 1 1 1 1 0 0"));
  }

  @Test
  public void testTie() {
    assertEquals("Battle Result: No victor on this battle field",
            GoodVSEvil.battle("1 0 0 0 0 0", "1 0 0 0 0 0 0"));
  }
}