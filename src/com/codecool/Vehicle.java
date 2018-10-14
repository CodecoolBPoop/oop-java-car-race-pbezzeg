package com.codecool;

public abstract class Vehicle {

    protected int distanceTraveled = 0;
    protected int speed;
    protected String name;
    public abstract void moveForAnHour(Race race);
}
