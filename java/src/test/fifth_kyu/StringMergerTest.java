package test.fifth_kyu;

import main.fifth_kyu.StringMerger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringMergerTest {
  @Test
  public void normalHappyFlow() {
    assertTrue(StringMerger.isMerge("codewars", "code", "wars"));
    assertTrue(StringMerger.isMerge("codewars", "cdwr", "oeas"));
    assertFalse(StringMerger.isMerge("codewars", "cod", "wars"));
  }
}