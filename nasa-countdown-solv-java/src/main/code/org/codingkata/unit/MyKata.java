package org.codingkata.unit;

import org.codingkata.unit.api.BaseKataSolution;

public class MyKata extends BaseKataSolution {
  
  public Integer[] countdown (int start) {
    int s = start;
    Integer[] counter = new Integer[start+1];
    
    for (int i = 0; i <= start; i++) counter[i] = s--;
    
    return counter;
  }  
}