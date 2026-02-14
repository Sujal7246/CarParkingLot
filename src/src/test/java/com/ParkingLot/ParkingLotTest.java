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
    @Test
    void shouldNotifyOwnerWhenParkingLotBecomesFull(){
        ParkingLot lot=new ParkingLot(1);
        Owner owner=new Owner();
        lot.registerObserver(owner);
        Car car=new Car("PB-13");
        lot.park(car);
        assertTrue(owner.isNotified());
    }
    @Test
    void shouldNotifyAirportOfficerWhenParkingLotBecomesFull() {
        ParkingLot lot=new ParkingLot(1);
        AirportSecurity airportSecurity=new AirportSecurity();
        lot.registerObserver(airportSecurity);
        Car car=new Car("PB-13");
        lot.park(car);
        assertTrue(airportSecurity.isNotified());
    }
}
