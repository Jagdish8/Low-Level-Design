import java.util.List;

public class ParkingLot {

    public String name;
    public List<ParkingFloor> floorList;
    public static ParkingLot parkingLot;

    public ParkingLot(String name, List<ParkingFloor> parkingFloorList) {
        this.name = name;
        this.floorList = parkingFloorList;
    }

    public static ParkingLot getInstance(String name, List<ParkingFloor> parkingFloorList) {
        if(parkingLot == null) {
            return new ParkingLot(name, parkingFloorList);
        }
        return parkingLot;
    }

    public void addFloor(ParkingFloor parkingFloor) {
        floorList.add(parkingFloor);
    }

    public void removeFloor(ParkingFloor parkingFloor) {
        floorList.remove(parkingFloor);
    }

    public Ticket assignTicket(Vehicle vehicle) {
        ParkingSlot parkingSlot = getParkingSlotForVehicleAndPark(vehicle);
        if(parkingSlot == null) {
            return null;
        }
        Ticket ticket = createTicketForSlot(parkingSlot, vehicle);
        return ticket;
    }

    public double pay(Ticket ticket) {
        long endTime = System.currentTimeMillis();
        ticket.getParkingSlot().removeVehicle();
        long duration = endTime - ticket.getStartTime();
        double price = (ticket.getParkingSlot().parkingSlotType.getCharge(duration))/1000;
        return price;
    }

    private ParkingSlot getParkingSlotForVehicleAndPark(Vehicle vehicle) {
        ParkingSlot parkingSlot = null;
        for(ParkingFloor parkingFloor: floorList) {
            parkingSlot = parkingFloor.getRelevantSlotAndPark(vehicle);
            if(parkingSlot != null) {
                break;
            }
        }
        return parkingSlot;
    }

    private Ticket createTicketForSlot(ParkingSlot parkingSlot, Vehicle vehicle) {
        return Ticket.createTicker(vehicle, parkingSlot);
    }

}
