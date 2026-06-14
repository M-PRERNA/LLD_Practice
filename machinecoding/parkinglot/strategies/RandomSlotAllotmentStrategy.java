package com.learn.spring.lld.machinecoding.parkinglot.strategies;

import com.learn.spring.lld.machinecoding.parkinglot.models.*;

public class RandomSlotAllotmentStrategy implements SlotAssignmentStrategy{

    @Override
    public ParkingSlot getAvailableSlot(ParkingLot parkingLot, VehicleType type) {
        for(ParkingFloor floor : parkingLot.getFloors()){
            for(ParkingSlot parkingSlot : floor.getParkingSlots()){
                if(parkingSlot.getStatus().equals(ParkingSlotStatus.EMPTY) && parkingSlot.checkAllowedVehicle(type)){
                    parkingSlot.setStatus(ParkingSlotStatus.FILLED);
                    return parkingSlot;
                }
            }
        }

        return null;
    }

}
