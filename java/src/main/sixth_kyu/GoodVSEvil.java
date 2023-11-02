package main.sixth_kyu;

import java.util.Arrays;
import java.util.stream.IntStream;

//  kata/52761ee4cffbc69732000738
public class GoodVSEvil {
  public static String battle(String goodAmounts, String evilAmounts) {
    int[] goods = Arrays.stream(goodAmounts.split(" ")).mapToInt(Integer::parseInt).toArray();
    int[] goodsValue = new int[]{1, 2, 3, 3, 4, 10};
    int[] evils = Arrays.stream(evilAmounts.split(" ")).mapToInt(Integer::parseInt).toArray();
    int[] evilsValue = new int[]{1, 2, 2, 2, 3, 5, 10};

    int finalGoodResult = IntStream.range(0, goods.length).map(i -> goods[i] * goodsValue[i]).sum();
    int finalEvilResult = IntStream.range(0, evils.length).map(i -> evils[i] * evilsValue[i]).sum();

    if (finalGoodResult > finalEvilResult) {
      return "Battle Result: Good triumphs over Evil";
    } else if (finalEvilResult > finalGoodResult) {
      return "Battle Result: Evil eradicates all trace of Good";
    } else {
      return "Battle Result: No victor on this battle field";
    }
  }

}
