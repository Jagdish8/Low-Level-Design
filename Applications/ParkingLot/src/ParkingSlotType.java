public enum ParkingSlotType {

    TwoWheeler{
        public double getCharge(long duration) {
            return 0.05*duration;
        }
    },
    FourWheeler{
        public double getCharge(long duration) {
            return 0.1*duration;
        }
    };

    public abstract double getCharge(long duration);
}
