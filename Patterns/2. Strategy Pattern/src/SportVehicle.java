import strategy.DriveStrategy;
import strategy.SportDriveStrategy;

public class SportVehicle extends Vehicle{

    SportVehicle() {
        super(new SportDriveStrategy());
    }

}
