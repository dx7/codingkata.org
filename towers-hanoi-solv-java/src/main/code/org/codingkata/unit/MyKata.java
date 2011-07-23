package org.codingkata.unit;

import org.codingkata.unit.api.BaseKataSolution;

public class MyKata extends BaseKataSolution {
    /**
     * Rearranges the tower by moving all discs from pole 1 to 3
     */
    public void rearrange() {
        move(1, 3);
        move(1, 2);
        move(3, 2);
        move(1, 3);
        move(2, 1);
        move(2, 3);
        move(1, 3);
    }
}
