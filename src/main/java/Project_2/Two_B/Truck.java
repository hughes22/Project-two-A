package TwoB;

public class Truck extends Vehicle {

    int loadCapacity;

    public Truck(String vehicleType, String licenseNumber, int rentalRatePerDay, int loadCapacity) {

        super(vehicleType, licenseNumber, rentalRatePerDay);
        this.loadCapacity = loadCapacity;
    }
@Override
    public double calculateRentalCost(int daysRented) {
    if (this.loadCapacity >= 1000) {
        return getRentalRatePerDay() * daysRented + 50;
    } else if (this.loadCapacity < 1000) {
        return getRentalRatePerDay() * daysRented ;
    }  else {
        throw new IllegalArgumentException("Invalid number of load capacity, must be either more than 1000 or less than 1000");
    }
    }
}
