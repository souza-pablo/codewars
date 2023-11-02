package main.fifth_kyu;

import java.math.BigInteger;

//  kata/5511b2f550906349a70004e1 not done yet
public class LastDigitOfALargeNumber {
  public static int lastDigit(BigInteger n1, BigInteger n2) {
    int base = n1.mod(BigInteger.TEN).intValue(); // Obtém o último dígito do número base

    // Verifica se o expoente é igual a 0
    if (n2.equals(BigInteger.ZERO))
      return 1;

    // Reduz o expoente para um valor entre 0 e 3 (módulo 4)
    int exponent = n2.mod(BigInteger.valueOf(4)).intValue();

    // Calcula a potência usando as propriedades matemáticas
    int result = 1;
    for (int i = 0; i < exponent; i++) {
      result = (result * base) % 10;
    }

    //It's wrong, didn't pass the tests
    return result;
  }
}
