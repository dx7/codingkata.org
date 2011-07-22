package org.codingkata.unit;

import org.codingkata.unit.api.BaseKataSolution;

public class MyKata extends BaseKataSolution {
    private float price;
    private int count;
    private int runtime;
    private Day day;
    private boolean isParquet;
    private boolean is3D;

    /**
     * (1) New customers arrive at your ticket booth and tell you
     * what movie they'd like to see (so keep it in mind ;-)
     *
     * @param runtime       movie's runtime in minutes
     * @param day           day of the week (enum)
     * @param isParquet     true if seating category is 'parquet' (and not 'loge')
     * @param is3D          true if the movie's shown in 3D
     */
    public void startPurchase(int runtime, Day day, boolean isParquet, boolean is3D) {
        this.price = 0;
        this.count = 0;
        this.runtime = runtime;
        this.day = day;
        this.isParquet = isParquet;
        this.is3D = is3D;
    }

    /**
     * (2) Add a ticket to the customers' bill
     *
     * @param age           the age of the ticket buyer in years
     * @param isStudent     true if the ticket buyer is a student
     */
    public void addTicket(int age, boolean isStudent) {
        count++;

        if (isStudent) price += 8;
        else if (age >= 65) price += 6;
        else if (age < 13) price += 5.5f;
        else price += 11;
    }

    /**
     * (3) Calculate the total admission for the current customer(s)
     *
     * @return  total in dollars
     */
    public float finishPurchase() {
        if (count > 20) price = count * 6;
        if (is3D) price += count * 3;
        if (runtime > 120) price += count * 1.5f;
        if (day.equals(Day.THU) && (count < 20)) price += count * -2;
        if (day.equals(Day.SAT) || day.equals(Day.SUN)) price += count * 1.5f;
        if (!isParquet) price += count * 2;

        return price;
    }
}
