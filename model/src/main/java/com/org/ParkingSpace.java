package com.org;

public class ParkingSpace {

    private int id;
    private Cartype carType;
    private int level;
    private int block;
    //private int subblock
    private ParkingSpaceType status;
    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public ParkingSpace() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cartype getCarType() {
        return carType;
    }

    public void setCarType(Cartype carType) {
        this.carType = carType;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public ParkingSpaceType getStatus() {
        return status;
    }

    public void setStatus(ParkingSpaceType status) {
        this.status = status;
    }
}
