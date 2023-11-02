package test.sixth_kyu;

import main.sixth_kyu.MultiplesOf3Or5;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesOf3Or5Test {
  @Test
  public void test() {
    assertEquals(23, new MultiplesOf3Or5().solution(10));
  }
}