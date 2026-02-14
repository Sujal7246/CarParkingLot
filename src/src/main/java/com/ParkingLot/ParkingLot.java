package com.ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private int capacity;
    private List<Car> parkedCars=new ArrayList<>();
    private List<ParkingLotObserver> observers = new ArrayList<>();

    public void registerObserver(ParkingLotObserver observer) {
        observers.add(observer);
    }


    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }
    public boolean park(Car car){
        if (parkedCars.size() < capacity) {
            parkedCars.add(car);

            if (parkedCars.size() == capacity) {
                notifyObserversLotFull();
            }
            return true;
        }
        return false;
    }
    public boolean unpark(Car car) {
        if (parkedCars.contains(car)) {
            parkedCars.remove(car);
            return true;
        }
        return false;
    }

    private void notifyObserversLotFull() {
        for (ParkingLotObserver observer : observers) {
            observer.notifyFullLot();
        }
    }


}

