package com.company;

public class Vehicle {
//    private String name;
    private String model;
    private String licenseNumber;

    public Vehicle(String model, String licenseNumber) {
//        this.name = name;
        this.model = model;
        this.licenseNumber = licenseNumber;
    }

    public String getModel() {
        return model;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }
}
