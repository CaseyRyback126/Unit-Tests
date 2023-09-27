public class Car extends Vehicle {

    public Car() {
        numWheels = 4;
        speed = 0;
    }


    @Override
    public void testDrive() {
        speed = 60;
    }

    @Override
    public void park() {
        speed = 0;
    }
}
