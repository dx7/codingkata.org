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

        for (int i = 0; i < isbn.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(isbn.charAt(i)));

            if (i % 2 == 1) {
                total += digit * 3;
            } else {
                total += digit;
            }
        }

        return 10 - total % 10;
    }
}
