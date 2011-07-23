package org.codingkata.unit;

import org.codingkata.unit.api.BaseKataSolution;

public class MyKata extends BaseKataSolution {
    /**
     * Calculate the position to stand in order to survive
     *
     * @param size      size of the circle
     * @param skip      persons to skip each round
     */
    public int calcSurvivalPosition (int size, int skip) {
        return f(size, skip) + 1;
    }

    private int f (int size, int skip) {
        if (size == 1) return 0;
        return (f(size - 1, skip) + skip) % size;
    }
}
