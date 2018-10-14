package com.codecool;
import java.util.Random;
public class Car extends Vehicle{

    @Override
    public void moveForAnHour(Race race){
        if(race.isThereABrokenTruck()){
            distanceTraveled += 75;
        }
        distanceTraveled += speed;
    }
    public Car() {
        Random rand = new Random();
        speed = rand.nextInt(30) + 80;
        name = "Lazy to randomise Car";
    }
}
