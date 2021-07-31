package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Rider rider = new Rider("Rahul", 'M', 35);
        User.addUser(rider);
        Driver driver = new Driver("Shashank", 'M', 29);
        driver.addVehicle("Activa", "KA-12-12332");
        
    }
}
