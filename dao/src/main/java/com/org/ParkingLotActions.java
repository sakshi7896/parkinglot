package com.org;

import java.util.Date;

public interface ParkingLotActions {

    public ParkingSpace availableParkingSpace();
    public boolean issueTicket(Ticket t);
    public Car findCar(String id);
    public ParkingSpace findParkingSpaceById(ParkingSpace p);
    public int calcCost(Date d);



}
