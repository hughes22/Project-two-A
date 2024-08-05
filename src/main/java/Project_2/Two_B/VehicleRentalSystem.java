package Project_2.Two_B;

public class VehicleRentalSystem {
        public static void main(String[] args) {
            Vehicle[] vehicles = {
                    new Car("Toyota Camry","WR.23 24",500,4),
                    new Bike("Bike 1","WR15",100,true),
                    new Truck("Track 1","WR 78 34",300,1000),
            };

            for (Vehicle vehicle : vehicles)
                System.out.println(vehicle.getVehicleType() +" " +"(License: " + vehicle.getLicenseNumber()+ "): Ghs: " +" " + vehicle.getRentalRatePerDay()+" "+ " Cost "+" "+vehicle.calculateRentalCost(2));
            }
        }


