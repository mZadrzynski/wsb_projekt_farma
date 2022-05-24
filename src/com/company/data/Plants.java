package com.company.data;

import com.company.startupSet.Owner;

public class Plants {
    public Double feedCost; //per hector
    public Integer feedTime; //in weeks
    public Double protectCost; //per hector
    public Double harvestValue; //t per h
    public Double harvestCost;  //per hector
    public Integer[] growingTime = {10, 20}; // between weeks


    public Integer growingRate;
    public Double sellPrice; //per kg
    public Owner owner;

    public Plants(Double feedCost, Integer feedTime, Double protectCost, Double harvestValue, Double harvestCost, Double sellPrice, Integer growingRate) {
        this.feedCost = feedCost;
        this.feedTime = feedTime;
        this.protectCost = protectCost;
        this.harvestValue = harvestValue;
        this.harvestCost = harvestCost;
        this.sellPrice = sellPrice;
        this.growingRate = growingRate;
    }

    Plants rzodkiew = new Plants(50.0, 15, 30.0, 5.0, 50.0,5.0, 10);




}
