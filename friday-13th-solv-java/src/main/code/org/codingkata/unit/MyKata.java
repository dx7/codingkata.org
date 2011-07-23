package org.codingkata.unit;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
import org.codingkata.unit.api.BaseKataSolution;

public class MyKata extends BaseKataSolution {
    /**
     * Calculate the first 'Friday the 13th' before the targeted date
     *
     * @param target    desired time travel date
     * @return          Date of the closest 'Friday the 13th' before target
     */
    public Date adjacentFriday13th (Date target) {
        Calendar date = new GregorianCalendar();
        date.setTime(target);

        date.set(GregorianCalendar.DAY_OF_MONTH, 13);

        while (date.get(Calendar.DAY_OF_WEEK) != Calendar.FRIDAY) {
            date.add(Calendar.MONTH, -1);
        }

        return date.getTime();
    }
}
