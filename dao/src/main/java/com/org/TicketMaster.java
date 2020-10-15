package com.org;

import java.util.ArrayList;
import java.util.List;

public class TicketMaster {
    List<Ticket> ticketList;
    ParkingLotActions parkingLot;

    public TicketMaster() {
        this.ticketList = new ArrayList<Ticket>();
        this.parkingLot= new ParkingLot();
    }

    public Ticket parkCar(String carNum, String carType){
        ParkingSpace parkingSpace = parkingLot.availableParkingSpace();
        Ticket ticket = Ticket.createTicket(carNum, parkingSpace, carType);
        ticketList.add(ticket);
        return ticket;

    }

    private Ticket findTicket(int ticketNum){
        for(Ticket t: ticketList){
            if(t.getTicketId()==(ticketNum)){
                return t;
            }
        }
        return null;
    }
    public int unparkCar(int ticketNum){
        Ticket t = findTicket(ticketNum);
        //cal cost
        int cost = t.calcCost();
        //get the cost
        //unmark the parking space
        t.getParkingSpace().setStatus(ParkingSpaceType.AVAILABLE);
        return cost;
    }
}
