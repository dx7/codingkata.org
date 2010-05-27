package org.codingkata.unit;

import org.codingkata.unit.api.BaseKataSolution;

public class MyKata extends BaseKataSolution {
  
  public String rewrite (String url) {
    String[][] patterns = { { "^/article/([0-9]+)", "/article?id=$1" }
                           ,{ "^/guide/(.+)/2008/(.+)?", "/guide/$1/2009/$2" }
                           ,{ "^/company/([^/]+)/?$", "/company?country=$1" }
                           ,{ "^/company/(.+)/([^/]+)/?$", "/company?country=$1&city=$2" }};
    
    for (String[] regex: patterns)
      url = url.replaceFirst(regex[0], regex[1]);
    
    return url;
  }
}