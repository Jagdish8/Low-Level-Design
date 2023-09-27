import java.util.List;
import java.util.Map;

public class ParkingFloor {

    public String name;
    public Map<ParkingSlotType, List<ParkingSlot>> slots;

    public ParkingFloor(String name, Map<ParkingSlotType, List<ParkingSlot>> slots) {
        this.name = name;
        this.slots = slots;
    }

    public ParkingSlot getRelevantSlotAndPark(Vehicle vehicle) {
        VehicleType vehicleType = vehicle.vehicleType;
        ParkingSlotType parkingSlotType = getCorrectSlot(vehicleType);
        List<ParkingSlot> parkingSlots = slots.get(parkingSlotType);
        ParkingSlot slot = null;

        for(ParkingSlot parkingSlot: parkingSlots) {
            if(parkingSlot.isAvailable) {
                slot = parkingSlot;
                parkingSlot.addVehicle(vehicle);
                break;
            }
        }
        return slot;
    }

    private ParkingSlotType getCorrectSlot(VehicleType vehicleType) {
        if(vehicleType == VehicleType.TWOWHEELER) {
            return ParkingSlotType.TwoWheeler;
        } else {
            return ParkingSlotType.FourWheeler;
        }
    }

}
