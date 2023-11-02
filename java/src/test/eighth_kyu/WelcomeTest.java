package test.eighth_kyu;

import main.eighth_kyu.Welcome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WelcomeTest {
  @Test
  public void exampleTest() {
    assertEquals("Welcome", Welcome.greet("english"));
    assertEquals("Welkom", Welcome.greet("dutch"));
    assertEquals("Welcome", Welcome.greet("IP_ADDRESS_INVALID"));
  }
}