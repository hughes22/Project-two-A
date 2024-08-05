package Project_2.Two_B;

public class Vehicle {
    private String vehicleType;
    private String licenseNumber;
    private int rentalRatePerDay;


    public Vehicle(String vehicleType, String licenseNumber, int rentalRatePerDay) {
        this.vehicleType = vehicleType;
        this.licenseNumber = licenseNumber;
        this.rentalRatePerDay = rentalRatePerDay;

    }

    public String getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getRentalRatePerDay() {
        return rentalRatePerDay;
    }
    public void setRentalRatePerDay(int rentalRatePerDay) {
        this.rentalRatePerDay = rentalRatePerDay;
    }

    public double calculateRentalCost(int daysRented) {
        return 0.0;
    }
}




