import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VehicleTest {
    @Test
    void testCarIsInstanceOfVehicle() {
        Vehicle car = new Car();
        Assertions.assertTrue(car instanceof Vehicle);
    }

    @Test
    void testCarHasFourWheels() {
        Vehicle car = new Car();
        Assertions.assertEquals(4, car.getNumWheels());
    }

    @Test
    void testMotorcycleHasTwoWheels() {
        Vehicle moto = new Motorcycle();
        Assertions.assertEquals(2, moto.getNumWheels());
    }

    @Test
    void testCarSpeedDuringTestDrive() {
        Vehicle car = new Car();
        car.testDrive();
        Assertions.assertEquals(60, car.getSpeed());
    }

    @Test
    void testMotoSpeedDuringTestDrive() {
        Vehicle moto = new Motorcycle();
        moto.testDrive();
        Assertions.assertEquals(75, moto.getSpeed());
    }

    @Test
    void testCarSpeedAfterPark() {
        Vehicle car = new Car();
        car.testDrive();
        car.park();
        Assertions.assertEquals(0, car.getSpeed());
    }

    @Test
    void testMotoSpeedAfterPark() {
        Vehicle moto = new Motorcycle();
        moto.testDrive();
        moto.park();
        Assertions.assertEquals(0, moto.getSpeed());
    }
}
