package com.learn.spring.lld.machinecoding.parkinglot.strategies;

public class ParkingSlotAssignmentStrategyFactory {
    public static SlotAssignmentStrategy getStrategy(SlotAllocationType type){
        if(type.equals(SlotAllocationType.RANDOM)){
            return new RandomSlotAllotmentStrategy();
        }else{
            throw new RuntimeException("Slot allocation type doesn't exist");
        }
    }
}
