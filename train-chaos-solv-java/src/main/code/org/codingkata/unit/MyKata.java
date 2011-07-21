package org.codingkata.unit;

import org.codingkata.unit.api.BaseKataSolution;

public class MyKata extends BaseKataSolution {
    private Integer[] stack = new Integer[10];
    private int top = -1;

    /**
     * Adds a car to the siding
     *
     * @param car   a train car (represented by a number)
     */
    public void push (Integer car){
        stack[++top] = car;
    }

    /**
     * Removes a car from the siding
     *
     * @return  a train car (number), -1 if stack is empty
     */
    public Integer pop () {
        return top == -1 ? -1 : stack[top--];
    }

    /**
     * Return the current front car (number) without removing it
     *
     * @return  a train car (number), -1 if stack is empty
     */
    public Integer peek () {
        return top == -1 ? -1 : stack[top];
    }

}
