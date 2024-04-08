import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLotSystem {

    public static void main(String args[]) throws InterruptedException {
        Vehicle twoVehicle = Vehicle.builder()
                .vehicleNumber("2222")
                .vehicleType(VehicleType.TWOWHEELER)
                .build();
        Vehicle fourVehicle = Vehicle.builder()
                .vehicleNumber("4444")
                .vehicleType(VehicleType.FOURWHEELER)
                .build();

        ParkingSlot twoSlot = ParkingSlot.builder()
                .isAvailable(true)
                .parkingSlotType(ParkingSlotType.TwoWheeler)
                .build();
        ParkingSlot fourSlot = ParkingSlot.builder()
                .isAvailable(true)
                .parkingSlotType(ParkingSlotType.FourWheeler)
                .build();

        Map<ParkingSlotType, List<ParkingSlot>> slotList = new HashMap<>();
        slotList.put(ParkingSlotType.TwoWheeler, List.of(twoSlot));
        slotList.put(ParkingSlotType.FourWheeler, List.of(fourSlot));

        ParkingFloor parkingFloor = new ParkingFloor("1st floor", slotList);
        ParkingLot parkingLot = new ParkingLot("NEW PARKING SLOT", List.of(parkingFloor));

        Ticket ticket = parkingLot.assignTicket(twoVehicle);
        Thread.sleep(10000);
        System.out.println(parkingLot.pay(ticket));

        Ticket ticket1 = parkingLot.assignTicket(fourVehicle);
        Thread.sleep(10000);
        System.out.println(parkingLot.pay(ticket1));

    }

}
