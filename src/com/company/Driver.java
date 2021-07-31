package com.company;

import java.util.ArrayList;
import java.util.List;

public class Driver extends User{

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public List<RideDetail> getOfferedRideList() {
        return offeredRideList;
    }

    private List<Vehicle> vehicleList = new ArrayList<>();
    private List<RideDetail> offeredRideList = new ArrayList<>();


    public Driver(String name, Character sex, int age) {
        super(name, sex, age);
    }

    public RideDetail offerRide(String origin, String destination, String availSeats, int vehicleIndex) {

        RideDetail detail = new RideDetail();
        detail.setSource(origin);
        detail.setDestination(destination);
        detail.setVehicleUsed(vehicleList.get(vehicleIndex));
        detail.setAvailSeat(availSeats);

        offeredRideList.add(detail);

        return detail;

    }

    public void addVehicle(String model, String licenseNumber) {
        var vehicle = new Vehicle(model, licenseNumber);
        vehicleList.add(vehicle);
    }

    public void endRide(String rideId) {
        //removing the ride
        for (var ride: offeredRideList) {
            if (ride.getRideId() == rideId)
                ride.setEnded(true);
        }
    }

}
