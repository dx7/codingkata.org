package org.codingkata.unit;

import org.codingkata.unit.api.BaseKataSolution;
import java.util.ArrayList;

public class MyKata extends BaseKataSolution {

    /**
     * Check if a number is a 'happy number'
     *
     * @param number    number to be checked
     * @return          true if parameter is a happy number
     */
    public boolean isHappy (long number) {
        long result = number;
        ArrayList<Long> used = new ArrayList<Long>();

        while (result != 1 && !used.contains(result)) {
            used.add(result);
            String number_string = String.valueOf(result);
            result = 0;

            for (char c: number_string.toCharArray()) {
                result += Math.pow(Character.getNumericValue(c), 2);
            }
        }

        return result == 1;
    }
}
