package com.company.data;

public class Time {
    public Integer year = 2020;
    public Integer week = 1;

    public void round() {
        this.week ++;
        if (week > 52) {
            this.year ++;
        }
    }
}
