package com.learn.spring.lld.machinecoding.parkinglot.repositories;

import com.learn.spring.lld.machinecoding.parkinglot.models.Gate;
import com.learn.spring.lld.machinecoding.parkinglot.models.ParkingLot;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {
    Map<Long, Gate> gateTable = new TreeMap<>();
    static Long previousId = 0L;

    public Optional<Gate> getById(Long gateId){
        return Optional.ofNullable(gateTable.get(gateId));
    }

    public Gate insert(Gate gate){
        gate.setId(previousId++);
        gateTable.put(previousId, gate);
        return gate;
    }

    public ParkingLot getParkingLotFromGate(Gate gate){
        // Loop through all parking lots and check which has this gate
        return null;
    }
}
