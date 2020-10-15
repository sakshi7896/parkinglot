package com.org;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParkingLot implements ParkingLotActions{
    private String address;
    private List<ParkingSpace> parkingSpacesList;
    private List<Ticket> tickets;

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
        for(ParkingSpace p: parkingSpacesList){
            if(p.getStatus().equals(ParkingSpaceType.AVAILABLE)){
                return p;
            }
        }
        return null;
    }

    public boolean issueTicket(String carNum, String carType) throws Exception{
        Car c = new Car();
        c.setId(carNum);
        try {
            c.setCartype(Cartype.valueOf(carType));
        }catch(Exception e){
            throw new Exception(e);
        }
        ParkingSpace p = availableParkingSpace();
        if(null!=p){
            p.setCar(c);
            p.setStatus(ParkingSpaceType.UNAVAILABLE);
            return true;
        }
        else{
            return false;
        }

    }

    public ParkingSpace findParkingSpaceByCar(String id) {
        for(ParkingSpace p: parkingSpacesList){
            if(p.getStatus().equals(ParkingSpaceType.UNAVAILABLE) && null!=p.getCar() && id.equals(p.getCar().getId())){
                return p;
            }
        }
        return null;
    }

    public ParkingSpace findParkingSpaceById(ParkingSpace p) { // not required anymore
        return null;
    }

    public int calcCost(Date d, String carNum) {
        Car car= findCar(carNum);

        return 0;
    }

}
