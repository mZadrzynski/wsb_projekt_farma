package com.company.data;

import com.company.data.*;
import com.company.startupSet.*;

public class Time {
    public Integer year = 2020;
    public Integer week = 0;
    public Owner owner;

    public void time() {
        this.week ++;
        if (this.week > 52) {
            this.year ++;
            System.out.println("Dzisiaj mamy: " + this.year + " tydzien: " + this.week);
        }
        owner.plants.growingRate =- 10;
        if(owner.plants.growingRate == 0) {
            System.out.println("gotowy do spzedazy");
        }
      }
}
