package org.codingkata.unit;

import org.codingkata.unit.api.BaseKataSolution;

public class MyKata extends BaseKataSolution {

  public boolean containsPrimeNumber (String code1, String code2, String code3) {
    return isPrime(digitsSum(code1)) || isPrime(digitsSum(code2)) || isPrime(digitsSum(code3));
  }
  
   int digitsSum(String number) {
    int total = 0;
    
    for (int i = 0; i < number.length(); i++) total += (int) number.charAt(i);

    return total;
  }
  
   boolean isPrime(int number) {
    for (int i = 3; i < number; i++) {
      if (number % i == 0) return false;
    }
    return true;
  }
}