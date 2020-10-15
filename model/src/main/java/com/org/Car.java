package com.org;

public class Car {

    private String id; //It can be the number plate as that is unique
    private Cartype cartype;
    private Driver driver;
    //private int weight;

    public Car() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cartype getCartype() {
        return cartype;
    }

    public void setCartype(Cartype cartype) {
        this.cartype = cartype;
    }
}
