package org.codingkata.unit;

import org.codingkata.unit.api.BaseKataSolution;

public class MyKata extends BaseKataSolution {

  public String translate (String text, String[][] dictionary) {
    for(String[] slang: dictionary) text = text.replace("$" + slang[0] + "$", slang[1]);

    return text;
  }
}