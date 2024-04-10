public class VehicleFactory {
    static Vehicle getVehicleObject(String name) {
        if("CAR".equals(name)) {
            return new Car();
        }
//        earlier we used to return null here
//        return null
        return new NullObject();
    }
}
