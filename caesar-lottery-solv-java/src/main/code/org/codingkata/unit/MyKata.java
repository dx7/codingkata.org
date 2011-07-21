package org.codingkata.unit;

import org.codingkata.unit.api.BaseKataSolution;

public class MyKata extends BaseKataSolution {

    /**
     * Convert an Arabic numeral to Roman numeral
     *
     * @param number    an Arabic numeral
     * @return          the Roman numeral equivalent to the Arabic numeral
     */
    public String convert (int number) {
        String[] units = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
        String[] tens  = { "", "X", "XX", "XXX", "XL", "L" };

        return tens[number / 10] + units[number % 10];
    }
}
