import strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy strategy;

    Vehicle(DriveStrategy driveStrategy) {
        this.strategy = driveStrategy;
    }

    public void drive() {
        strategy.drive();
    }
}
