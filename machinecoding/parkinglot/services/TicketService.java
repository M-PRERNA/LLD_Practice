package com.learn.spring.lld.machinecoding.parkinglot.services;

import com.learn.spring.lld.machinecoding.parkinglot.models.*;
import com.learn.spring.lld.machinecoding.parkinglot.repositories.GateRepository;
import com.learn.spring.lld.machinecoding.parkinglot.repositories.TicketRepository;
import com.learn.spring.lld.machinecoding.parkinglot.repositories.VehicleRepository;
import com.learn.spring.lld.machinecoding.parkinglot.strategies.ParkingSlotAssignmentStrategyFactory;
import com.learn.spring.lld.machinecoding.parkinglot.strategies.SlotAssignmentStrategy;

import java.util.Optional;

public class TicketService {
    GateRepository gateRepository;
    VehicleRepository vehicleRepository;
    TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(String reg_num, String owner_name, String owner_number, VehicleType type, Long gate_id){
        //fetch the gate from the repository
        Optional<Gate> optGate = gateRepository.getById(gate_id);
        Gate gate = null;
        if(optGate.isEmpty()) {
            throw new RuntimeException("Gate Id doesn't exist!");
        }
        gate = optGate.get();
        // Get the operator
        Operator operator = gate.getOperator();

        // FindOrCreate Vehicle -
        Optional<Vehicle> optionalVehicle = vehicleRepository.getByRegNumber(reg_num);
        Vehicle vehicle;
        if(optionalVehicle.isEmpty()){
            vehicle = vehicleRepository.insert(new Vehicle(reg_num, owner_name, owner_number, type));
        }else{
            vehicle = optionalVehicle.get();
        }

        // Get Slot Assignment Strategy and get the slot
        SlotAllocationType slotAllocationType = gate.getParkingLot().getSlot_allocation_type();
        SlotAssignmentStrategy slotAssignmentStrategy = ParkingSlotAssignmentStrategyFactory.getStrategy(slotAllocationType);
        ParkingSlot slot = slotAssignmentStrategy.getAvailableSlot(gate.getParkingLot(), vehicle.getVehicleType());

        return ticketRepository.insert(new Ticket(gate, operator, slot, vehicle));
    }


}
