package com.org;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParkingLot implements ParkingLotActions{
    private String address;
    private List<ParkingSpace> parkingSpacesList;

    public ParkingLot() {
        parkingSpacesList = new ArrayList<ParkingSpace>();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ParkingSpace> getParkingSpacesList() {
        return parkingSpacesList;
    }

    public void setParkingSpacesList(List<ParkingSpace> parkingSpacesList) {
        this.parkingSpacesList = parkingSpacesList;
    }

    public ParkingSpace availableParkingSpace() {
        return null;
    }

    public boolean issueTicket(Ticket t) {
        return false;
    }

    public Car findCar(String id) {
        return null;
    }

    public ParkingSpace findParkingSpaceById(ParkingSpace p) {
        return null;
    }

    public int calcCost(Date d) {
        return 0;
    }

}
