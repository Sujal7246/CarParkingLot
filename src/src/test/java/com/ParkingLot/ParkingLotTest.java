package com.ParkingLot;
import com.ParkingLot.Car;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class ParkingLotTest {
    @Test
    void shouldParkCar_WhenSpaceAvailable(){
        ParkingLot lot=new ParkingLot(2);
        Car car=new Car("PB-13");
        boolean result=lot.park(car);
        assertTrue(result);
    }
    @Test
    void shouldUnparkCar(){
        ParkingLot lot=new ParkingLot(2);
        Car car=new Car("PB-14");
        lot.park(car);
        boolean result=lot.unpark(car);
        assertTrue(result);
    }

}
