package org.codingkata.unit;

import org.codingkata.unit.api.BaseKataSolution;

public class MyKata extends BaseKataSolution {
  
  public String answer (int number) {
    String result = "";
    
    if (number % 3 == 0) result += "fizz";
    if (number % 5 == 0) result += "buzz";

    if (result.isEmpty()) return String.valueOf(number);
    return result;
  }
}