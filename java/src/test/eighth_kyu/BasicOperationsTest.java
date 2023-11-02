package test.eighth_kyu;

import main.eighth_kyu.BasicOperations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasicOperationsTest {
  @Test
  public void testBasics() {
    assertEquals(11, BasicOperations.basicMath("+", 4, 7));
    assertEquals(-3, BasicOperations.basicMath("-", 15, 18));
    assertEquals(25, BasicOperations.basicMath("*", 5, 5));
    assertEquals(7, BasicOperations.basicMath("/", 49, 7));
  }
}