package Project_2.Two_B;

public class Car extends Vehicle {
    int numSeats;

    public Car(String vehicleType, String licenseNumber, int rentalRatePerDay, int numSeats) {
        super(vehicleType, licenseNumber, rentalRatePerDay);
        this.numSeats = numSeats;

    }
@Override
    public double calculateRentalCost(int daysRented) {
        if (this.numSeats == 2) {
            return getRentalRatePerDay() * daysRented ;
        } else if (this.numSeats == 4) {
            return getRentalRatePerDay() * daysRented + 10;
        }
        else if (this.numSeats == 6) {
            return getRentalRatePerDay() * daysRented + 20 ;
        }
        else{
            throw new IllegalArgumentException("Invalid number of seats, must be either 2 or 4 or 6");
        }
    }
}
