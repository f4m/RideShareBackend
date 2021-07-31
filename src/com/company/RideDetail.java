package com.company;


//To keep all the offered and completed rides

public class RideDetail {
    private String rideId;
    private String source;
    private String destination;
    private String driverName;
    private  String riderName;
    private Vehicle vehicleUsed;
    private String availSeat;
    private boolean isEnded;

    public boolean getEnded() {
        return isEnded;
    }

    public void setEnded(boolean ended) {
        isEnded = ended;
    }


    public void setAvailSeat(String availSeat) {
        this.availSeat = availSeat;
    }

    public String getRideId() {
        return rideId;
    }

    public void setRideId(String rideId) {
        this.rideId = rideId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getRiderName() {
        return riderName;
    }

    public void setRiderName(String riderName) {
        this.riderName = riderName;
    }

    public Vehicle getVehicleUsed() {
        return vehicleUsed;
    }

    public void setVehicleUsed(Vehicle vehicleUsed) {
        this.vehicleUsed = vehicleUsed;
    }
}
