package com.assignment.question;

public class SurgeBasedPricingStrategy implements PricingStrategy{
    @Override
    public PricingType supportsType(){
        return PricingType.SURGE;

    }
    @Override
    public Double calculatePrice(RideDetails rideDetails){
        return BASE_FARE * SURGE_MULTIPLIER;
    }
}
