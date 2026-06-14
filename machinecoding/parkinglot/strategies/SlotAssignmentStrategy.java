package com.learn.spring.lld.machinecoding.parkinglot.strategies;

import com.learn.spring.lld.machinecoding.parkinglot.models.ParkingLot;
import com.learn.spring.lld.machinecoding.parkinglot.models.ParkingSlot;
import com.learn.spring.lld.machinecoding.parkinglot.models.VehicleType;

public interface SlotAssignmentStrategy {
    public ParkingSlot getAvailableSlot(ParkingLot parkingLot, VehicleType type);
}
