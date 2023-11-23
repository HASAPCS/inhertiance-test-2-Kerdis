

package com.example;

public class Appliance {
    // Attributes
    // TODO: Declare common attributes for electronic devices, such as brand and model and powerUsage.
    private String brand;
    private String model;
    private int powerUsage;

    // Constructor
    public Appliance(String brand, String model, int powerUsage) {
        // TODO: Initialize all attributes
        this.brand = brand;
        this.model = model;
        this.powerUsage = powerUsage;
    }

    // Getters
    // TODO: Implement getters for brand, model, and powerUsage
    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getPowerUsage() {
        return this.powerUsage;
    }

    // displayInfo Method
    // TODO: Implement a method that returns information about the appliance, including brand, model, and power usage.
    public String displayInfo() {
        return "Brand: " + getBrand() + ", " + "Model: " + getModel() + ", " + "Power Usage: " + getPowerUsage() + " Watts";
    }

    // Check the tests for more details

    // isEcoFriendly Method
    // TODO: Implement a method to check if the appliance is eco-friendly based on its power usage. 
    public String isEcoFriendly() {
        if (powerUsage > 400) {
            return ("The displayInfo method does not return the correct information.");
        }
        return ("Not eco friendly.");
    }
    // An appliance that uses less than 400 Watts of power is eco-friendly.

}

