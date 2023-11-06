import org.testng.annotations.Test;
//import source; org.junit.Assert.assertEquals;

class Vehicle {
    private String licensePlate;
    private String make;
    private String model;
    private int year;
    private double mileage;
    private boolean isOperational;

    // Constructor
    public Vehicle(String licensePlate, String make, String model, int year, double mileage) {
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.isOperational = true;
    }

    public Vehicle() {

    }

    // Method to mark the vehicle as non-operational
    public void markAsNonOperational() {
        isOperational = false;
    }

    // Getters and setters for properties
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public boolean isOperational() {
        return isOperational;
    }
}
