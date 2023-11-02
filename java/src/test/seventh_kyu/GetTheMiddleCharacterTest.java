package test.seventh_kyu;

import main.seventh_kyu.GetTheMiddleCharacter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetTheMiddleCharacterTest {
  @Test
  public void evenTests() {
    assertEquals("es", GetTheMiddleCharacter.getMiddle("test"));
    assertEquals("dd", GetTheMiddleCharacter.getMiddle("middle"));
  }

  @Test
  public void oddTests() {
    assertEquals("t", GetTheMiddleCharacter.getMiddle("testing"));
    assertEquals("A", GetTheMiddleCharacter.getMiddle("A"));
  }
}