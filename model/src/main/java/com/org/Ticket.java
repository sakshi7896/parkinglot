package com.org;

import java.util.Date;

public class Ticket {
    private static final int COST=1;
    private static int ticketIdTillNow=0;
    private int ticketId;
    private Car car;
    private ParkingSpace parkingSpace;
    private Date date;
//    private Driver driver;

    public Ticket() {

    }

    public static Ticket createTicket(String carNum, ParkingSpace p, String carType){
        Car car= new Car();
        car.setCartype(Cartype.valueOf(carType));
        car.setId(carNum);
        Ticket t= new Ticket();
        t.setCar(car);
        p.setStatus(ParkingSpaceType.UNAVAILABLE);
        t.setParkingSpace(p);
        t.setDate(new Date());
        t.setTicketId(ticketIdTillNow++);
        return t;
    }
    public int calcCost(){
        Date d= new Date();
        int timeDiff= this.getDate().getHours()-d.getHours()+1;
        return COST*timeDiff;

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
