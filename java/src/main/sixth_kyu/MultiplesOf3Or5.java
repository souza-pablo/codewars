package main.sixth_kyu;

//  kata/514b92a657cdc65150000006
public class MultiplesOf3Or5 {
  public int solution(int number) {
    int sum = 0;

    for (int i = 0; i < number; i++) {
      if (i % 3 == 0 || i % 5 == 0) sum += i;
    }

    return sum;
  }
}
