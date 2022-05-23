package com.company.data;

public class Time {
    public Integer year = 2020;
    public Integer week = 0;

    public void round() {
        this.week ++;
        if (this.week > 52) {
            this.year ++;
            System.out.println("Dzisiaj mamy: " + this.year + " tydzien: " + this.week);
        }
    }
}
