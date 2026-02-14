package com.ParkingLot;

public class AirportSecurity implements ParkingLotObserver{
    private boolean notified=false;
    @Override
    public void notifyFullyLot() {
        notified=true;
    }
    public boolean isNotified(){
        return notified;
    }
}
