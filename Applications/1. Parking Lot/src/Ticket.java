import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
public class Ticket {

    public String ticketNumber;
    public long startTime;
    public LocalDateTime endTime;
    public Vehicle vehicle;
    public ParkingSlot parkingSlot;

    public static Ticket createTicker(Vehicle vehicle, ParkingSlot parkingSlot) {
        return Ticket.builder()
                .startTime(System.currentTimeMillis())
                .parkingSlot(parkingSlot)
                .ticketNumber("123")
                .vehicle(vehicle)
                .build();
    }
}
