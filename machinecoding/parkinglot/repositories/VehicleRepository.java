package com.learn.spring.lld.machinecoding.parkinglot.repositories;

import com.learn.spring.lld.machinecoding.parkinglot.models.Vehicle;

import java.util.Optional;

public class VehicleRepository {
    public Optional<Vehicle> getByRegNumber(String reg_num){
        return Optional.empty();
    }

    public Vehicle insert(Vehicle vehicle){
        return vehicle;
    }
    //findOrCreate
    public Vehicle upsert(Vehicle vehicle){
        return vehicle;
    }
}
