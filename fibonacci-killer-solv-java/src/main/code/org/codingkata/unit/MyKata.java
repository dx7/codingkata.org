package org.codingkata.unit;

import org.codingkata.unit.api.BaseKataSolution;

public class MyKata extends BaseKataSolution {
  
  public int fibonacci (int n) {
    if (n <= 1) return n;
    
    return fibonacci(n-1) + fibonacci(n-2);
  }
}