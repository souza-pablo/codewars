package test.fifth_kyu;

import main.fifth_kyu.Greed;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreedTest {
  @Test
  public void testExample() {
    assertEquals(250, Greed.greedy(new int[]{2,2,5,4,2}));
    assertEquals(150, Greed.greedy(new int[]{1,5,4,3,6}));
    assertEquals(450, Greed.greedy(new int[]{2,4,4,5,4}));
  }
}