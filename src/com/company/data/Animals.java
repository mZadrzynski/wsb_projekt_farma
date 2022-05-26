package com.company.data;

public class Animals {
    public Double price;

    public Animals(Double price, Integer growingRate, Integer feedConsumption, String feedType, Double reproductionRate) {
        this.price = price;
        this.growingRate = growingRate;
        this.feedConsumption = feedConsumption;
        this.feedType = feedType;
        this.reproductionRate = reproductionRate;
    }

    public Integer growingRate;
    public Integer feedConsumption;
    public String feedType;
    public Double reproductionRate;
}

