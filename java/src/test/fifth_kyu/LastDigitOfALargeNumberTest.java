package test.fifth_kyu;

import main.fifth_kyu.LastDigitOfALargeNumber;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class LastDigitOfALargeNumberTest {
  @Test
  public void testSomething() {
    assertEquals(8, LastDigitOfALargeNumber.lastDigit(new BigInteger("2"), new BigInteger("7")));
    assertEquals(4, LastDigitOfALargeNumber.lastDigit(new BigInteger("4"), new BigInteger("1")));
    assertEquals(6, LastDigitOfALargeNumber.lastDigit(new BigInteger("4"), new BigInteger("2")));
    assertEquals(9, LastDigitOfALargeNumber.lastDigit(new BigInteger("9"), new BigInteger("7")));
  }
}