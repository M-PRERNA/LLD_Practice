package com.assignment.question;

public class PricingManager {


    private PricingType pricingType;
    private PricingStrategy pricingStrategy;

    public PricingManager(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public PricingManager(PricingType pricingType,
                          PricingStrategy pricingStrategy) {
        this.pricingType = pricingType;
        this.pricingStrategy = pricingStrategy;
    }

    public Double calculatePrice(RideDetails rideDetails) {
        return this.pricingStrategy.calculatePrice(rideDetails);
        // throw new IllegalArgumentException("Invalid pricing type");
    }

}