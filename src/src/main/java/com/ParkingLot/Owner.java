package com.ParkingLot;

public class Owner implements ParkingLotObserver{
    private boolean notified=false;
    @Override
    public void notifyFullLot() {
        notified=true;
    }
    public boolean isNotified(){
    return notified;
    }
}
