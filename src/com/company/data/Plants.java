package com.company.data;

public class Plants {
    public Double feedCost;
    public Integer feedTime;
    public Double protectCost;
    public Double harvestValue;
    public Double harvestCost;
    public Integer growingTime;
    public Double sellPrice;

    public Plants(Double feedCost, Integer feedTime, Double protectCost, Double harvestValue, Double harvestCost, Integer growingTime, Double sellPrice) {
        this.feedCost = feedCost;
        this.feedTime = feedTime;
        this.protectCost = protectCost;
        this.harvestValue = harvestValue;
        this.harvestCost = harvestCost;
        this.growingTime = growingTime;
        this.sellPrice = sellPrice;
    }
}
