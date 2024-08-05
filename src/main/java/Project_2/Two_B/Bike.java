package Project_2.Two_B;

public class Bike extends Vehicle{
        private boolean hasCarrier;

    public Bike(String vehicleType, String licenseNumber, int rentalRatePerDay, boolean hasCarrier) {
        super(vehicleType, licenseNumber, rentalRatePerDay);
        this.hasCarrier = hasCarrier;
    }


    @Override
    public double calculateRentalCost(int daysRented) {
        if (this.hasCarrier) {
            return getRentalRatePerDay() * daysRented + 5;

        } else {
            return getRentalRatePerDay() * daysRented;
        }
        }
    }

