package main.fifth_kyu;

import java.util.Arrays;

//  kata/5270d0d18625160ada0000e4
public class Greed {
  static int ONE;
  static int TWO;
  static int THREE;
  static int FOUR;
  static int FIVE;
  static int SIX;

  public static int greedy(int[] dice) {
    ONE = 0; TWO = 0; THREE = 0; FOUR = 0; FIVE = 0; SIX = 0;
    int[] array = Arrays.stream(dice).map(Greed::transform).toArray();
    return Arrays.stream(array).sum();
  }

  public static int transform(int i) {

    return switch (i) {
      case 1 -> {
        ONE++;
        if (ONE % 3 == 0) {
          yield 800;
        }
        yield 100;
      }
      case 2 -> {
        TWO++;
        if (TWO % 3 == 0) {
          yield 200;
        }
        yield 0;
      }
      case 3 -> {
        THREE++;
        if (THREE % 3 == 0) {
          yield 300;
        }
        yield 0;
      }
      case 4 -> {
        FOUR++;
        if (FOUR % 3 == 0) {
          yield 400;
        }
        yield 0;
      }
      case 5 -> {
        FIVE++;
        if (FIVE % 3 == 0) {
          yield 400;
        }
        yield 50;
      }
      case 6 -> {
        SIX++;
        if (SIX % 3 == 0) {
          yield 600;
        }
        yield 0;
      }
      default -> 0;
    };
  }
}

