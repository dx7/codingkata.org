package org.codingkata.unit;

import org.codingkata.unit.api.BaseKataSolution;

public class MyKata extends BaseKataSolution {
    /**
     * Calculate the ISBN-13 check digit
     *
     * @param isbn  an incomplete ISBN code (12 characters, no hyphens)
     * @return      code's check digit
     */
    public int calcCheckDigit (String isbn) {
        int total = 0;
        int[] coefficient = { 1, 3 };

        for (int i = 0; i < isbn.length(); i++) {
            total += Character.getNumericValue(isbn.charAt(i)) * coefficient[i % 2];
        }

        return 10 - total % 10;
    }
}
