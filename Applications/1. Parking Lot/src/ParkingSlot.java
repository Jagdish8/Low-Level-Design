import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class ParkingSlot {

    public String name;
    public Boolean isAvailable;
    public Vehicle vehicle;
    public ParkingSlotType parkingSlotType;

    public void addVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        isAvailable = false;
    }

    public void removeVehicle() {
        vehicle = null;
        isAvailable = true;
    }

}
