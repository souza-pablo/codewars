package test.fourth_kyu;

import main.fourth_kyu.StripComments;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StripCommentsTest {
  @Test
  public void stripComments() throws Exception {
    assertEquals(
            "apples, pears\ngrapes\nbananas",
            StripComments.stripComments( "apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" } )
    );

    assertEquals(
            "a\nc\nd",
            StripComments.stripComments( "a #b\nc\nd $e f g", new String[] { "#", "$" } )
    );

    assertEquals("a\n[ ]b\nc", StripComments.stripComments("a\n[ ]b\nc", new String[]{"#", "%"}));
  }
}