package org.codingkata.unit;

import org.codingkata.unit.api.BaseKataSolution;
import java.util.Collections;
import java.util.List;

public class MyKata extends BaseKataSolution {
    /**
     * Sort a bunch of CDs alphabetically by their album title (A-Z)
     *
     * @param cds   unsorted list of album titles
     * @return      sorted list of titles
     */
    public List<String> sort (List<String> cds) {
        Collections.sort(cds); // :D
        return cds;
    }
}
