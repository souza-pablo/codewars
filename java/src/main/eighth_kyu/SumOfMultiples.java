package main.eighth_kyu;

//  kata/57241e0f440cd279b5000829
public class SumOfMultiples {
  public static long sumMul(int n, int m) {
    if (n <= 0 || m <= 0) throw new IllegalArgumentException();

    int sum = 0;

    for (int i = 1; i < m; i++) {
      if (i % n == 0) sum += i;
    }

    return sum;
  }
}
