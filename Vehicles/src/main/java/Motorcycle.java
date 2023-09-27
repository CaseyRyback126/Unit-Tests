public class Motorcycle extends Vehicle {
    public Motorcycle() {
        numWheels = 2;
        speed = 0;
    }

    @Override
    public void testDrive() {
        speed = 75;
    }

    @Override
    public void park() {
        speed = 0;
    }
}
