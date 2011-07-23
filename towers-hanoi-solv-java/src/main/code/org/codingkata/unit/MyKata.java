package org.codingkata.unit;

import org.codingkata.unit.api.BaseKataSolution;

public class MyKata extends BaseKataSolution {
    /**
     * Rearranges the tower by moving all discs from pole 1 to 3
     */
    public void rearrange() {
        move(3, 1, 2, 3);
    }

    private void move(int disk, int one, int two, int three) {
        if (disk != 0) {
            move(disk - 1, one, three, two);
            move(one, three);
            move(disk - 1, two, one, three);
        }
    }
}
