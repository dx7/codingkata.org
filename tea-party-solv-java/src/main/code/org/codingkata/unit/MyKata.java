package org.codingkata.unit;

import org.codingkata.unit.api.BaseKataSolution;

public class MyKata extends BaseKataSolution {
  
  public String welcome (String name, boolean isWoman, boolean isSir) {
    String hello = "Hello ";
    
    hello += isWoman ? "Ms. " : isSir ? "Sir " : "Mr. ";
    hello += name;
    
    return hello;
  }
}