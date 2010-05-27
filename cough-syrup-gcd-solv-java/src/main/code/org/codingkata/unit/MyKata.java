package org.codingkata.unit;

import org.codingkata.unit.api.BaseKataSolution;

public class MyKata extends BaseKataSolution {
  
  public int calcGCD(int number1, int number2) {
    if (number2 == 0) return number1;
    return calcGCD(number2, number1 % number2);
  }
}