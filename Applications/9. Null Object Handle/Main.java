public class Main {

    public static void main(String args[]){

        Vehicle vehicle = VehicleFactory.getVehicleObject("Bike");
        printVehicleDetails(vehicle);
    }

    private static void printVehicleDetails(Vehicle vehicle) {
        // earlier code
//        if(vehicle != null) {
//            System.out.println("Seating Capacity: " + vehicle.getSeatingCapacity());
//            System.out.println("Fuel Tank Capacity: " + vehicle.getTankCapacity());
//        }

        System.out.println("Seating Capacity: " + vehicle.getSeatingCapacity());
        System.out.println("Fuel Tank Capacity: " + vehicle.getTankCapacity());
    }

}
