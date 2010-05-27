package org.codingkata.unit;

import org.codingkata.unit.api.BaseKataSolution;

public class MyKata extends BaseKataSolution {
  public String revert (String word) {
    if (word.length() == 1) return word;
    return revert(word.substring(1)) + word.charAt(0);
  }
}