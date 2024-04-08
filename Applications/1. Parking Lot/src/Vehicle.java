import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class Vehicle {

    public String vehicleNumber;
    public VehicleType vehicleType;

}
