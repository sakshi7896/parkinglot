package com.org;

import java.util.Date;

public class Ticket {
    private int ticketId;
    private Car car;
    private ParkingSpace parkingSpace;
    private Date date;
    private Driver driver;

    public Ticket() {

    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public ParkingSpace getParkingSpace() {
        return parkingSpace;
    }

    public void setParkingSpace(ParkingSpace parkingSpace) {
        this.parkingSpace = parkingSpace;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
