package org.codingkata.unit;

import org.codingkata.unit.api.BaseKataSolution;

public class MyKata extends BaseKataSolution {
    private float price = 11.0f;
    private int count = 0;
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
        // if (runtime > 120) price += 1.5f;
        // if (day.equals(Day.THU)) price -= 2.0f;
        // if (day.equals(Day.SAT) || day.equals(Day.SUN)) price += 1.5f;
        // if (!isParquet) price += 2.0f;
        // if (is3D) price += 3.0f;
    }

    /**
     * (2) Add a ticket to the customers' bill
     *
     * @param age           the age of the ticket buyer in years
     * @param isStudent     true if the ticket buyer is a student
     */
    public void addTicket(int age, boolean isStudent) {
        float price = 11.0f;

        if (isStudent) price = 8.0f;
        if (age >= 65) price = 6.0f;
        if (age < 13) price = 5.5f;

        this.price += price;
        count++;
    }

    /**
     * (3) Calculate the total admission for the current customer(s)
     *
     * @return  total in dollars
     */
    public float finishPurchase() {
        if (count > 20) {
            price = count * 6.0f;
        }

        price += count * (is3D ? 3 : 0);
        price += count * (runtime > 120 ? 1.5f : 0);
        price += count * (day.equals(Day.THU) && (count < 20) ? -2 : 0);
        price += count * (day.equals(Day.SAT) || day.equals(Day.SUN) ? 1.5f : 0);
        price += count * (isParquet ? 0 : 2);

        return price;
    }
}
